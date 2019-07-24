/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.asyncmdDemo.asyn.asynbiz;

import com.asyncmd.model.AsynBizObject;

import java.util.List;

/**
 * 短信业务模型
 * @author wangwendi
 * @version $Id: SmsBiz.java, v 0.1 2019年07月23日 下午8:58 wangwendi Exp $
 */
public class SmsBiz extends AsynBizObject {
    /**
     * 手机号
     */
    private List<String> mobile;
    /**
     * 短信内容
     */
    private String content;

    public List<String> getMobile() {
        return mobile;
    }

    public void setMobile(List<String> mobile) {
        this.mobile = mobile;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}