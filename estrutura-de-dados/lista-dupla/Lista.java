
public class Lista {
    private No ref;

    public Lista() {
        this.ref = null;
    }
    
    public boolean empty() {
        return this.ref == null;
    }

    public void add(int info) {
        No no;

        // inserir o 1°
        if (this.empty()) {
            no = new No(info, null, null);
            this.ref = no;
            return;
        }

        // inserir no inicio
        if (info <= this.ref.getInfo()) {
            no = new No(info, null, this.ref);
            
            this.ref.setAnt(no);
            this.ref = no;
            return;
        }

        // inserir no meio ou no final
        for (No p = this.ref; p != null; p = p.getProx()) {
            
            if (p.getInfo() >= info) {
                no = new No(info, p.getAnt(), p);
                no.getAnt().setProx(no);
                p.setAnt(no);
                return;
            }
            else if (p.getProx() == null) {
                no = new No(info, p, null);
                p.setProx(no);
                return;
            }
        }

    }

    public void remove(int info) {
        
        if (this.empty()) {
            return;
        }

        // remove o 1°
        if (this.ref.getInfo() == info) {
            this.ref = this.ref.getProx();

            if(this.ref != null)
            {
                this.ref.setAnt(null);
            }
            return;
        }

        // remove do meio e do final processando só a parte necessária da lista
        for (No p = this.ref; p != null; p = p.getProx()) {
            if (p.getInfo() == info)
            {
                p.getAnt().setProx(p.getProx());
                
                if (p.getProx() != null) {
                    p.getProx().setAnt(p.getAnt());
                    return;
                }    
            } 
            else if (p.getInfo() > info) {
                return;
            }
        }
    }

    public void print() {
        
        if (this.empty()) {
            System.out.println("[]");
            return;
        }

        System.out.print("[");
        for (No p = this.ref; p != null; p = p.getProx())
        {
            if (p.getProx() == null) {
                System.out.println(p.getInfo() + "]");
            }
            else {
                System.out.print(p.getInfo() + ", ");
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
