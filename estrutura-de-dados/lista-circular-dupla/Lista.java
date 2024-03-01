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
