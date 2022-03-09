import java.util.ArrayList;

public class Baralho {
    public ArrayList<Carta> cartas;

    public Baralho(){
        cartas = new ArrayList<Carta>();
        inicializaBaralho();
    }

    public void inicializaBaralho(){
        Carta.Naipe naipes[] = Carta.Naipe.values();
        Carta.Valor valores[] = Carta.Valor.values();
        for(Carta.Naipe naipe : naipes){
            for(Carta.Valor valor : valores){
                cartas.add(new Carta(naipe, valor));
            }
        }
    }
}
