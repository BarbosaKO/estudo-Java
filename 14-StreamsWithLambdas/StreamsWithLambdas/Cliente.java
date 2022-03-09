public class Cliente
{
    public enum Status{
        Desempregado, Estudante, Empregado, Aposentado
    }

    public int id;
    public String nome;
    public Status status;

    public Cliente(int id, String nome, Cliente.Status status) {
        this.id = id;
        this.nome = nome;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Status getStatus() {
        return status;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void aposentaCliente(){
        this.status = Status.Aposentado;
        System.out.println("Cliente "+this.getNome()+" aposentado!");
    }

}