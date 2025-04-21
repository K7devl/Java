package tp_abstraccion;

public class Otro extends Persona {
    
    public Otro(){

    }

    public Otro(Persona p){
        super(p);
    }

    @Override
    public String titulo(){
        return "Sr.";
    }
}
