/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividadextra;

/**
 * Clase que muestra los datos de un Alumno
 * @author IVAN-PC
 */
public class Alumno extends Persona{
    private String Carrera;
    private String semestre;

    public Alumno() {
    }
/**
 * Metodo que muestra los datos de un ALumno
 * @param Carrera
 * @param semestre
 * @param mascota 
 */
    public Alumno(String Carrera, String semestre, Mascota mascota) {
        super(mascota);
        this.Carrera = Carrera;
        this.semestre = semestre;
    }

/**
 * Metodo que muestra los datos de un Alumno
 * @return Carrera, Semestre 
 */  
    public String getCarrera() {
        return Carrera;
    }

    public void setCarrera(String Carrera) {
        this.Carrera = Carrera;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return super.toString()+"Alumno{" + "Carrera=" + Carrera + ", semestre=" + semestre + '}';
    }
}
