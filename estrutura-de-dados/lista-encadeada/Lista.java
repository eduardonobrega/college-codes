public class Lista {
    private No ref;

    public Lista()
    {
        this.setRef(null);
    }

    public void add(int info) 
    {   
        if (vazia() || info <= this.ref.getInfo())
        {
            No novo = new No(info, ref);
            this.setRef(novo);
            return;
        }
        
        for (No p = this.ref; p != null; p = p.getProx())
        {   
            if (p.getProx() == null || p.getProx().getInfo() >= info)
            {
                p.setProx(new No(info, p.getProx()));
                return;
            }
           
        }

    }

    public boolean vazia()
    {
        return this.getRef() == null;
    }

    public void imprimir()
    {
        if (vazia())
        {
            System.out.println("[]");
            return;
        }

        System.out.print("[");

        for (No p = this.getRef(); p != null; p = p.getProx())
        {
            if (p.getProx() == null) 
            {
                System.out.print(p.getInfo() + "]");
            }
            else 
            {
                System.out.print(p.getInfo() + ", ");
            }
        }
        System.out.println();
    }

    public void remover(int info)
    {
        if (vazia())
        {
            return;
        }

        if (this.getRef().getInfo() == info)
        {
            this.setRef(this.getRef().getProx());
            return;
        }

        for (No p = this.ref; p.getProx() != null; p = p.getProx())
        {   
            if (p.getProx().getInfo() == info)
            {
                p.setProx(p.getProx().getProx());
                return;
            } 
            else if (p.getProx().getInfo() > info) 
            {
                return;
            }
        }
    }

    public No getRef() {
        return ref;
    }

    public void setRef(No ref) {
        this.ref = ref;
    }    
}
