package com.jun.gmall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jun.gmall.common.utils.PageUtils;
import com.jun.gmall.ware.entity.WareOrderTaskEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author jun
 * @email fitjun@foxmail.com
 * @date 2025-07-15 11:46:23
 */
public interface WareOrderTaskService extends IService<WareOrderTaskEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

