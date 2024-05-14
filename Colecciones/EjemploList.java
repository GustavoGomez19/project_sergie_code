package Colecciones;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class EjemploList {
    public static void main(String[] args) {
        System.out.println("Bienvenidos a la fiesta de los superhéroes!");
        //List<String> superHeroes = new ArrayList<>();
        //List<String> superHeroes = new LinkedList<>();
        List<String> superHeroes = new Vector<>();
        superHeroes.add("Spiderman");
        superHeroes.add("Wolverine");
        superHeroes.add("Deadpool");
        superHeroes.add("Iron Man");
        superHeroes.add("Super Man");

        //Llegó tarde a la fiesta
        superHeroes.add("Wonder Woman");

        if (superHeroes.contains("Spiderman")) {
            System.out.println("Spiderman está en la fiesta");
        }

        superHeroes.remove(1);
        if (!superHeroes.contains("Wolverine")) {
            System.out.println("Wolverine se ha ido de la fiesta.!");
        }

        System.out.println("El super héroe " + superHeroes.get(1) + " ya está ebrio.");

        //Super Man fue y volvió tan rápido que no nos dimos cuenta
        superHeroes.add("Super Man");

        if (superHeroes.isEmpty()) {
            System.out.println("La fiesta se ha acabado y todos se fueron a dormir.");
        } else {
            System.out.println("La fiesta continua y hay " + superHeroes.size() + " super héroes en la fiesta!.");
        }

        System.out.println("Quienes están aún en la fiesta?");
        for (String superHeroe : superHeroes) {
    
            System.out.println(superHeroe);
        }

        System.out.println(superHeroes.set(1, "Wade Jhonson") + " se quita el traje y muestra su verdadera identidad y ahora es: " + superHeroes.get(1));

        System.out.println("Quienes están aún en la fiesta?");
        for (String superHeroe : superHeroes) {
    
            System.out.println(superHeroe);
        }
    }
}
