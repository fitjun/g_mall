package com.jun.gmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jun.gmall.common.utils.PageUtils;
import com.jun.gmall.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author jun
 * @email fitjun@foxmail.com
 * @date 2025-07-15 10:59:26
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

