public class Fila {
    private No start;
    private No end;

    public Fila() {
        this.start = null;
        this.end = null;
    }

    public boolean isEmpty()
    {
        return start == null && end == null;
    }

    public void enqueue(int info)
    {   
        No no = new No(info, null);
        if (isEmpty())
        {
            this.start = no;
        }
        else
        {
            this.end.setNext(no);
        }
        this.end = no;
    }

    public void dequeue()
    {
        if (isEmpty())
        {
            return;
        }

        
        if (this.start.equals(this.end))
        {
            System.out.println("sdsd");
            this.end = null;
        }
        this.start = this.start.getNext();
    }

    public void print()
    {   
        if (isEmpty())
        {
            System.out.println("Fila vazia!");
            return;
        }

        for (No p = this.start; !p.equals(this.end); p = p.getNext())
        {
            System.out.print(p.getInfo() + " --> ");
        }

        System.out.println(this.end.getInfo());
    }

    public No getStart() {
        return start;
    }
    public void setStart(No start) {
        this.start = start;
    }
    public No getEnd() {
        return end;
    }
    public void setEnd(No end) {
        this.end = end;
    }
    
}