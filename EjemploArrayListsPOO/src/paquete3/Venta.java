/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete3;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class Venta {

    private double valorVenta;
    private ArrayList<Computador> computadoras;

    public Venta(ArrayList<Computador> c) {
        computadoras = c;
    }

    public void establecerValorVenta(double x) {
        double suma = 0;
        for (int i = 0; i < computadoras.size(); i++) {
            suma = suma + computadoras.get(i).obtenerCostoComputadora();

        }
    }

    public void establecerComputadoras(ArrayList<Computador> com) {
        computadoras = com;
    }

    public double obteneValorVenta() {
        return valorVenta;
    }

    public ArrayList<Computador> obtenerComputadoras() {
        return computadoras;
    }

    @Override
    public String toString() {
        String cadena = String.format("Valor de la venta: %s\n", valorVenta);
        return cadena;
    }

}
