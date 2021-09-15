package com.core.enumer;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @author li
 * @date 2021/9/12
 */
@Getter
@NoArgsConstructor
@AllArgsConstructor
public enum ResultEnum {
    LONGIN_ADMIN_ACCOUNT_CANNOT_BE_NULL(404,"账号不存在"),
    TOKEN_NOT_NULL(1400,"token为空"),
    TOKEN_INVALIDATION(1401,"token失效"),
    PASSWORD_MISTAKE(405,"密码错误"),
    NULL_POINTER_EXCEPTION(1406,"对象空异常"),
    SYSTEM_ERROR(500,"系统错误"),
    ;

    private Integer code;
    private String msg;

}
