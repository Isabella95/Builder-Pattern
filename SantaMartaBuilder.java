/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.agenciaviajes.negocio;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ingesis
 */
public class SantaMartaBuilder extends PlanBuilder{
    @Override
    public void buildCliente() {
       try {
            Cliente cli = new Cliente("123234", "Manuel", "Sanchez", "M", "manuel@gmail.com", new SimpleDateFormat("dd/MM/yyyy").parse("01/05/1988"));
            plan.setCliente(cli);
            plan.setTotalAdultos(2);
            plan.setTotalNinos(1);
        } catch (ParseException ex) {
            Logger.getLogger(SantaMartaBuilder.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void buildTransportes() {
        plan.setTransporte("Popayán - Santa Marta");
        // Se simplifica la lógica, pero en realidad este dato vendría de un servicio a las aerolineas
        plan.sumarValor(19000000 * (this.plan.getTotalAdultos() + this.plan.getTotalNinos()));
    }

    @Override
    public void buildAlojamiento() {
         plan.setAlojamiento("Masaya Hostel");
        // Se simplifica la lógica, pero en realidad este dato vendría de un servicio a los hoteles
         plan.sumarValor(500000);
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
        plan.sumarValor(60000);
    }

    @Override
    public void buildImpuestoTiquete() {
        // Se simplifica la lógica, pero en realidad este dato vendría de un servicio a las aerolineas
        plan.setImpuestoTiqute(true);
        plan.sumarValor(55000);
    }

    @Override
    public void buildTours() {
        String tours[] = {"Vuelta al Rodadero", "Tour por Ciudad Perdida", "Parque Tayrona y"
                + "Hermosas playas como Bahía Concha"};
        plan.setTours(tours);
    }
    // Completar métodos
}
