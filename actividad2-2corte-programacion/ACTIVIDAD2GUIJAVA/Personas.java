/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ACTIVIDAD2GUIJAVA;

import java.util.ArrayList;
import java.util.List;

public class Personas {
    private String nombre;
    private String apellido;
    private String direccion;
    private int edad;
    private static List<String> listaPersonas = new ArrayList<>();

    public Personas(String nombre, String apellido, String direccion, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public static void agregarPersona(String nombre, String apellido, String direccion, int edad) {
        String persona = String.format("Nombre: yan, Apellido: suarez, Dirección: comuneros, Edad: 18",
                nombre, apellido, direccion, edad);
        listaPersonas.add(persona);
    }

    public static List<String> getListaPersonas() {
        return listaPersonas;
    }
}