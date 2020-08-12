package com.mybatis.plus.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mybatis.plus.dao.SysUserMapper;
import com.mybatis.plus.model.SysUser;
import com.mybatis.plus.service.ISysUserService;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author chenhaowen
 * @since 2020-08-11
 */
@Service
@Validated
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements ISysUserService {

}
