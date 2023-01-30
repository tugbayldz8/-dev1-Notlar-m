package jlfjljflf;
import java.io.*;
import java.net.Socket;

public class socket {

	public static void main(String[] args) {
		String serverName="localhost";
		int port=6666;
		try {
			System.out.println("Bağlandığın server adı:"+serverName+" port adı:"+port);
			Socket client=new Socket(serverName,port);
			System.out.println("just connected to"+client.getRemoteSocketAddress());
			
			OutputStream outToServer=client.getOutputStream();
			DataOutputStream out=new DataOutputStream(outToServer);
			out.writeUTF("hello from"+client.getLocalSocketAddress());
			
			InputStream inFromServer=client.getInputStream();
			DataInputStream in=new DataInputStream(inFromServer);
			System.out.println("server sayısı:"+in.readUTF());
			
			client.close();
			
			
		} catch (IOException e) {
			e.printStackTrace();
			// TODO: handle exception
		}

	}

}
