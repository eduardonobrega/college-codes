public class Teste {
    public static void main(String[] args) {
        Pilha pilha = new Pilha();
        
        pilha.push(0);
        pilha.push(1);
        pilha.push(2);
        pilha.push(3);
        
        System.out.println(pilha.pop());
        System.out.println(pilha.pop());
        System.out.println(pilha.pop());
        System.out.println(pilha.pop());
        pilha.print();
        pilha.push(9);
        pilha.print();

    }
}