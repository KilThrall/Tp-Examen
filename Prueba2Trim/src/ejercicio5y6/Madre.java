package ejercicio5y6;

import java.util.HashSet;

public class Madre extends Persona
{
    private String nombreEmpresa;
    private HashSet<Hijo> hijos;

    public Madre()
    {
        super();
        nombreEmpresa="IPM";
        hijos= new HashSet<Hijo>();
    }

    public Madre(String nombreNuevo,String apellidoNuevo, int edadNueva, int DNINuevo, boolean sexoNuevo, String ocupacionNueva,String empresaNueva,HashSet<Hijo> hijosNuevo)
    {
        super(nombreNuevo,apellidoNuevo,edadNueva,DNINuevo,sexoNuevo,ocupacionNueva);
        nombreEmpresa=empresaNueva;
        hijos=hijosNuevo;
    }

    public void setEmpresa(String empresaNueva)
    {
        this.nombreEmpresa=empresaNueva;
    }
    public void setHijos(HashSet<Hijo> hijosNuevo)
    {
        this.hijos=hijosNuevo;
    }
    public String getNombreEmpresa()
    {
        return this.nombreEmpresa;
    }
    public HashSet<Hijo> getHijos()
    {
        return this.hijos;
    }

    public void addHijo(Hijo hijoAAgregar)
    {
        this.hijos.add(hijoAAgregar);
    }

    public HashSet<Hijo> HijosMenoresDeEdad()
    {
        HashSet<Hijo> hijosMenores = new HashSet<Hijo>();
        for(Hijo a : this.hijos)
        {
            if(a.getEdad()<18)
                hijosMenores.add(a);
        }
        return hijosMenores;
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
        System.out.println(this.nombreEmpresa);
        for(Hijo a : this.HijosMenoresDeEdad())
        {
            a.ImprimirTodo();
        }
    }
}