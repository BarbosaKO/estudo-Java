import java.net.*;
import java.io.*;

public class Servidor{
	public static void main(String[] args){

    	InputStreamReader ir = null;
    	BufferedReader in = null;
		String msg = null;
    	System.out.println("Ctrl+c para sair!");

		ServerSocket s = null;
		try{
			s = new ServerSocket(5433);

		}catch(IOException e){
			e.printStackTrace();
		}
		
		Socket s1 = null;
		DataOutputStream dos = null;
		try{
			for(;;){
				ir = new InputStreamReader(System.in);
    			in = new BufferedReader(ir);
				s1 = s.accept();//Aguarda conexão
				OutputStream s1out = s1.getOutputStream();
				dos = new DataOutputStream(s1out);
				msg = in.readLine();
				dos.writeUTF(msg);
				if(msg == "/q"){
					in.close();
					dos.close();
					s1.close();
				}

			}
			
        	
		}catch(IOException e){
			e.printStackTrace();
		}
		
	}
}
