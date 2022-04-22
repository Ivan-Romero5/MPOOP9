/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividadextra;

/**
 *Clases que muestra los datos de un Profesor
 * @author IVAN-PC
 */
public abstract class Profesor extends Empleado{
    private int numAlumnos;

    public Profesor() {
    }
/**
 * Metodo que muestra los datos de un Profesor
 * @param numAlumnos
 * @param salario
 * @param horaEntrada
 * @param horaSalida
 * @param mascota 
 */
    public Profesor(int numAlumnos, float salario, String horaEntrada, String horaSalida, Mascota mascota) {
        super(salario, horaEntrada, horaSalida, mascota);
        this.numAlumnos = numAlumnos;
    }
/**
 * Metodo que muestra los datos de un Profesor
 * @return NumAlumnos
 */
    public int getNumAlumnos() {
        return numAlumnos;
    }

    public void setNumAlumnos(int numAlumnos) {
        this.numAlumnos = numAlumnos;
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
        return "Profesor{" + "numAlumnos=" + numAlumnos + '}';
    }

    
}
