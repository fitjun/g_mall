package com.jun.gmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jun.gmall.common.utils.PageUtils;
import com.jun.gmall.product.entity.ProductAttrValueEntity;

import java.util.Map;

/**
 * spu属性值
 *
 * @author jun
 * @email fitjun@foxmail.com
 * @date 2025-07-15 10:59:26
 */
public interface ProductAttrValueService extends IService<ProductAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

