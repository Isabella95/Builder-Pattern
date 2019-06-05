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
public class SanAndresBuilder extends PlanBuilder {

    @Override
    public void buildCliente() {
        try {
            Cliente cli = new Cliente("123234", "Manuel", "Sanchez", "M", "manuel@gmail.com", new SimpleDateFormat("dd/MM/yyyy").parse("01/05/1988"));
            plan.setCliente(cli);
            plan.setTotalAdultos(2);
            plan.setTotalNinos(1);
        } catch (ParseException ex) {
            Logger.getLogger(SanAndresBuilder.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void buildTransportes() {
        plan.setTransporte("Cali - San Andres");
        // Se simplifica la lógica, pero en realidad este dato vendría de un servicio a las aerolineas
        plan.sumarValor(900000 * (this.plan.getTotalAdultos() + this.plan.getTotalNinos()));

    }

    @Override
    public void buildAlojamiento() {
        plan.setAlojamiento("Hostal el vecino");
        // Se simplifica la lógica, pero en realidad este dato vendría de un servicio a los hoteles
        plan.sumarValor(300000);
    }

    @Override
    public void buildAlimentacion() {
        // Se simplifica la lógica, pero en realidad este dato vendría de un servicio a los hoteles
        plan.setAlimentacion("Desayuno, almuerzo y cena");
    }

    @Override
    public void buildSeguroHotelero() {
        // Se simplifica la lógica, pero en realidad este dato vendría de un servicio a los hoteles
        plan.setSeguroHotelero(true);
        plan.sumarValor(56000);
    }

    @Override
    public void buildImpuestoTiquete() {
        // Se simplifica la lógica, pero en realidad este dato vendría de un servicio a las aerolineas
        plan.setImpuestoTiqute(true);
        plan.sumarValor(32000);
    }

    @Override
    public void buildTours() {
        String tours[] = {"Vuelta a la isla", "Tour por la bahia", "Manglares y mantarrayas"};
        plan.setTours(tours);
    }

}
