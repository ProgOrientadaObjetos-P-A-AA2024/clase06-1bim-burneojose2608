/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete3;

import java.util.ArrayList;
import paquete2.Calificacion;

/**
 *
 * @author reroes
 */
public class Venta {

    private double valorVenta;
    private ArrayList<Computador> computadoras;

    public void establecerValorVenta() {
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
     public ArrayList<Computador> obtenerComputadoras(){
        return computadoras;
    }
}
