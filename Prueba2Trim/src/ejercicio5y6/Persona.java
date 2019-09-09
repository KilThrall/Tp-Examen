package ejercicio5y6;

public class Persona
{
    private String nombre;
    private String apellido;
    private int edad;
    private int DNI;
    private boolean sexo; //false=mujer true=hombre
    /*
        comentario:

        Si fuese un string, no tendrías que agregar 
        comentarios al lado de un atributo porque sería 
        lo suficientemente declarativo y no harían
        falta aclaraciones para que cualquier lector
        entienda.

        Otra opción:
        También pudo haber sido un tipo enumerado.
        
    */
    private String ocupacion;

    public Persona()
    {
        nombre="juan";
        apellido="Perez";
        edad=10;
        DNI=123456789;
        sexo=true;
        ocupacion="estudiante";
    }

    public Persona(String nombreNuevo,String apellidoNuevo, int edadNueva, int DNINuevo, boolean sexoNuevo, String ocupacionNueva)
    {
        nombre=nombreNuevo;
        apellido=apellidoNuevo;
        edad=edadNueva;
        DNI=DNINuevo;
        sexo=sexoNuevo;
        ocupacion=ocupacionNueva;
    }

    public void setNombre(String nombreNuevo)
    {
        this.nombre=nombreNuevo;
    }
    public void setApellido(String apellidoNuevo)
    {
        this.apellido=apellidoNuevo;
    }
    public void setEdad(int edadNueva)
    {
        this.edad=edadNueva;
    }
    public void setDNI(int DNINuevo)
    {
        this.DNI=DNINuevo;
    }
    public void setSexo(boolean sexoNuevo)
    {
        this.sexo=sexoNuevo;
    }
    public void setOcupacion(String ocupacionNueva)
    {
        this.ocupacion=ocupacionNueva;
    }

    public String getNombre()
    {
        return this.nombre;
    }
    public String getApellido()
    {
        return this.apellido;
    }
    public int getEdad()
    {
        return this.edad;
    }
    public int getDNI()
    {
        return this.DNI;
    }
    public boolean getSexo()
    {
        return this.sexo;
    }
    public String getOcupacion()
    {
        return this.ocupacion;
    }

    public boolean EsMayorDeEdad()
    {
        if(this.edad>=18)
            return true;

        return false;
    }
    public boolean NombreConA()
    {
        for(int i=0;i<this.nombre.length();i++)
        {
            if(this.nombre.charAt(i)=='a')
                return true;
        }
        return false;
    }
    public boolean DNIMenorA38Millones()
    {
        if(this.DNI<38000000)
            return true;

        return false;
    }

    public void ImprimirTodo()
    {
        System.out.println(this.nombre);
        System.out.println(this.apellido);
        System.out.println(this.edad);
        System.out.println(this.DNI);
        if(this.sexo)
            System.out.println("Hombre");
        else
            System.out.println("Mujer");
        System.out.println(this.ocupacion);
    }
}
