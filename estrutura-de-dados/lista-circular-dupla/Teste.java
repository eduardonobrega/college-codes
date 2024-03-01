public class Teste 
{
    public static void main(String[] args) 
    {
        Lista lista = new Lista();
        lista.add(8);
        lista.add(4);
        lista.add(2);
        lista.add(3);
        lista.add(0);
        lista.add(5);
        lista.add(7);
        lista.add(1);
        lista.add(6);
        lista.print();
        System.out.println(lista.getRef().getAnt().getProx().getInfo());
    }
}
