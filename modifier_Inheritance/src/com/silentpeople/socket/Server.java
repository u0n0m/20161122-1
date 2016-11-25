package com.silentpeople.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ServerSocket servSock = new ServerSocket();//������ ���� ����
			InetSocketAddress servAddr = new InetSocketAddress("127.0.0.1", 1818);//������ IP�ּҿ� ��Ʈ��ȣ�� ����
			servSock.bind(servAddr); //���Ͽ� ������ ������ �ּ�(IP,Port)�� ����Ѵ�.
			
			Socket cliSock1 = servSock.accept();//������������ ã�ƿ� ���� �� ���� �������� ���������
			
			OutputStream sender = cliSock1.getOutputStream();
			String sendMsg = "Welcome!!"; // Ŭ���̾�Ʈ�� ���� ȯ�� �޽���
			sender.write(sendMsg.getBytes()); // Ŭ���̾�Ʈ�� ȯ�� �޽��� �����ϱ�
			System.out.println("send data: " + sendMsg); //Ŭ���̾�Ʈ�� ���� ������ ȭ�鿡 ����ϱ�

			InputStream receiver = cliSock1.getInputStream();
			byte [] recvBuf = new byte[100]; //Ŭ���̾�Ʈ�κ��� ���ŵ� �����͸� ���� ����(����)
			receiver.read(recvBuf);
			String recvMsg = new String(recvBuf); //byte�迭�� String���� ��ȯ�ϴ� �۾�
			System.out.println("receive data: " + recvMsg); //������ ������ ȭ�鿡 ����ϱ�
			
			
		} catch (IOException e) {
			// TODO: handle exception
		}
		
	}

}
