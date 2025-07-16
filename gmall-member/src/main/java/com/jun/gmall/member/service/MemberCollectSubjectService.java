package com.jun.gmall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jun.common.utils.PageUtils;
import com.jun.gmall.member.entity.MemberCollectSubjectEntity;

import java.util.Map;

/**
 * 会员收藏的专题活动
 *
 * @author jun
 * @email fitjun@foxmail.com
 * @date 2025-07-15 11:34:01
 */
public interface MemberCollectSubjectService extends IService<MemberCollectSubjectEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

