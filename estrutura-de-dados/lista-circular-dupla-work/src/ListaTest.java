import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ListaTest {
    @Test
    public void testVazia() {
       Lista lista = new Lista();
       String ret = lista.imprime();
       assertEquals("lista vazia", ret);
   }
   @Test
   public void test() {
       Lista lista = new Lista();
       lista.insere(5);
       lista.insere(4);
       lista.insere(3);
       lista.insere(2);
       lista.insere(1);
       String ret = lista.imprime();
       assertEquals("Sentido normal:1 2 3 4 5 Sentido contrário:5 4 3 2 1 ", ret);
   }
}
