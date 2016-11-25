package com.silentpeople.socket.multithread;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class chat extends Thread {

	private Socket connSock;

	public chat(Socket connSock) {
		this.connSock = connSock;
	}

	public void run() {
		try{
			OutputStream sender = connSock.getOutputStream();
			String sendMsg = "Welcome!!"; // Ŭ���̾�Ʈ�� ���� ȯ�� �޽���
			sender.write(sendMsg.getBytes()); // Ŭ���̾�Ʈ�� ȯ�� �޽��� �����ϱ�
			System.out.println("send data: " + sendMsg); // Ŭ���̾�Ʈ�� ���� ������ ȭ�鿡 ����ϱ�

			InputStream receiver = connSock.getInputStream();
			byte[] recvBuf = new byte[100]; // Ŭ���̾�Ʈ�κ��� ���ŵ� �����͸� ���� ����(����)
			String recvMsg = new String(recvBuf); // byte�迭�� String���� ��ȯ�ϴ� �۾�
			System.out.println("receive data: " + recvMsg); // ������ ������ ȭ�鿡 ����ϱ�
		
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}

}
