package com.mybatis.plus;

import com.alibaba.fastjson.JSONObject;
import com.mybatis.plus.bootstrap.MybatisPlusApplication;
import com.mybatis.plus.mapper.SysUserMapper;
import com.mybatis.plus.model.SysUser;
import com.mybatis.plus.service.ISysUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @author chenhaowen
 * @Description:
 * @date 2020/8/11 11:44 AM
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = MybatisPlusApplication.class)
public class UserTest {

    @Resource
    private ISysUserService sysUserService;

    @Resource
    private SysUserMapper sysUserMapper;

    @Test
    public void test1() {
        SysUser sysUser = sysUserMapper.selectById(1);
        System.out.println(JSONObject.toJSONString(sysUser));
    }


}
