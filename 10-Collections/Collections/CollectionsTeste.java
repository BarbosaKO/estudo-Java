import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.TreeSet;
import java.util.Vector;

public class CollectionsTeste {
    public static void main(String[] args) {
        System.out.println("*************************** List ***************************");
            System.out.println("1º ArrayList : Mais eficiente!");
            ArrayList <String> listaDeCompras = new ArrayList<String>();
            listaDeCompras.add("Ovos");
            listaDeCompras.add("Pão");
            listaDeCompras.add("Sabão");
            listaDeCompras.add("Bolacha");
            listaDeCompras.add("Peito de frango");
            System.out.println(listaDeCompras);
            //Podemos realizar uma busca binária em todas coleções, basta fazer a ordenação antes.
            Collections.sort(listaDeCompras);
            System.out.println("Lista organizada: "+listaDeCompras);
            int indice = Collections.binarySearch(listaDeCompras, "Pão");
            System.out.println("No índice "+indice+" se encontra "+listaDeCompras.get(indice));

            System.out.println("2º Vector");
            //Deprecated
            Vector <Integer> vetor = new Vector<Integer>();
            for(int i = 0; i<100; i++)
                vetor.add(i);
            System.out.println(vetor);
            
        System.out.println("*************************** List and Queue ***************************");
            System.out.println("1º LinkedList");
            //Lista ligada, seus dados não estão armazenados de formda contigua.
            LinkedList <String> ll = new LinkedList<String>();
            ll.add("b");
            ll.add("c");
            ll.add("d");
            ll.addFirst("a");
            System.out.println(ll);

        System.out.println("*************************** Queue ***************************");
            System.out.println("1º PriorityQueue");
            //Usa uma pilha do tipo FIFO, mas dá prioridade a retirada de um elemento usando seu Comparator
            PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();
            pQueue.add(10);
            pQueue.add(20);
            pQueue.add(15);
            pQueue.add(25);
            System.out.println(pQueue);
            System.out.println("Prioritário: "+pQueue.peek());//Mostra o objeto com maior prioridade, nesse caso ele vai pegar o menor valor
            System.out.println("Retira: "+pQueue.poll());//Retira o objeto com maior prioridade da pilha
            System.out.println("Prioritário: "+pQueue.peek());//Mostra o novo objeto prioritário
            System.out.println(pQueue);

        System.out.println("*************************** Set ***************************");
            System.out.println("1º HashSet");
            //Armazena os elementos em uma tabela hash
            //Melhor performance
            //Não garante nenhum tipo de ordem dos elementos
            HashSet <String> hs = new HashSet<String>();
            hs.add("A");
            hs.add("G");
            hs.add("D");
            System.out.println(hs);
            System.out.println("Usando forEach:");
            hs.forEach(item->{
                System.out.println(item);
            });
            System.out.println("Usando Iterator:");
            Iterator<String> it = hs.iterator();
            while(it.hasNext())
                System.out.println(it.next());

            System.out.println("2º LinkedHashSet");
            //Usa tabela hash com lista ligada
            //Mantém a ordem de inserção dos elementos
            LinkedHashSet <String> lhs = new LinkedHashSet<String>();
            lhs.add("A");
            lhs.add("G");
            lhs.add("D");
            System.out.println(lhs);

            System.out.println("3º TreeSet");
            //Usa uma estrutura de árvore para armazenar os elementos
            //Mantém a ordem dos elementos
            //Mais lenta que a HashSet
            TreeSet <Integer> ts = new TreeSet<Integer>();
            ts.add(12);
            ts.add(3);
            ts.add(15);
            ts.add(105);
            System.out.println(ts);

        System.out.println("*************************** Map ***************************");
            System.out.println("1º HashMap");
            HashMap <String, String> hm = new HashMap<String, String>();
            hm.put("pt-BR", "Brasil");
            hm.put("pt-PT", "Portugal");
            hm.put("en-US", "United States of America");
            hm.put("en-UK", "Europe");
            System.out.println(hm.containsKey("en-US"));
            System.out.println(hm.containsValue("Brasil"));
            System.out.println(hm);
            hm.forEach((chave, valor)->{
                System.out.println("Chave: "+chave+" Valor: "+valor);
            });

            System.out.println("2º HashTable");
            //Legado e lento
            System.out.println("3º LinkedHashMap");
            //Hashmap com lista ligada

    }
}
