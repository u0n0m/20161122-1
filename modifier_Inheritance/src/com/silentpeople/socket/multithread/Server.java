package com.silentpeople.socket.multithread;

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
			
			Socket cliSock;
			while (true) {
				cliSock = servSock.accept();//������������ ã�ƿ� ���� �� ���� �������� ���������
				chat chat1 = new chat(cliSock);
				chat1.start();
			      	
			}
			
		} catch (IOException e) {
			// TODO: handle exception
		}
		
	}


}
