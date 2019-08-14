package com.asyncmdDemo.asyn.asynexecuter;

import com.asyncmd.model.AbstractAsynExecuter;
import com.asyncmdDemo.asyn.asynbiz.OrderModifyBiz;
import com.asyncmdDemo.asyn.asyncmd.OrderModifyAsynCmd;
import org.springframework.stereotype.Service;

/**
 * @author wangwendi
 * @date 2019/8/14
 */
@Service
public class OrderModifyExecuter extends AbstractAsynExecuter<OrderModifyAsynCmd> {
    @Override
    protected void executer(OrderModifyAsynCmd cmd) {
        OrderModifyBiz content = cmd.getContent();
        System.out.println("处理订单修改业务");
    }
}