package Colecciones;

//import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
//import java.util.TreeSet;

public class EjemploSet {

    public static void main(String[] args) {
        System.out.println("Bienvenidos a la fiesta de los superhéroes!");
        Set<String> superHeroes = new LinkedHashSet<>(); //Ordena por la forma de entrada de los datos
        //Set<String> superHeroes = new HashSet<>(); //No mantiene un orden
        //Set<String> superHeroes = new TreeSet<>(); //Ordena alfabeticamente
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

        superHeroes.remove("Wolverine");
        if (!superHeroes.contains("Wolverine")) {
            System.out.println("Wolverine se ha ido de la fiesta.!");
        }

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
        
    }
    
}