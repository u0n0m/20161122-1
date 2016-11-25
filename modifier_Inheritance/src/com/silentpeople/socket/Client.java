package com.silentpeople.socket;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			Socket connSock = new Socket(); // 서버에 접속할 때 사용할 소켓 생성
			InetSocketAddress connAddr = new InetSocketAddress("127.0.0.1", 1818);
			connSock.connect(connAddr); // 위에서 결정한 주소로 연결 
			
			OutputStream sender = connSock.getOutputStream(); //소켓으로 데이터를 보내려면 꼭 필요함.

			InputStream receive = connSock.getInputStream();// 소켓에서 데이터를 가져오려면 꼭 필요함.
			byte [] recvBuf = new byte[100];//수신데이터를 담을 저장공간 
			receive.read(recvBuf); //소켓에서 수신데이터 가져오기
			String recvMsg = new String(recvBuf); //byte배열을 String으로 변환하는 작업
			System.out.println(recvBuf); //가져온거 출력하기
			
			String sendBuf ="Nice to meet you^^"; // 서버로 보낼 안녕메세지
			sender.write(sendBuf.getBytes());	//서버로 메시지 보내기
			
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		

	}

}