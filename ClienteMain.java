package co.agenciaviajes.clientemain;

import co.agenciaviajes.negocio.CartagenaBuilder;
import co.agenciaviajes.negocio.DirectorPlan;
import co.agenciaviajes.negocio.PlanBuilder;
import co.agenciaviajes.negocio.SanAndresBuilder;
import co.agenciaviajes.negocio.Plan;
import co.agenciaviajes.negocio.SantaMartaBuilder;

/**
 *
 * @author Libardo Pantoja, Ricardo Zambrano, Julio A. Hurtado
 */
public class ClienteMain {

    /**
     * Simula un objeto cliente que consume los servicios del bulider
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DirectorPlan director = new DirectorPlan();
        PlanBuilder sanAndres = new SanAndresBuilder();
        director.setPlanBuilder(sanAndres);
        director.construirPlan();

        Plan plan = director.getPlan();
        System.out.println("Plan:" + plan);

        PlanBuilder cartagena = new CartagenaBuilder();
        director.setPlanBuilder(cartagena);
        director.construirPlan();
        plan = director.getPlan();
        System.out.println("Plan:" + plan);
        
        
        PlanBuilder santamarta = new SantaMartaBuilder();
        director.setPlanBuilder(santamarta);
        director.construirPlan();
        plan = director.getPlan();
        System.out.println("Plan:" + plan);
    }
}
