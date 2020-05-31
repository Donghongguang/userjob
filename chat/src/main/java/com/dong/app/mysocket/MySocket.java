package com.dong.app.mysocket;

import java.io.IOException;
import java.util.concurrent.CopyOnWriteArraySet;

import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

import org.springframework.stereotype.Component;

import ch.qos.logback.core.db.dialect.MySQLDialect;

/**
 * @Date2020/05/30
 * @Description :Sokect实现类
 * @author jzy
 *
 */
@ServerEndpoint(value = "/websocket")
@Component
public class MySocket {

	private static CopyOnWriteArraySet<MySocket> webSokectSet=new CopyOnWriteArraySet<MySocket>();
	private Session session;
	
	/**
	 * 连接聊天室
	 */
	@OnOpen
	public void onopen(Session session) {
		this.session=session;
		webSokectSet.add(this);
		System.out.println("有新人加入！当前人数为"+webSokectSet.size());
		this.session.getAsyncRemote().sendText("恭喜您连接上，当前人数为"+webSokectSet.size());
	}
	
	/**
	 * 关闭连接
	 */
	@OnClose
	public void onClose() {
		webSokectSet.remove(this);
		System.out.println("有一个连接关闭，当前的人数为"+webSokectSet.size());
	}
	/**
	 * 群发消息
	 */
	@OnMessage
	public void onMessage(String message,Session session) {
		System.out.println("来自客户端的消息"+message);
		
	}
	
	
	/**
	 * 发生错误时调用
	 */
	
	@OnError
	public void onError(Session session,Throwable error) {
		System.out.println("发生错误");
		error.printStackTrace();
	}
	/**
	 * 自定群发消息
	 * @throws IOException 
	 */
	public void broadCast(String message) throws IOException {
		for(MySocket m:webSokectSet) {
			m.session.getBasicRemote().sendText(message);
		}
	}
	
}
