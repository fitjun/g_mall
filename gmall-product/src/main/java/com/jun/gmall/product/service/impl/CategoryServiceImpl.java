package com.jun.gmall.product.service.impl;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jun.gmall.common.utils.PageUtils;
import com.jun.gmall.common.utils.Query;

import com.jun.gmall.product.dao.CategoryDao;
import com.jun.gmall.product.entity.CategoryEntity;
import com.jun.gmall.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> listWithTree() {
        //找出所有
        List<CategoryEntity> entities = baseMapper.selectList(null);

        //找子菜单，并归到父菜单下
        List<CategoryEntity> collect = entities.stream().filter(
                categoryEntity ->categoryEntity.getParentCid() == 0
        ).map((categoryEntity) -> {
            categoryEntity.setChildren(ChildrenList(categoryEntity,entities));
            return categoryEntity;
        }).sorted((menu1,menu2)->{
            return (menu1.getSort()==null?0:menu1.getSort()) - (menu2.getSort()==null?0:menu2.getSort());
        }).collect(Collectors.toList());
        return collect;
    }

    List<CategoryEntity> ChildrenList(CategoryEntity root , List<CategoryEntity> all){
        List<CategoryEntity> children = all.stream().filter(categoryEntity ->
                Objects.equals(categoryEntity.getParentCid(), root.getCatId())
        ).map((categoryEntity) -> {
            categoryEntity.setChildren(ChildrenList(categoryEntity, all));
            return categoryEntity;
        }).sorted((menu1, menu2) -> {
            return (menu1.getSort() == null ? 0 : menu1.getSort()) - (menu2.getSort() == null ? 0 : menu2.getSort());
        }).collect(Collectors.toList());
        return children;
    }

}