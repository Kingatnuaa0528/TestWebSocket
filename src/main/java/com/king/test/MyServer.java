package com.king.test;

import javax.websocket.OnMessage;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint("/websocket/demo")//这里是一个类注解，告诉虚拟机该类被注解为一个WebSocket端点
public class MyServer {

    @OnMessage      //这里是方法注解，在接收到客户端的消息时触发
    public String echo(String clientMessage){
        return "收到来自客户端的消息：" + clientMessage;
    }
}