package ejercicio5y6;

public class Hijo extends Persona
{
    private String escuela;
    private String juegoFavorito;

    public Hijo()
    {
        super();
        escuela="IPM";
        juegoFavorito="Portal";
    }
    public Hijo(String escuelaNueva,String juegoNuevo)
    {
        super();
        escuela=escuelaNueva;
        juegoFavorito=juegoNuevo;
    }
    public void setEscuela(String escuelaNueva)
    {
        this.escuela=escuelaNueva;
    }
    public void setJuego(String juegoNuevo)
    {
        this.juegoFavorito=juegoNuevo;
    }
    public String getEscuela()
    {
        return this.escuela;
    }
    public String getJuego()
    {
        return this.juegoFavorito;
    }

    public void ImprimirTodo()
    {
        System.out.println(super.getNombre());
        System.out.println(super.getApellido());
        System.out.println(super.getEdad());
        System.out.println(super.getDNI());
        if(super.getSexo())
            System.out.println("Hombre");
        else
            System.out.println("Mujer");
        System.out.println(super.getOcupacion());
        System.out.println(this.escuela);
        System.out.println(this.juegoFavorito);
    }
}
