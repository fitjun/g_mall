package com.jun.gmall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jun.gmall.common.utils.PageUtils;
import com.jun.gmall.member.entity.MemberReceiveAddressEntity;

import java.util.Map;

/**
 * 会员收货地址
 *
 * @author jun
 * @email fitjun@foxmail.com
 * @date 2025-07-15 11:34:01
 */
public interface MemberReceiveAddressService extends IService<MemberReceiveAddressEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

