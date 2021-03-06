/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author JAIRO
 */
public class AudioLibro extends Publicacion {
    private double duracion;
    private double peso;
    private String formato;

    public AudioLibro(String idbn) {
        super(idbn);
    }

    public AudioLibro() {
    }

    public AudioLibro( String idbn, String titulo, String autor, int anio,  double costo, double duracion, double peso, String formato ) {
        super(idbn, titulo, autor, anio, costo);
        this.duracion = duracion;
        this.peso = peso;
        this.formato = formato;
    }

    /**
     * @return the duracion
     */
    public double getDuracion() {
        return duracion;
    }

    /**
     * @param duracion the duracion to set
     */
    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    /**
     * @return the peso
     */
    public double getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }

    /**
     * @return the formato
     */
    public String getFormato() {
        return formato;
    }

    /**
     * @param formato the formato to set
     */
    public void setFormato(String formato) {
        this.formato = formato;
    }

    @Override
    public String toString() {
        return "AudioLibro{" +super.toString() + ", duracion=" + duracion + ", peso=" + peso + ", formato=" + formato + '}';
    }

    @Override
    public String getDataStringFormat() {
        return this.idbn + ";" + this.titulo + ";" + this.autor + ";" + "AUDIOLIBRO" + ";" + this.anio + ";" + this.costo + ";" +" - " + ";" + " - " + ";" + this.formato + ";" + this.duracion + ";" + this.peso + "\n";
    }

    @Override
    public String getStringFormat() {
        
        String cadena = String.format("%-10s %-10s %-30s %-30s %-10s %-10s %-10.2f %-10.2f %-10s", 
                "Audio Libro", this.idbn, this.titulo, this.autor, this.costo, "0", "0", this.peso,this.duracion,this.formato); 
        return cadena;
    }
    
    
    
}
