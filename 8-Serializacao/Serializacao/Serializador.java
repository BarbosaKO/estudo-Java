import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serializador {

    public void gravacao(String nomeArquivo, Object objeto) throws IOException{
        if(objeto != null && nomeArquivo != null){
            FileOutputStream fos = new FileOutputStream(nomeArquivo);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(objeto);
            oos.close();
        }
    }

    public Object visualizacao(String nomeArquivo) throws IOException, ClassNotFoundException{
        Object pessoa =null;
        if(nomeArquivo != null){
            FileInputStream fis = new FileInputStream(nomeArquivo);
            ObjectInputStream ois = new ObjectInputStream(fis);
            pessoa = ois.readObject();
            ois.close();
        }
        return pessoa;
    }

}
