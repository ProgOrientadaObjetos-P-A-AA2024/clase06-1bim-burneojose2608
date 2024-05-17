/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete3;

/**
 *
 * @author reroes
 */
public class Memoria {

    private String marca;
    private double costo;

    public Memoria(String x, double d) {
        marca = x;
        costo = d;
    }

    public void establcerMarca(String x) {
        marca = x;
    }

    public void establecerCosto(double x) {
        costo = x;
    }

    public String obteneMarca() {
        return marca;
    }

    public double obtenerCosto() {
        return costo;
    }
}
