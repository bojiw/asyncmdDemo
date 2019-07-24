/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.asyncmdDemo.web;

import com.asyncmd.manager.AsynExecuterFacade;
import com.asyncmdDemo.asyn.asynbiz.GiveRewardBiz;
import com.asyncmdDemo.asyn.asyncmd.GiveRewardAsynCmd;
import com.asyncmdDemo.server.AsynCmdServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 赠送奖励
 * @author wangwendi
 * @version $Id: GiveRewardController.java, v 0.1 2019年07月23日 下午9:46 wangwendi Exp $
 */
@Controller
@RequestMapping("/asyn")
public class GiveRewardController {


    @Autowired
    private AsynCmdServer asynCmdServer;


    @RequestMapping(value = "/givereward")
    public String sendsms(Integer integral,Integer gold,String actId,String userId) {
        GiveRewardBiz smsBiz = new GiveRewardBiz();
        smsBiz.setGold(gold);
        smsBiz.setIntegral(integral);
        //唯一业务id 根据业务来定义 需要全局唯一
        String bizId = "give" + userId + actId + System.currentTimeMillis();
        asynCmdServer.notify(smsBiz,bizId,GiveRewardAsynCmd.class);
        return "ok";
    }


}