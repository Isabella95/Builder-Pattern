
package co.agenciaviajes.negocio;

import java.util.Arrays;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Libardo, Ricardo, Julio
 */
public class PruebaIntegracionTest {
    
    public PruebaIntegracionTest() {
    }

    /**
     * Test del plan San Andres
     */
    @Test
    public void testSanAndres() {
        System.out.println("Test plan San Andres");
        
        DirectorPlan director = new DirectorPlan();
        PlanBuilder sanAndres = new SanAndresBuilder();
        director.setPlanBuilder(sanAndres);
        director.construirPlan();
        Plan plan = director.getPlan();
        
        assertEquals("Cali - San Andres", plan.getTransporte());
        assertEquals("Manuel", plan.getCliente().getNombres());
        assertEquals("Sanchez", plan.getCliente().getApellidos());        
        assertEquals("Hostal el vecino", plan.getAlojamiento());
        assertEquals("Desayuno, almuerzo y cena", plan.getAlimentacion());
        assertEquals(true, plan.isImpuestoTiqute());
        assertEquals(true, plan.isSeguroHotelero());
        assertEquals("[Vuelta a la isla, Tour por la bahia, Manglares y mantarrayas]", Arrays.toString(plan.getTours()));
        assertEquals(true, plan.isImpuestoTiqute());
        assertEquals(3088000, plan.getValor());
    }

    /**
     * Test del plan Cartagena
     */
    @Test
    public void testCartagena() {
        System.out.println("Test plan Cartagena");
        
        DirectorPlan director = new DirectorPlan();
        PlanBuilder cartagena = new CartagenaBuilder();
        director.setPlanBuilder(cartagena);
        director.construirPlan();
        Plan plan = director.getPlan();
        
        assertEquals("Cali - Cartagena", plan.getTransporte());
        assertEquals("Andrea", plan.getCliente().getNombres());
        assertEquals("Fernandez", plan.getCliente().getApellidos());
        assertEquals("Hotel Cartagena Premium", plan.getAlojamiento());
        assertEquals("Desayunos, almuerzos y cenas", plan.getAlimentacion());
        assertEquals(true, plan.isImpuestoTiqute());
        assertEquals(true, plan.isSeguroHotelero());
        assertEquals("[Playa blanca con almuerzo]", Arrays.toString(plan.getTours()));
        assertEquals(true, plan.isImpuestoTiqute());
        assertEquals(6115000, plan.getValor());
    }    
    
}
