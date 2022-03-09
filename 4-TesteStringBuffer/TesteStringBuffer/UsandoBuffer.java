package TesteStringBuffer;

public class UsandoBuffer {

    public static void main(String[] args) {
        String texto = "Amo muito comer pudim!";
        StringBuffer bf = new StringBuffer(texto);
        System.out.println(bf);
        System.out.println(bf.reverse());
        System.out.println(bf.append(" str"));
        System.out.println(bf.reverse());
    }
    
}
