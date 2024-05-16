/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete3;

/**
 *
 * @author reroes
 */
public class Computador {

    private String marca;
    private Procesador procesador;
    private Memoria memoria;
    private double costoComputador;

    public void establecerMarca(String x) {
        marca = x;
    }

    public void establecerProcesador(Procesador x) {
        procesador = x;
    }

    public void establecerMemoria(Memoria x) {
        memoria = x;

    }

    public void establecercostoComputadora(String x) {
    costoComputador = memoria.obtenerCosto() + procesador.obtenerCosto();
    }
    public String obtenermarca(){
        return marca;
    }
    public Procesador obtenerProcesador(){
        return procesador;
    }
    public Memoria obtnerMemoria(){
        return memoria;
    }
    public double obtenerCostoComputadora(){
        return costoComputador;
    }
}
