package ejercicio7;

public class Libro
{
    int precio;
    String nombre;
    Editorial editorial;

    public Libro()
    {
        this(10,"Patito feo", Editorial.Sudamericana);
    }

    public Libro(int precioNuevo, String nombreNuevo, Editorial editorialNueva)
    {
        precio=precioNuevo;
        nombre=nombreNuevo;
        editorial=editorialNueva;
    }

    public int getPrecio()
    {
        return this.precio;
    }
    public String getNombre()
    {
        return this.nombre;
    }
    public Editorial getEditorial()
    {
        return this.editorial;
    }
    public void setPrecio(int precioNuevo)
    {
        this.precio=precioNuevo;
    }
    public void setNombre(String nombreNuevo)
    {
        this.nombre=nombreNuevo;
    }
    public void setEditorial(Editorial editorialNueva)
    {
        this.editorial=editorialNueva;
    }
}
