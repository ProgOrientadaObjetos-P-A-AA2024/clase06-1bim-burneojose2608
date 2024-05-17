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

    public Computador(String m, Memoria mem, Procesador pro) {
        marca = m;
        memoria = mem;
        procesador = pro;
    }

    public void establecerMarca(String x) {
        marca = x;
    }

    public void establecerProcesador(Procesador x) {
        procesador = x;
    }

    public void establecerMemoria(Memoria x) {
        memoria = x;

    }

    public void establecercostoComputadora() {
        costoComputador = memoria.obtenerCosto() + procesador.obtenerCosto();
    }

    public String obtenermarca() {
        return marca;
    }

    public Procesador obtenerProcesador() {
        return procesador;
    }

    public Memoria obtnerMemoria() {
        return memoria;
    }

    public double obtenerCostoComputadora() {
        return costoComputador;
    }
      public String toString() {
        String cadena = String.format("Marca Computadora: %s\n"
                + "Marca Memoria: %s\nMarca Procesador: %s\nCosto Memoria: %.2f"
                + "\nCosto Procesador: %.2f\nCosto Computador: %.2f\n"
                ,obtenermarca(),obtnerMemoria()
                ,obtenerProcesador().obtenerMarca()
                ,obtnerMemoria().obtenerCosto()
                ,obtenerProcesador().obtenerCosto()
                ,obtenerCostoComputadora());
        return cadena;
    }
}
