/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividadextra;

/**
 * Clase que muestra los datos de un Mesero
 * @author IVAN-PC
 */
public class Mesero extends Empleado{
    private String restaurante;
    private int numMesas;
    private String colorUniforme;

    public Mesero() {
    }
/**
 * Metodo que muestra los datos de un Mesero
 * @param restaurante
 * @param numMesas
 * @param colorUniforme
 * @param salario
 * @param horaEntrada
 * @param horaSalida
 * @param mascota 
 */
    public Mesero(String restaurante, int numMesas, String colorUniforme, float salario, String horaEntrada, String horaSalida, Mascota mascota) {
        super(salario, horaEntrada, horaSalida, mascota);
        this.restaurante = restaurante;
        this.numMesas = numMesas;
        this.colorUniforme = colorUniforme;
    }
/**
 * Metodo que muestra los datos de un Mesero
 * @return restaurante, numero de mesas, color de uniforme
 */
   

    public String getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(String restaurante) {
        this.restaurante = restaurante;
    }

    public int getNumMesas() {
        return numMesas;
    }

    public void setNumMesas(int numMesas) {
        this.numMesas = numMesas;
    }

    public String getColorUniforme() {
        return colorUniforme;
    }

    public void setColorUniforme(String colorUniforme) {
        this.colorUniforme = colorUniforme;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public String toString() {
        return super.toString()+"Mesero{" + "restaurante=" + restaurante + ", numMesas=" + numMesas + ", colorUniforme=" + colorUniforme + '}';
    }
}
