package com.jun.gmall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jun.common.utils.PageUtils;
import com.jun.gmall.member.entity.MemberCollectSpuEntity;

import java.util.Map;

/**
 * 会员收藏的商品
 *
 * @author jun
 * @email fitjun@foxmail.com
 * @date 2025-07-15 11:34:01
 */
public interface MemberCollectSpuService extends IService<MemberCollectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

