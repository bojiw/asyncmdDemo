/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.asyncmdDemo.asyn.asynexecuter;

import com.asyncmd.model.AbstractAsynExecuter;
import com.asyncmdDemo.asyn.asynbiz.GiveRewardBiz;
import com.asyncmdDemo.asyn.asyncmd.GiveRewardAsynCmd;
import org.springframework.stereotype.Service;

/**
 * push通知处理器
 * @author wangwendi
 * @version $Id: GiveRewardPushExecuter.java, v 0.1 2019年07月23日 下午11:07 wangwendi Exp $
 */
@Service
public class GiveRewardPushExecuter extends AbstractAsynExecuter<GiveRewardAsynCmd> {

    /**
     * 只有赠送成功才会进行通知 所以设置push通知处理器最后一个执行
     * @return
     */
    @Override
    protected int getSort() {
        return 90;
    }

    @Override
    protected void executer(GiveRewardAsynCmd cmd) {
        GiveRewardBiz giveRewardBiz = cmd.getContent();
        if (giveRewardBiz.getGold() != null){
            System.out.println("赠送金币成功push通知");
        }
        if (giveRewardBiz.getIntegral() != null){
            System.out.println("赠送积分成功push通知");
        }
    }
}