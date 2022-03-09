public class TestaBaralho {
    public static void main(String[] args) {
        Baralho baralho = new Baralho();
        baralho.inicializaBaralho();
        baralho.cartas.forEach(carta -> {
            System.out.println(carta.toString());
        });
    }
}
