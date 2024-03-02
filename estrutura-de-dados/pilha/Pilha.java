public class Pilha {
    private No top;
    
    public Pilha()
    {
        this.top = null;
    }

    public void push(int info)
    {
        No no = new No(info, top);
        this.top = no;
    }

    public int pop()
    {   
        if (this.top == null)
        {
            return -1;
        }
        int info = this.top.getInfo();
        this.top = this.top.getNext();
        return info;
    }

    public void print()
    {
        if (this.top == null)
        {
            System.out.println("Pilha vazia!");
            return;
        }

        for (No p = this.top; p != null; p = p.getNext())
        {
            System.out.println(p.getInfo());
        }
    }
}