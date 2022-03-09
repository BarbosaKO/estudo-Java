package JavaStreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copy {
    public static void main(String[] args) {
        try {
            System.out.println("\n********************** Arguments ***********************************************");
            System.out.println(args[0]);
            System.out.println(args[1]);
            System.out.println("\n*********************************************************************");
            FileInputStream input = new FileInputStream(args[0]);
            FileOutputStream output = new FileOutputStream(args[1]);

            byte[] buffer = new byte[31339];
            int charsRead = 0;
            charsRead = input.read(buffer);
            while(charsRead != -1){
                System.out.println("charsRead: "+charsRead);
                output.write(buffer, 0, charsRead);
                charsRead = input.read(buffer);
            }
            input.close();
            output.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
