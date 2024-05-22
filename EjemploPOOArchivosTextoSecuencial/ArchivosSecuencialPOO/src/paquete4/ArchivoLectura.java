/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


/**
 *
 * @author USUARIO
 */
public class ArchivoLectura {
     private Scanner entrada;
    private String nombreArchivo;
    private String rutaArchivo;
    private ArrayList<Empresa> lista;

    public ArchivoLectura(String n) {
        nombreArchivo = n;
        rutaArchivo = String.format("data/%s", nombreArchivo);

        try {
            entrada = new Scanner(new File(rutaArchivo));
            // entrada = new Scanner(System.in);
            // entrada = new Scanner(f);
        } // fin de try
        catch (FileNotFoundException e) {
            System.err.println("Error al leer del archivo - archivoLectura: " + e);

        } // fin de catch

    }

    public void establecerNombreArchivo(String n) {
        nombreArchivo = n;
    }

    public void establecerRutaArchivo() {
        rutaArchivo = String.format("data/%s.txt",
                obtenerNombreArchivo());
    }

    public String obtenerNombreArchivo() {
        return nombreArchivo;
    }

    public String obtenerRutaArchivo() {
        return rutaArchivo;
    }

    // establecer valores de cada línea
    // en la lista de tipo Profesor
    public void establecerLista() {
        lista = new ArrayList<>();
        File f = new File(rutaArchivo);

        if (f.exists()) {

            while (entrada.hasNext()) {
                String linea = entrada.nextLine(); // Tara Hernandez;contratado

                ArrayList<String> linea_partes = new ArrayList<>(
                        Arrays.asList(linea.split(";")) // ["Tara Hernandez", "contratado"]
                );
                Empresa p = new Empresa(linea_partes.get(0), // Tara Hernandez
                        linea_partes.get(1) // contratado
                );
                lista.add(p);
                
               /*
el archivo lecura extare todo y depues presenta en le to string

                */

            } // fin de while
        }
    }

    public ArrayList<Empresa> obtenerLista() {

        return lista;
    }

    public void cerrarArchivo() {
        if (entrada != null) {
            entrada.close();
        } // cierra el archivo

    }

    @Override
    public String toString() {
        String cadena = "   Empresas\n";
        for (int i = 0; i < obtenerLista().size(); i++) {
            Empresa empre1 = obtenerLista().get(i); // Obj. Profesor
            cadena = String.format("%s  %s\n", cadena,
                    i + 1,
                    empre1.obtenerNombre(), // obtenerLista().get(i).obtenerNombre(),
                    empre1.obtenerCiudad());    // obtenerLista().get(i).obtenerTipo());
        }
        return cadena;
    }
    
}
