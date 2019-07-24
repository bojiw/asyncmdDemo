/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.asyncmdDemo.web;

import com.alibaba.fastjson.JSON;
import com.asyncmd.manager.AsynExecuterFacade;
import com.asyncmdDemo.asyn.asynbiz.SmsBiz;
import com.asyncmdDemo.asyn.asyncmd.SmsAsynCmd;
import com.asyncmdDemo.server.AsynCmdServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * 发送短信接口
 * @author wangwendi
 * @version $Id: SmsController.java, v 0.1 2019年07月23日 下午8:55 wangwendi Exp $
 */
@Controller
@RequestMapping("/asyn")
public class SmsController {


    @Autowired
    private AsynCmdServer asynCmdServer;


    @RequestMapping(value = "/sendsms")
    public String sendsms(List<String> mobiles, String content, String requestId) {
        //效验手机号
        //效验手机内容
        SmsBiz smsBiz = new SmsBiz();
        smsBiz.setContent(content);
        smsBiz.setMobile(mobiles);
        //唯一业务id 全局唯一
        String bizId = "sms" + JSON.toJSONString(mobiles) + requestId;
        asynCmdServer.notify(smsBiz,bizId,SmsAsynCmd.class);
        return "ok";
    }

}