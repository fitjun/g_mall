package com.jun.gmall.order.dao;

import com.jun.gmall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author jun
 * @email fitjun@foxmail.com
 * @date 2025-07-15 11:38:47
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
