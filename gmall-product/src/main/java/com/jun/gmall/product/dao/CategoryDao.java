package com.jun.gmall.product.dao;

import com.jun.gmall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author jun
 * @email fitjun@foxmail.com
 * @date 2025-07-15 10:59:26
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
