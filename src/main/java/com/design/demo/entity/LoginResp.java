package com.design.demo.entity;

import lombok.Data;

/**
 * @author eniac555
 * @date 2023/5/21
 * @description: 登录返回值
 */

@Data
public class LoginResp {
    private Integer userId;
    private String userName;
    private String roleCode;
    private String token; //jwt令牌
    private boolean success;
}
