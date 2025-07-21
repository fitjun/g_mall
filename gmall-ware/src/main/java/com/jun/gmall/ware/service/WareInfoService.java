package com.jun.gmall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jun.gmall.common.utils.PageUtils;
import com.jun.gmall.ware.entity.WareInfoEntity;

import java.util.Map;

/**
 * 仓库信息
 *
 * @author jun
 * @email fitjun@foxmail.com
 * @date 2025-07-15 11:46:23
 */
public interface WareInfoService extends IService<WareInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

