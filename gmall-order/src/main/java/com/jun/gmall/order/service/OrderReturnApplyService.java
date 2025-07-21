package com.jun.gmall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jun.gmall.common.utils.PageUtils;
import com.jun.gmall.order.entity.OrderReturnApplyEntity;

import java.util.Map;

/**
 * 订单退货申请
 *
 * @author jun
 * @email fitjun@foxmail.com
 * @date 2025-07-15 11:38:47
 */
public interface OrderReturnApplyService extends IService<OrderReturnApplyEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

