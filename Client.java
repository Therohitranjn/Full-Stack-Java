	import java.net.*;
	import java.io.*;
	import java.util.Scanner;

	class Client
	{
		public static void main(String args[]){
			
			if (args.length < 2) {
				System.out.println("Usage: java Client <server_address> <port>");
				return;
			}
			
			try{
				
				String address = args[0];
				int port = Integer.parseInt(args[1]);
				Socket s = new Socket(address , port);
				
				OutputStream os = s.getOutputStream();
				InputStream is = s.getInputStream();
				
				Scanner sc = new Scanner(System.in);
				
				byte [] b1 = new byte[100];
				byte [] b2 = new byte[100];
				
				while(true){
					
					System.out.print("To Server: ");
					
					String input = sc.nextLine();
					b1=input.getBytes();
					
					
					os.write(b1);
					is.read(b2);
					
					
					String s1 = new String(b2);
					String s2 = s1.trim();
					
					System.out.println("From Server: "+s2);
				}
				
			}catch (IOException ie){
				System.err.println(ie);
			}
		}
	}