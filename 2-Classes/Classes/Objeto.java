package Classes;

//Podemos usar o abstract pra informar que essa classe não deve ser instanciada
//ou seja, é uma classe Pai(seu uso é opcional).
public abstract class Objeto{
	public String nome;

	public Objeto(String nome){
		this.nome = nome;
	}

	public String getNome(){
		return this.nome;
	}

	public void setNome(String nome){
		this.nome = nome;
	}

	//Métodos abstratos não possuem corpo de implementação
	public abstract String getDescricao();
}
