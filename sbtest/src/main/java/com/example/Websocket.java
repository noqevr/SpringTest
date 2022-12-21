package com.example;




import java.util.ArrayList;
import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;
import org.springframework.stereotype.Component;

@Component
@ServerEndpoint("/websocket")
public class Websocket {

    /**
     * ������ ������ ��� ArrayList
     */
    private static ArrayList<Session> sessionList = new ArrayList<Session>();

    
    /**
     * ������ ����� ���� �����ϴ� ��� ȣ��
     */
    @OnOpen
    public void handleOpen(Session session) {
        if (session != null) {
            String sessionId = session.getId();
            
            System.out.println("client is connected. sessionId == [" + sessionId + "]");
            sessionList.add(session);
            
            // ������ ���� �����Ǿ� �ִ� ��� ����ڿ��� �޽��� ����
            sendMessageToAll("***** [USER-" + sessionId + "] is connected. *****");
        }
       
    }
    

    /**
     * ������ �޽���(From Client) �����ϴ� ��� ȣ��
     */
    @OnMessage
    public String handleMessage(String message, Session session) {
        if (session != null) {
            String sessionId = session.getId();
            System.out.println("message is arrived. sessionId == [" + sessionId + "] / message == [" + message + "]");

            // ������ ���� �����Ǿ� �ִ� ��� ����ڿ��� �޽��� ����
            sendMessageToAll("[USER-" + sessionId + "] " + message);
        }

        return null;
    }
    

    /**
     * ������ ����� ���� �����ϴ� ��� ȣ��
     */
    @OnClose
    public void handleClose(Session session) {
        if (session != null) {
            String sessionId = session.getId();
            System.out.println("client is disconnected. sessionId == [" + sessionId + "]");
            
            // ������ ���� �����Ǿ� �ִ� ��� ����ڿ��� �޽��� ����
            sendMessageToAll("***** [USER-" + sessionId + "] is disconnected. *****");
        }
    }

    
    /**
     * ������ ���� �߻��ϴ� ��� ȣ��
     */
    @OnError
    public void handleError(Throwable t) {
        t.printStackTrace();
    }
    
    
    /**
     * ������ ���� �����Ǿ� �ִ� ��� ����ڿ��� �޽��� ����
     */
    private boolean sendMessageToAll(String message) {
        if (sessionList == null) {
            return false;
        }

        int sessionCount = sessionList.size();
        if (sessionCount < 1) {
            return false;
        }

        Session singleSession = null;

        for (int i = 0; i < sessionCount; i++) {
            singleSession = sessionList.get(i);
            if (singleSession == null) {
                continue;
            }

            if (!singleSession.isOpen()) {
                continue;
            }

            sessionList.get(i).getAsyncRemote().sendText(message);
        }

        return true;
    }
}
