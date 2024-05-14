public class Persona {

    // Atributos de la clase
    private String nombre;
    private String apellido;
    private int edad;   
    Carrera carrera;

    // Método constructor de la clase sin argumentos
    public Persona(){};

    // Método constructor de la clase con argumentos
    public Persona(String nombre, String apellido, int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    // Métodos Getters y Setters
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getApellido(){
        return apellido;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }

    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }

    // Método que muestra toda la información de la persona
    public String verInformacion(){
        System.out.println("INFORMACIÓN DE LA PERSONA");
        if(nombre.equalsIgnoreCase("Gustavo")) carrera.nombre = "Ingeniero de sistemas";
        if(nombre.equalsIgnoreCase("Katerine")) carrera.nombre = "Profesora";
        if(nombre.equalsIgnoreCase("María José")) carrera.nombre = "Estudiante";
        return "Nombre: " + nombre + "\nApellido: " + apellido + "\nEdad: " + edad +"\n";
    }

}
