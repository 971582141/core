package com.core.mapper;/**
 * @author lishaolong
 * @Date 2021/9/12
 */

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.core.entity.SysRouter;
import org.apache.ibatis.annotations.Select;

import java.util.List;


/**
 * @author li
 * @date 2021/9/12
 */
public interface SysRouterMapper extends BaseMapper<SysRouter> {

    @Select("select a.id,\n" +
            "       code,\n" +
            "       name,\n" +
            "       url,\n" +
            "       p_id,\n" +
            "       level,\n" +
            "       sort,\n" +
            "       type,\n" +
            "       jump,\n" +
            "       create_date,\n" +
            "       update_date\n" +
            "from sys_router as a left join sys_router_role as b on a.id = b.router_id\n" +
            "where b.role_id = #{roleId}")
    List<SysRouter> sysRoutersByRoleId(Integer roleId);
}
