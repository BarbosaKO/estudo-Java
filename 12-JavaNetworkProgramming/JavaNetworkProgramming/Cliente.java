import java.net.*;
import java.io.*;

public class Cliente{
  public static void main(String[] args) {
    try {
      String msg = null;
      for(;;){
        Socket s1 = new Socket("127.0.0.1", 5433);
        InputStream is = s1.getInputStream();
        DataInputStream dis = new DataInputStream(is);
        msg = dis.readUTF();
        System.out.println(msg);
        if(msg == "/q"){
          dis.close();
          is.close();
          s1.close();
        }

      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}

