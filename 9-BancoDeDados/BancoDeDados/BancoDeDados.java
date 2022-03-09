    //Faltou adicionar o arquivo do banco de dados a estrutura de projeto do VSCode
    //Pra fazer isso, basta ver o menu no canto inferior esquerdo 'Java Projects'
    //E adicione uma Referenced Libraries, ai é só escolher o .jar

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BancoDeDados{
    public static void main(String[] args) {
        try {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            String dbURL = "jdbc:mysql://localhost:3306/testeJava?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";
            Connection conn = DriverManager.getConnection(dbURL, "root", "");

            if(conn != null) {
                System.out.println("STATUS--->Conectado com sucesso!");
            } else {
                System.out.println("STATUS--->Não foi possivel realizar conexão");
            }

            String sql = "INSERT INTO users (id, nome) VALUES ('1', 'Gabriel')";
            int stmt = conn.createStatement().executeUpdate(sql);
            System.out.println("Linhas afetadas: "+stmt);
            conn.close();
            
        } catch (SQLException e) {
            e.getStackTrace();
        }
    }    
}