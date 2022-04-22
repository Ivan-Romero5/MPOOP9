/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividadextra;

/**
 *Clase que muestra los datos de un Profesor de Asignatura
 * @author IVAN-PC
 */
public class ProfesorAsignatura extends Profesor{
    private String nombreAsignatura;
    private int grupos;

    public ProfesorAsignatura() {
    }
/**
 * Metodo que muestra los datos de un Profesor de Asignatura
 * @param nombreAsignatura
 * @param grupos
 * @param numAlumnos
 * @param salario
 * @param horaEntrada
 * @param horaSalida
 * @param mascota 
 */
    
    public ProfesorAsignatura(String nombreAsignatura, int grupos, int numAlumnos, float salario, String horaEntrada, String horaSalida, Mascota mascota) {
        super(numAlumnos, salario, horaEntrada, horaSalida, mascota);
        this.nombreAsignatura = nombreAsignatura;
        this.grupos = grupos;
    }
/**
 * Metodo que muestra los datos de un Profesor de Asignatura
 * @return nombreAsignatura, grupos
 */
    public String getNombreAsignatura() {
        return nombreAsignatura;
    }

    public void setNombreAsignatura(String nombreAsignatura) {
        this.nombreAsignatura = nombreAsignatura;
    }

    public int getGrupos() {
        return grupos;
    }

    public void setGrupos(int grupos) {
        this.grupos = grupos;
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
        return "ProfesorAsignatura{" + "nombreAsignatura=" + nombreAsignatura + ", grupos=" + grupos + '}';
    }
    
    
}
