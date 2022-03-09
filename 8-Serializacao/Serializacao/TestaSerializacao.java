public class TestaSerializacao {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa(0, "Gabriel");
        
        try {
            Serializador serializador = new Serializador();
            serializador.gravacao("gabriel.obj", pessoa);
            pessoa = null;

            pessoa = (Pessoa) serializador.visualizacao("gabriel.obj");
            System.out.println("ID: "+pessoa.getId());
            System.out.println("Nome: "+pessoa.getNome());

        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
