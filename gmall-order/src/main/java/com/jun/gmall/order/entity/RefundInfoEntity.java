package com.jun.gmall.order.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 退款信息
 * 
 * @author jun
 * @email fitjun@foxmail.com
 * @date 2025-07-15 11:38:47
 */
@Data
@TableName("oms_refund_info")
public class RefundInfoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * 退款的订单
	 */
	private Long orderReturnId;
	/**
	 * 退款金额
	 */
	private BigDecimal refund;
	/**
	 * 退款交易流水号
	 */
	private String refundSn;
	/**
	 * 退款状态
	 */
	private Integer refundStatus;
	/**
	 * 退款渠道[1-支付宝，2-微信，3-银联，4-汇款]
	 */
	private Integer refundChannel;
	/**
	 * 
	 */
	private String refundContent;

}
