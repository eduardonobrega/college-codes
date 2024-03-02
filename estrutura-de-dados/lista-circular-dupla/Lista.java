public class Lista
{
    private No ref;

    public Lista()
    {
        this.ref = null;
    }

    public boolean vazia()
    {
        return this.ref == null;
    }

    private No insertNo(No atual, int info)
    {
        No no = new No(info, atual.getAnt(), atual);
        atual.getAnt().setProx(no);
        atual.setAnt(no);
        return no;
    }

    public void add(int info)
    {    
        if (this.vazia())
        {
            this.ref = new No(info);
            return;
        }

        // inserção no inicio
        if (info < this.ref.getInfo())
        {
            this.ref = insertNo(this.ref, info);
            return;
        }

        // inserção no final
        if (info > this.ref.getAnt().getInfo())
        {
            insertNo(this.ref, info);
            return;
        }

        //insere no meio
        for (No p = this.ref.getProx(); p != this.ref.getAnt(); p = p.getProx()) {
            if (p.getInfo() >= info)
            {
                insertNo(p, info);
                return;
            }
        }

        /*
            último caso: inserir o penúltimo
            como o for não acessa o último, precisei 
            tratar esse caso.        
        */ 
        insertNo(this.ref.getAnt(), info);
    }

    public void remove(int info)
    {
        if (this.vazia())
        {
            return;
        }

        // Se a lista só tiver um número
        if (this.ref.equals(this.ref.getAnt()))
        {
            this.ref = null;
            return;
        }

        // Remoção do inicio
        if (this.ref.getInfo() == info)
        {
            this.ref.getProx().setAnt(this.ref.getAnt());
            this.ref.getAnt().setProx(this.ref.getProx());
            this.ref = this.ref.getProx();
            return;
        }

        // Remoção do final
        if (this.ref.getAnt().getInfo() == info)
        {
            this.ref.getAnt().getAnt().setProx(this.ref);
            this.ref.setAnt(this.ref.getAnt().getAnt());
            return;
        }

        for (No p = this.ref.getProx(); p != this.getRef().getAnt(); p = p.getProx())
        {
            if (p.getInfo() == info)
            {
                p.getAnt().setProx(p.getProx());
                p.getProx().setAnt(p.getAnt());
                return;
            }
            if (p.getInfo() > info)
            {
                return;
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
        for(No p = this.ref; p != this.ref.getAnt(); p = p.getProx())
        {
            System.out.print(p.getInfo() + ", ");
        }
        System.out.println(this.ref.getAnt().getInfo() + "]"); // imprimindo último
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
