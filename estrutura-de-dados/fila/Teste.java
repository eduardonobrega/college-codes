public class Teste {

    public static void main(String[] args) {
        Fila f = new Fila();

        f.enqueue(1);
        f.enqueue(2);
        f.enqueue(3);
        f.dequeue();
        f.dequeue();
        f.dequeue();
        f.enqueue(3);
        f.print();
    }
}