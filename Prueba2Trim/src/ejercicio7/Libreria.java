package ejercicio7;

import java.util.ArrayList;
import java.util.HashMap;

public class Libreria
{
    ArrayList<Libro> librosVendidos;
    HashMap<Editorial,Integer> vendidosPorEditorial;

    public Libreria()
    {
        librosVendidos=new ArrayList<Libro>();
        vendidosPorEditorial= new HashMap<Editorial,Integer>();
        Editorial[] editoriales=Editorial.values();
        for (int i=0;i<editoriales.length;i++)
        {
            vendidosPorEditorial.put(editoriales[i],0);
        }
    }

    public void setLibrosVendidos(ArrayList<Libro> libros)
    {
        this.librosVendidos=libros;
    }
    public void setVendidosPorEditorial(HashMap<Editorial,Integer> vendidosPorEditorialNuevo)
    {
        this.vendidosPorEditorial=vendidosPorEditorialNuevo;
    }

    public void AddVenta(Libro libroVendido)
    {
        this.librosVendidos.add(libroVendido);
        Editorial editLibroVendido = libroVendido.getEditorial();
        int vendidosActual = this.vendidosPorEditorial.get(editLibroVendido);
        this.vendidosPorEditorial.put(editLibroVendido,vendidosActual+1);
    }

    public Editorial EditorialMasVendida()
    {
        int cantidadMasVendida=0;
        Editorial editorialMasVendida;
        Editorial[] editoriales=Editorial.values();
        editorialMasVendida=editoriales[0];
        for (int i=0;i<editoriales.length;i++)
        {
            if(this.vendidosPorEditorial.get(editoriales[i])>cantidadMasVendida)
            {
                cantidadMasVendida=this.vendidosPorEditorial.get(editoriales[i]);
                editorialMasVendida=editoriales[i];
            }
        }

        return editorialMasVendida;
    }

    public int VendidosSegunEditorial(Editorial editorialABuscar)
    {
        return this.vendidosPorEditorial.get(editorialABuscar);
    }
}