# asyncmdDemo
异步命令组件demo

需要根据sql文件夹里的sql语句创建表
然后修改jdbc.properties里的数据库url和用户名密码

组件相关配置都在 spring-service.xml文件中

三个测试功能
- SmsController 接收发送短信请求异步发送
- GiveRewardController 接收赠送奖励请求 异步赠送奖励
- CouponController 定时赠送指定用户一批优惠券

com.asyncmdDemo.asyn.asynbiz 存放异步命令业务对象
com.asyncmdDemo.asyn.asyncmd 存放异步命令对象
com.asyncmdDemo.asyn.asynexecuter 存放异步命令执行器
com.asyncmdDemo.asyn.callback 执行器执行异常回调

SmsAsynCmd异步命令对象里设置里一些异步命令个性化的设置
