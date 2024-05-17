/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete3;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

/**
 *
 * @author USUARIO
 */
public class Ejecutor {
    public static void main(String[] args) {
        // listado de variables para ingreso de datos por teclado
        Scanner entrada = new Scanner(System.in);
        
        int compu;
        String memoriaMarca;
        double memoriaCosto;
        String marcaPocesador;
        double costoProcesador;
        String marca;
        ArrayList<Computador> computadoras = new ArrayList<>();
        String almacenador = "";
        String cadenaFinal= "";

        System.out.println("Ingrese la cantidad de computadoras ");
        compu = entrada.nextInt();
        entrada.nextLine();

        for (int i = 0; i < compu; i++) {
            System.out.println("Ingrese la marca del  Computador");
            marca = entrada.nextLine();
            System.out.println("Ingrese la marca de la Memoria");
            memoriaMarca = entrada.nextLine();
            System.out.println("Ingrese el costo de la Memoria");
            memoriaCosto = entrada.nextDouble();

            Memoria memoria1 = new Memoria(memoriaMarca, memoriaCosto);
            entrada.nextLine();
            System.out.println("Ingrese la marca del Procesador");
            marcaPocesador = entrada.nextLine();
            System.out.println("Ingrese el costo del Procesador");
            costoProcesador = entrada.nextDouble();

            Procesador procesador1 = new Procesador(marcaPocesador, costoProcesador);
            Computador compu1 = new Computador(marca, memoria1, procesador1);
            compu1.establecercostoComputadora();
            entrada.nextLine();
            almacenador = String.format("%s%s", almacenador, compu1);
            computadoras.add(compu1);
            Venta venta1 = new Venta(computadoras);
            venta1.establecerValorVenta(compu1.obtenerCostoComputadora());
           cadenaFinal = String.format("%s", venta1);

        }
        System.out.printf("%s%s", almacenador, cadenaFinal);

    }
    
}
