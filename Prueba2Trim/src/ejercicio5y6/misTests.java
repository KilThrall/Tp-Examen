package ejercicio5y6;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.HashSet;

public class misTests
{
    private Persona p1;
    private Persona p2;
    private Persona p3;
    private Madre m1;
    private Hijo h1;

    private void DefinirPersonas()
    {
        p1= new Persona();
        p2= new Persona("Pipo", "Avellaneda", 18, 43567889,true,"Trabajador de McDonalds");
        p3= new Persona("Juana", "Del Arco", 25, 579900,false,"Campesina");
        h1= new Hijo();
        HashSet<Hijo> hijos = new HashSet<Hijo>();
        hijos.add(h1);
        m1=new Madre("Juana", "Del Arco", 37, 579900,false,"Campesina","Francia",hijos);
    }

    @Test
    public void EsMayor()
    {
        DefinirPersonas();
        assertTrue(p2.EsMayorDeEdad());
    }

    @Test
    public void NoEsMayor()
    {
        DefinirPersonas();
        assertFalse(p1.EsMayorDeEdad());
    }

    @Test
    public void TieneA()
    {
        DefinirPersonas();
        assertTrue(p3.NombreConA());
    }

    @Test
    public void NoTieneA()
    {
        DefinirPersonas();
        assertFalse(p2.NombreConA());
    }

    @Test
    public void DNIChico()
    {
        DefinirPersonas();
        assertTrue(p3.DNIMenorA38Millones());
    }

    @Test
    public void DNIGrande()
    {
        DefinirPersonas();
        assertFalse(p2.DNIMenorA38Millones());
    }

    @Test
    public void Test1TieneHijoMenor()
    {
        DefinirPersonas();
        assertEquals(m1.HijosMenoresDeEdad().size(),1);
    }

    @Test
    public void Test2TieneHijoMenor()
    {
        DefinirPersonas();
        Hijo h2= new Hijo();
        h2.setEdad(18);
        m1.addHijo(h2);
        assertEquals(m1.HijosMenoresDeEdad().size(),1);
    }
}
