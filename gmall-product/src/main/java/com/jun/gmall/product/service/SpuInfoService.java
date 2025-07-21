package com.jun.gmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jun.gmall.common.utils.PageUtils;
import com.jun.gmall.product.entity.SpuInfoEntity;

import java.util.Map;

/**
 * 
 *
 * @author jun
 * @email fitjun@foxmail.com
 * @date 2025-07-15 10:59:26
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

