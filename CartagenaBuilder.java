package co.agenciaviajes.negocio;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * ConcreteBuilder
 *
 * @author Libardo Pantoja, Julio Hurtado, Ricardo Zambrano
 */
public class CartagenaBuilder extends PlanBuilder {

    @Override
    public void buildCliente() {
       try {
            Cliente cli = new Cliente("123234", "Andrea", "Fernandez", "F", "andreita@gmail.com", new SimpleDateFormat("dd/MM/yyyy").parse("01/05/1988"));
            plan.setCliente(cli);
            plan.setTotalAdultos(2);
            plan.setTotalNinos(1);
        } catch (ParseException ex) {
            Logger.getLogger(CartagenaBuilder.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void buildTransportes() {
        plan.setTransporte("Cali - Cartagena");
        // Se simplifica la lógica, pero en realidad este dato vendría de un servicio a las aerolineas
        plan.sumarValor(1900000 * (this.plan.getTotalAdultos() + this.plan.getTotalNinos()));
    }

    @Override
    public void buildAlojamiento() {
         plan.setAlojamiento("Hotel Cartagena Premium");
        // Se simplifica la lógica, pero en realidad este dato vendría de un servicio a los hoteles
         plan.sumarValor(300000);
    }

    @Override
    public void buildAlimentacion() {
        // Se simplifica la lógica, pero en realidad este dato vendría de un servicio a los hoteles
        plan.setAlimentacion("Desayunos, almuerzos y cenas");
    }

    @Override
    public void buildSeguroHotelero() {
        // Se simplifica la lógica, pero en realidad este dato vendría de un servicio a los hoteles
        plan.setSeguroHotelero(true);
        plan.sumarValor(70000);
    }

    @Override
    public void buildImpuestoTiquete() {
        // Se simplifica la lógica, pero en realidad este dato vendría de un servicio a las aerolineas
        plan.setImpuestoTiqute(true);
        plan.sumarValor(45000);
    }

    @Override
    public void buildTours() {
        String tours[] = {"Playa blanca con almuerzo"};
        plan.setTours(tours);
    }
    // Completar métodos
}
