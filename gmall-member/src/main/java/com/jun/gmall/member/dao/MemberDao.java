package com.jun.gmall.member.dao;

import com.jun.gmall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author jun
 * @email fitjun@foxmail.com
 * @date 2025-07-15 11:34:01
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
