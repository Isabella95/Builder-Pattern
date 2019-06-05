package co.agenciaviajes.negocio;

import java.util.Arrays;
import java.util.Date;

/**
 *
 * @author Libardo Pantoja, Julio Hurtado, Ricardo Zambrano
 */
public class Plan {

    private Cliente cliente;
    private Date fechaSalida;
    private Date fechaLlegada;
    private String transporte;
    private String alojamiento;
    private String alimentacion;
    private boolean seguroHotelero;
    private boolean impuestoTiqute;
    private String[] tours;
    private int totalAdultos;
    private int totalNinos;
    /**
     * Valor total a pagar
     */
    private int valor;
    
    // Completar constructor

    public Plan() {
    }

    public Plan(Cliente cliente, Date fechaSalida, Date fechaLlegada, String transporte, String alojamiento, String alimentacion, boolean seguroHotelero, boolean impuestoTiqute, String[] tours, int totalAdultos, int totalNinos, int valor) {
        this.cliente = cliente;
        this.fechaSalida = fechaSalida;
        this.fechaLlegada = fechaLlegada;
        this.transporte = transporte;
        this.alojamiento = alojamiento;
        this.alimentacion = alimentacion;
        this.seguroHotelero = seguroHotelero;
        this.impuestoTiqute = impuestoTiqute;
        this.tours = tours;
        this.totalAdultos = totalAdultos;
        this.totalNinos = totalNinos;
        this.valor = valor;
    }

    // Completar métodos
    /**
     * Incrementa o suma el valor actual del plan
     * @param incremento incremento a sumar
     */
    public void sumarValor(int incremento) {
        this.valor += incremento;
    }

    public String toString() {
        return "Cliente: " + cliente.toString() + " Transporte:" + transporte + " Alojamiento:" + alojamiento 
                + " Alimentación: " + alimentacion + " Impuesto tiquete: " + impuestoTiqute + " Tours: " 
                + Arrays.toString(tours) + " Valor $: " + valor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public Date getFechaLlegada() {
        return fechaLlegada;
    }

    public void setFechaLlegada(Date fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
    }

    public String getTransporte() {
        return transporte;
    }

    public void setTransporte(String transporte) {
        this.transporte = transporte;
    }

    public String getAlojamiento() {
        return alojamiento;
    }

    public void setAlojamiento(String alojamiento) {
        this.alojamiento = alojamiento;
    }

    public String getAlimentacion() {
        return alimentacion;
    }

    public void setAlimentacion(String alimentacion) {
        this.alimentacion = alimentacion;
    }

    public boolean isSeguroHotelero() {
        return seguroHotelero;
    }

    public void setSeguroHotelero(boolean seguroHotelero) {
        this.seguroHotelero = seguroHotelero;
    }

    public boolean isImpuestoTiqute() {
        return impuestoTiqute;
    }

    public void setImpuestoTiqute(boolean impuestoTiqute) {
        this.impuestoTiqute = impuestoTiqute;
    }

    public String[] getTours() {
        return tours;
    }

    public void setTours(String[] tours) {
        this.tours = tours;
    }

    public int getTotalAdultos() {
        return totalAdultos;
    }

    public void setTotalAdultos(int totalAdultos) {
        this.totalAdultos = totalAdultos;
    }

    public int getTotalNinos() {
        return totalNinos;
    }

    public void setTotalNinos(int totalNinos) {
        this.totalNinos = totalNinos;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
    
    
    
}
