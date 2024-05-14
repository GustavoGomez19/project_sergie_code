public class App {
    public static void main(String[] args) throws Exception {
        
        Persona persona1 = new Persona("Gustavo", "Gómez", 31);
        Persona persona2 = new Persona();
        Persona persona3 = new Persona();
        Carrera carrera1 = new Carrera();
        Carrera carrera2 = new Carrera();
        Carrera carrera3 = new Carrera();

        Animal animal1 = new Animal("Bestia", 200);
        Gato gato1 = new Gato("Gael", 3);
        Perro perro1 = new Perro("Roko", 3);
        Perro perro2 = new Perro("Benji", 2);

        System.out.println("El animal llamado " + animal1.nombre + " hace el sonido " + animal1.hacerSonido());
        System.out.println("El animal llamado " + gato1.nombre + " hace el sonido " + gato1.hacerSonido());
        System.out.println("El animal llamado " + perro1.nombre + " hace el sonido " + perro1.hacerSonido());
        System.out.println("El animal llamado " + perro2.nombre + " hace el sonido " + perro2.hacerSonido());
        System.out.println("El total de animales creados es: " + Animal.getCantidadAnimales());

        
        System.out.println();
        persona1.carrera = carrera1;
        persona2.carrera = carrera2;
        persona3.carrera = carrera3;

        persona2.setNombre("Katerine");
        persona2.setApellido("Gil");
        persona2.setEdad(32);

        persona3.setNombre("María José");
        persona3.setApellido("Gómez");
        persona3.setEdad(6);

        System.out.println(persona1.verInformacion() + "Su profesión es: " + persona1.carrera.nombre);
        System.out.println();
        System.out.println(persona2.verInformacion() + "Su profesión es: " + persona2.carrera.nombre);
        System.out.println();
        System.out.println(persona3.verInformacion() + "Su profesión es: " + persona3.carrera.nombre);

    }
}
