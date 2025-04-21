package tp_abstraccion;

public abstract class Persona {
    private String Nombre;
    private String Titulo;



    public Persona(){
        }

        public Persona( Persona p){
            this.Nombre = p.Nombre;
        }


    public Persona(String nombre){
        this.Nombre = nombre;
    }

    public void set_Nombre(String nom){
        this.Nombre = nom;
    }

    public String get_Nombre(){
        return this.Nombre;
    }

    public void set_Titulo(String tit){
        this.Titulo = tit;
    }

    public String get_Titulo(){
        return this.Titulo;
    }

    abstract String titulo();

    public String get_Persona(){
        return titulo() + " " + get_Nombre();
    }








}
