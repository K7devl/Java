package tp_abstraccion;

public class Ingeniero extends Persona{

    public Ingeniero(){
    }

    public Ingeniero( Persona p){
        super (p);
    }

    @Override
    public String titulo(){
        return "Ing.";
    }
}
