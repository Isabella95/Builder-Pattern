package co.agenciaviajes.negocio;

import java.util.Date;

/**
 * Representa un cliente de la Agencia de viajes
 *
 * @author Libardo Pantoja, Ricardo Zambrano, Julio A. Hurtado
 */
public class Cliente {

    private String id;
    private String nombres;
    private String apellidos;
    private String genero;
    private String email;
    private Date fechaNac;
    
    // Completar constructor

    public Cliente() {
    }
    
    public Cliente(String id, String nombres, String apellidos, String genero, String email, Date fechaNac) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.genero = genero;
        this.email = email;
        this.fechaNac = fechaNac;
    }

    //Completar getters and setters
    public String toString() {
        return "Id: " + id + " Nombres: " + nombres + " Apellidos: " + apellidos;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    
    
}
