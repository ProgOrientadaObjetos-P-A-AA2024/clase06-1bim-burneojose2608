/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete3;

/**
 *
 * @author reroes
 */
public class Procesador {
    private String marca;
    private double costo;
    public void establecerMarca(String x){
        marca = x;
    }
    public void establecerCost(double x){
        costo = x;
    }
    public String obtenerMarca(){
        return marca;
    }
    public double obtenerCosto(){
        return costo;
    }
}
