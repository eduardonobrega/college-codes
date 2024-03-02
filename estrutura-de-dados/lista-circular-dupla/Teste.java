public class Teste 
{
    public static void main(String[] args) 
    {
        Lista lista = new Lista();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        
        lista.print();
        lista.remove(2);
        lista.print();
    }
}
