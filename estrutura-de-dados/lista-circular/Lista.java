public class Lista {
    private No ref;
    
    public Lista()
    {
        this.ref = null;
    }

    public boolean vazia()
    {
        return this.ref == null;
    }

    public void add(int info) 
    {
        No no;

        // inserção do 1°
        if (this.vazia()) 
        {
            no = new No(info);
            no.setProx(no);
            this.ref = no;
            return;
        }
        // inserção no final
        if (info > this.ref.getInfo())
        {
            no = new No(info, this.ref.getProx());
            this.ref.setProx(no);
            this.ref = no;
            return;
        }

        // inserção no inicio
        if (info < this.ref.getProx().getInfo())
        {
            no = new No(info, this.getRef().getProx());
            this.ref.setProx(no);
            return;
        }

        // inserção no meio
        for (No p = this.ref.getProx(); p != ref; p = p.getProx())
        {
            if (p.getProx().getInfo() >= info) 
            {
                no = new No(info, p.getProx());
                p.setProx(no);
                return;
            }
        }
    }

    public void remove(int info)
    {
        if (this.vazia())
        {
            return;
        }

        No ant = this.ref;

        for (No p = ant.getProx(); p != ref; p = p.getProx(), ant = ant.getProx())
        {
            if (p.getInfo() == info)
            {
                ant.setProx(p.getProx());
                return;
            }

            if (p.getInfo() > info)
            {
                return;
            }
        }
        // removendo o último
        if(this.ref.getInfo() == info)
        {    
            // se a lista só tiver um número  
            if (this.ref.equals(this.ref.getProx()))
            {
                this.ref = null;
            }
            else
            {
                ant.setProx(this.ref.getProx());
                this.ref = ant;
            }
        }
    }

    public void print()
    {
        if (this.vazia())
        {
            System.out.println("[]");
            return;
        }

        System.out.print("[");
        for (No p = this.ref.getProx(); p != ref; p = p.getProx())
        {
            System.out.print(p.getInfo() + ", ");
        }
        System.out.println(this.getRef().getInfo() + "]");
    }

    public No getRef() 
    {
        return ref;
    }

    public void setRef(No ref) 
    {
        this.ref = ref;
    }
}