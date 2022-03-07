package Classes;

public class Main{
	public static void main(String args[]){
		Livro book = new Livro("Gabriel", 2, 3.50);
		System.out.println("Nome: "+book.getNome());
		System.out.println("Edição: "+book.getEdicao());
	}
}
