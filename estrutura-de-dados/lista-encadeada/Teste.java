public class Teste {
    public static void main(String[] args) {
        Lista lista = new Lista();
        lista.add(0);
        lista.add(5);
       
        lista.imprimir();

        lista.remover(0);
        lista.remover(5);
        lista.imprimir();

        lista.add(1);
        lista.add(3);
        lista.add(2);
        
        lista.imprimir();

    }
}
