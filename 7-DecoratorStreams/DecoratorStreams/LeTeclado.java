package DecoratorStreams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LeTeclado {    
    public static void main(String[] args) {
        String s = null;
        /* 
        FileInputStream e System.in são Inputs Streams, logo, o InputStreamReader aceita ambos! 
        */
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir); //Buffer próprio do InputStreamReader que converte bytes em chars
        System.out.println("Ctrl+c para sair!");
        try {
            s = in.readLine();
            while(s != null){
                System.out.println("Lido: "+s);
                s = in.readLine();
            }
            in.close();
        } catch (IOException e) {
            e.getStackTrace();
        }
    }
}
