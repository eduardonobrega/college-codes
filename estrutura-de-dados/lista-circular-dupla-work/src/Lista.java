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

    public void insere(int info)
    {      
        // Inserção do 1° elemento
        if (this.vazia())
        {
            this.ref = new No(info);
            return;
        }

        // inserção no inicio
        No no = new No(info, this.ref, this.ref.getProx());
        this.ref.getProx().setAnt(no);
        this.ref.setProx(no);
    }

    private void removeNo(No no)
    {
        no.getAnt().setProx(no.getProx());
        no.getProx().setAnt(no.getAnt());
    }

    public void remove(int info, boolean duplicados)
    {
        if (this.vazia())
        {
            return;
        }

        // Se a lista só tiver um número
        if (this.ref.equals(this.ref.getProx()))
        {   
            if (this.ref.getInfo() == info)
            {
                this.ref = null;
            }
            return;
        }

        for (No p = this.ref.getProx(); p != this.ref; p = p.getProx())
        {
            if (p.getInfo() == info)
            {
                removeNo(p);
                if (!duplicados)
                {
                    return;
                }
            }
        }
        if (this.ref.getInfo() == info)
        {   
            if (this.ref.equals(this.ref.getProx()))
            {   
                this.ref = null;
            }
            else
            {   
                removeNo(this.ref);
                this.ref = this.ref.getAnt();
            }
        }
    }

    public String imprime()
    {
        if (this.vazia())
        {
            return "lista vazia";
        }

        String str = "Sentido normal:";
        for(No p = this.ref.getProx(); p != this.ref; p = p.getProx())
        {
            str += p.getInfo() + " ";
        }
        str += this.ref.getInfo() + " "; // imprimindo último

        str += " Sentido contrário:";
        for(No p = this.ref; p != this.ref.getProx(); p = p.getAnt())
        {
            str += p.getInfo() + " ";
        }
        str += this.ref.getProx().getInfo() + " "; // imprimindo o primeiro
        
        return str;
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
