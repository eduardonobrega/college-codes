public class Teste {
    public static void main(String[] args) {
        Lista lista = new Lista();

        lista.add(2);
        lista.add(1);
        lista.add(5);
        
        lista.print();
        lista.remove(1);
        lista.print();
    }
}
