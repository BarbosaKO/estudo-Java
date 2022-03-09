package ReadersAndWriters;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Copy {
    public static void main(String[] args) {
        try {
            //Funcionam apenas em arquivos de texto!
            FileReader input = new FileReader(args[0]);
            FileWriter output = new FileWriter(args[1]);

            char[] buffer = new char[31339];
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

