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
 * @Description :Sokectʵ����
 * @author jzy
 *
 */
@ServerEndpoint(value = "/websocket")
@Component
public class MySocket {

	private static CopyOnWriteArraySet<MySocket> webSokectSet=new CopyOnWriteArraySet<MySocket>();
	private Session session;
	
	/**
	 * ����������
	 */
	@OnOpen
	public void onopen(Session session) {
		this.session=session;
		webSokectSet.add(this);
		System.out.println("�����˼��룡��ǰ����Ϊ"+webSokectSet.size());
		this.session.getAsyncRemote().sendText("��ϲ�������ϣ���ǰ����Ϊ"+webSokectSet.size());
	}
	
	/**
	 * �ر�����
	 */
	@OnClose
	public void onClose() {
		webSokectSet.remove(this);
		System.out.println("��һ�����ӹرգ���ǰ������Ϊ"+webSokectSet.size());
	}
	/**
	 * Ⱥ����Ϣ
	 */
	@OnMessage
	public void onMessage(String message,Session session) {
		System.out.println("���Կͻ��˵���Ϣ"+message);
		
	}
	
	
	/**
	 * ��������ʱ����
	 */
	
	@OnError
	public void onError(Session session,Throwable error) {
		System.out.println("��������");
		error.printStackTrace();
	}
	/**
	 * �Զ�Ⱥ����Ϣ
	 * @throws IOException 
	 */
	public void broadCast(String message) throws IOException {
		for(MySocket m:webSokectSet) {
			m.session.getBasicRemote().sendText(message);
		}
	}
	
}
