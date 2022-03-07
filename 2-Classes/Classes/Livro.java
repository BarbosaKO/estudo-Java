package Classes;

//Implementando interfaces, não alteramos a classe pai e separamos um código 'antigo' de um 'novo'.
public class Livro extends Objeto implements Vendavel{
	public int edicao;
	public double preco;

	public Livro(String nome, int edicao, double preco){
		super(nome);
		this.edicao = edicao;
		this.preco = preco;
	}

	public void setEdicao(int edicao){
		this.edicao = edicao;
	}

	public int getEdicao(){
		return this.edicao;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getPreco() {
		return preco;
	}

	//Somos obrigados a implementar o método abstrato da classe Pai na classe filho.
	@Override
	public String getDescricao() {
		return null;
	}
	//Implementação do método da interface
	@Override
	public double getValorVenda() {
		return 0;
	}
}
