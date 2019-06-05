package co.agenciaviajes.negocio;

/**
 * Abstract Builder
 *
 * @author Libardo Pantoja, Julio Hurtado, Ricardo Zambrano
 */
public abstract class PlanBuilder {

    protected Plan plan;

    public void crearNuevoPlan() {
        plan = new Plan();
    }

    // Completar métodos
    public abstract void buildCliente();
    public abstract void buildTransportes();
    public abstract void buildAlojamiento();
    public abstract void buildAlimentacion();
    public abstract void buildSeguroHotelero();
    public abstract void buildImpuestoTiquete();
    public abstract void buildTours();
}
