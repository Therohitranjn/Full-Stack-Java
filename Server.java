import java.net.*;
import java.io.*;
import java.util.Scanner;

class  Server 
{
	public static void main(String[] args) 
	{
		if (args.length < 1) {
            System.out.println("Usage: Usage: java Server <port>");
            return;
        }
		try{
			
			int port = Integer.parseInt(args [0]);
			
			ServerSocket server = new ServerSocket(port);
			
			Socket s = server.accept();
			
			InputStream is = s.getInputStream();
			OutputStream os = s.getOutputStream();
			
			Scanner sc = new Scanner(System.in);
			
			byte [] b1 = new byte [100];
			byte [] b2 = new byte [100];
			
			while(true)
				
			{
				is.read(b1);
				
				
				String s1 = new String(b1).trim();
			
				
				System.out.println("From Client : " +s1);
				System.out.print("From Server : ");
				
				String response = sc.nextLine();
				b2 = response.getBytes();
				os.write(b2);
			}
		}
		catch(IOException ie ){
			System.err.println(ie);
		}
	}
}
