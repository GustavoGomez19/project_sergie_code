package Colecciones;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.Map;

public class EjemploMaps {
    public static void main(String[] args) {
        System.out.println("Bienvenido a nuestro fruver el Java");
        //Map<String, Double> inventario = new HashMap<>(); //No respeta el orden
        //Map<String, Double> inventario = new TreeMap<>(); //Ordena alfabeticamente
        Map<String, Double> inventario = new LinkedHashMap<>(); //Mantiene el orden con el que se ingresaron los datos
        inventario.put("Banano", 1.89);
        inventario.put("Toamte", 1.50);
        inventario.put("Aguacate", 1.40);
        inventario.put("Fresa", 1.75);
        inventario.put("Naranja", 1.25);

        System.out.println("Inventario del fruver: ");
        // KeySet obtiene el arreglo de las claves
        for (String fruta : inventario.keySet()) {
            // Con get se obtiene el valor de la clave
            System.out.println(fruta + ": $" + inventario.get(fruta));
        }

        String fruaBuscada = "Naranja";
        System.out.println("Llegó un cliente a comprar");

        if (inventario.containsKey(fruaBuscada)) {
            System.out.println(fruaBuscada + " está en el inventario, cuantas desea");
        } else {
            System.out.println("No hay " + fruaBuscada);
        }

        String sinStock = "Naranja";
        inventario.remove(sinStock);
        System.out.println("Se acabaron las " + sinStock);

        System.out.println("Inventario actual");

        for (String fruta : inventario.keySet()) {
            System.out.println(fruta + ": $" + inventario.get(fruta));
        }

        System.out.println("La cantidad de producto en inventario es: " + inventario.size());

    }
}
