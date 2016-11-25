package com.silentpeople.socket;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			Socket connSock = new Socket(); // ������ ������ �� ����� ���� ����
			InetSocketAddress connAddr = new InetSocketAddress("127.0.0.1", 1818);
			connSock.connect(connAddr); // ������ ������ �ּҷ� ���� 
			
			OutputStream sender = connSock.getOutputStream(); //�������� �����͸� �������� �� �ʿ���.

			InputStream receive = connSock.getInputStream();// ���Ͽ��� �����͸� ���������� �� �ʿ���.
			byte [] recvBuf = new byte[100];//���ŵ����͸� ���� ������� 
			receive.read(recvBuf); //���Ͽ��� ���ŵ����� ��������
			String recvMsg = new String(recvBuf); //byte�迭�� String���� ��ȯ�ϴ� �۾�
			System.out.println(recvBuf); //�����°� ����ϱ�
			
			String sendBuf ="Nice to meet you^^"; // ������ ���� �ȳ�޼���
			sender.write(sendBuf.getBytes());	//������ �޽��� ������
			
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		

	}

}