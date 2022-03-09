public class Carta{
  public enum Naipe {Espadas, Paus, Copa, Ouro};
  public enum Valor {Ás, Dois, Três, Quatro, Cinco, Seis, Sete, Oito, Nove, Dez, Dama, Valete, Rei};
  
  public Naipe naipe;
  public Valor valor;

  public Carta(Naipe naipe, Valor valor){
    this.naipe = naipe;
    this.valor = valor;
  }

  @Override
  public String toString() {
      return valor+" de "+naipe;
  }
}
