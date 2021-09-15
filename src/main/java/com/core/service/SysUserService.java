package com.core.service;/**
 * @author lishaolong
 * @Date 2021/9/9
 */


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.core.entity.SysUser;
import com.core.modle.PageObject;
import com.core.vo.LogInUserVo;


/**
 * @author li
 * @date 2021/9/9
 */
public interface SysUserService extends IService<SysUser> {

    LogInUserVo logIn(SysUser sysUser);

    IPage<SysUser> userList(PageObject<SysUser> pageObject);
}
