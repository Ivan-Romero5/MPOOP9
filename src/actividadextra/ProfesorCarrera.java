/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividadextra;

/**
 *Clase que muestra los datos de un Profesor de Carrera
 * @author IVAN-PC
 */
public class ProfesorCarrera extends Profesor{
    private int numAsignatura;

    public ProfesorCarrera() {
    }
/**
 * Metodos que muestra los datos de un Profesor de Carrera
 * @param numAsignatura
 * @param numAlumnos
 * @param salario
 * @param horaEntrada
 * @param horaSalida
 * @param mascota 
 */
    public ProfesorCarrera(int numAsignatura, int numAlumnos, float salario, String horaEntrada, String horaSalida, Mascota mascota) {
        super(numAlumnos, salario, horaEntrada, horaSalida, mascota);
        this.numAsignatura = numAsignatura;
    }
/**
 * Metodo que muestra los datos de un Profesor de Carrera
 * @return 
 */

    public int getNumAsignatura() {
        return numAsignatura;
    }

    public void setNumAsignatura(int numAsignatura) {
        this.numAsignatura = numAsignatura;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "ProfesorCarrera{" + "numAsignatura=" + numAsignatura + '}';
    }

}
