package com.silentpeopl.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Socket conSock = new Socket();
			InetSocketAddress conAddr = new InetSocketAddress("127.0.0.1", 1818);
			conSock.connect(conAddr);
			OutputStream sender = conSock.getOutputStream();
			InputStream reciever = conSock.getInputStream();

			byte[] recvBuf = new byte[100];
			int bytesCnt = reciever.read(recvBuf);
			String recvMsg = new String(recvBuf, 0, bytesCnt, "UTF-8");
			System.out.println("receive message from " + conSock.getRemoteSocketAddress() + ": " + recvMsg + "\n");

			String sendBuf = "Nice to meet you!!";
			sender.write(sendBuf.getBytes());
			System.out.println("send Message to " + conSock.getRemoteSocketAddress() + ": " + sendBuf + "\n");

			/*
			 * BufferedReader in = new BufferedReader(new
			 * InputStreamReader(socket.getInputStream())); PrintWriter out =
			 * new PrintWriter(socket.getOutputStream(),true);
			 */
		} catch (Throwable e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}