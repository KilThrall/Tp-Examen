package ejercicio7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.HashMap;

public class misTests
{
    @Test
    public void MasVendidaEsSudamericana()
    {
        Libro l1= new Libro();
        Libro l2= new Libro(5,"Peter Pan",Editorial.Sudamericana);
        Libro l3= new Libro(777,"Luna de pluton",Editorial.Sudamericana);
        Libro l4= new Libro(2130,"La sirenita",Editorial.ElAteneo);
        Libro l5= new Libro(123,"Farenheit 451",Editorial.Interzona);
        Libro l6= new Libro(145,"Los 7 enanitos", Editorial.Sur);
        Libro l7= new Libro(965,"La biblia", Editorial.Alianza);
        Libro l8= new Libro(134,"Sapo pepe",Editorial.Kapelusz);
        Libro l9= new Libro(3456,"Ya no se que libro poner, ayuda",Editorial.Atlantida);
        Libro l10= new Libro(912,"Profe estoy cansado", Editorial.Sudamericana);
        Libro l11= new Libro(63129,"I dont feel so good Mr Stark",Editorial.Sur);

        Libreria libreria = new Libreria();
        libreria.AddVenta(l1);
        libreria.AddVenta(l2);
        libreria.AddVenta(l3);
        libreria.AddVenta(l4);
        libreria.AddVenta(l5);
        libreria.AddVenta(l6);
        libreria.AddVenta(l7);
        libreria.AddVenta(l8);
        libreria.AddVenta(l9);
        libreria.AddVenta(l10);
        libreria.AddVenta(l11);
        assertEquals(libreria.EditorialMasVendida(),Editorial.Sudamericana);
    }

    @Test
    public void MasVendidaEsSur()
    {
        Libro l1= new Libro();
        Libro l2= new Libro(5,"Peter Pan",Editorial.Sur);
        Libro l3= new Libro(777,"Luna de pluton",Editorial.Sur);
        Libro l4= new Libro(2130,"La sirenita",Editorial.ElAteneo);
        Libro l5= new Libro(123,"Farenheit 451",Editorial.Interzona);
        Libro l6= new Libro(145,"Los 7 enanitos", Editorial.Sur);
        Libro l7= new Libro(965,"La biblia", Editorial.Alianza);
        Libro l8= new Libro(134,"Sapo pepe",Editorial.Kapelusz);
        Libro l9= new Libro(3456,"Ya no se que libro poner, ayuda",Editorial.Atlantida);
        Libro l10= new Libro(912,"Profe estoy cansado", Editorial.Sudamericana);
        Libro l11= new Libro(63129,"I dont feel so good Mr Stark",Editorial.Atlantida);

        Libreria libreria = new Libreria();
        libreria.AddVenta(l1);
        libreria.AddVenta(l2);
        libreria.AddVenta(l3);
        libreria.AddVenta(l4);
        libreria.AddVenta(l5);
        libreria.AddVenta(l6);
        libreria.AddVenta(l7);
        libreria.AddVenta(l8);
        libreria.AddVenta(l9);
        libreria.AddVenta(l10);
        libreria.AddVenta(l11);
        assertNotEquals(libreria.EditorialMasVendida(),Editorial.Atlantida);
    }

    @Test
    public void VendidosEnSur()
    {
        Libro l1= new Libro();
        Libro l2= new Libro(5,"Peter Pan",Editorial.Sudamericana);
        Libro l3= new Libro(777,"Luna de pluton",Editorial.Sudamericana);
        Libro l4= new Libro(2130,"La sirenita",Editorial.ElAteneo);
        Libro l5= new Libro(123,"Farenheit 451",Editorial.Interzona);
        Libro l6= new Libro(145,"Los 7 enanitos", Editorial.Sur);
        Libro l7= new Libro(965,"La biblia", Editorial.Alianza);
        Libro l8= new Libro(134,"Sapo pepe",Editorial.Kapelusz);
        Libro l9= new Libro(3456,"Ya no se que libro poner, ayuda",Editorial.Atlantida);
        Libro l10= new Libro(912,"Profe estoy cansado", Editorial.Sudamericana);
        Libro l11= new Libro(63129,"I dont feel so good Mr Stark",Editorial.Sur);

        Libreria libreria = new Libreria();
        libreria.AddVenta(l1);
        libreria.AddVenta(l2);
        libreria.AddVenta(l3);
        libreria.AddVenta(l4);
        libreria.AddVenta(l5);
        libreria.AddVenta(l6);
        libreria.AddVenta(l7);
        libreria.AddVenta(l8);
        libreria.AddVenta(l9);
        libreria.AddVenta(l10);
        libreria.AddVenta(l11);
        assertEquals(libreria.VendidosSegunEditorial(Editorial.Sur),2);
    }
}
