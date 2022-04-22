/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividadextra;

/**
 * Clase que muestra los datos de un Empleado
 * @author IVAN-PC
 */
public abstract class Empleado extends Persona{
    private float salario;
    private String horaEntrada;
    private String horaSalida;

    public Empleado() {
    }
/**
 * Metodo que muestra los datos de un Empleado
 * @param salario
 * @param horaEntrada
 * @param horaSalida
 * @param mascota 
 */
    public Empleado(float salario, String horaEntrada, String horaSalida, Mascota mascota) {
        super(mascota);
        this.salario = salario;
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
    }
/**
 * Metodo que muestra los datos de un Empleado
 * @return salario, horaEntrada, horaSalida
 */
    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(String horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public String getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
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
        return super.toString()+"Empleado{" + "salario=" + salario + ", horaEntrada=" + horaEntrada + ", horaSalida=" + horaSalida + '}';
    }

      
}
