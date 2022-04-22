/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividadextra;

/**
 * Clse que muestra los datos de una Persona
 * @author IVAN-PC
 */
public abstract class Persona extends SerVivo{
    Mascota mascota;

    public Persona() {
    }
/**
 * Metodo que muestra los datos de una Persona
 * @param mascota 
 */
    public Persona(Mascota mascota) {
        this.mascota = mascota;
    }
/**
 * Metodo que muestra los datos de una Persona
 * @return Mascota de una Persona
 */
    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return super.toString()+"Persona{" + "mascota=" + mascota + '}';
    }

   
}
