package tp_abstraccion;

public class Licenciado extends Persona{
    
    public Licenciado(){
    }

    public Licenciado(Persona p){
        super(p);
    }

    @Override
    public String titulo(){
        return "Lic.";
    }
}
