import Exceptions.DividirPorCeroException;

public class App {
    public static void main(String[] args) throws Exception {
        //Excepciones: son eventos que interrumpen el flujo normal de la aplicación

        int num1 = 10;
        int num2 = 0;
        int resultado;

        Calculadora calc = new Calculadora();

        try {
            resultado = calc.dividir(num1, num2);
            System.out.println("Resultado: " + resultado);
        } catch (DividirPorCeroException e) {
            // TODO: handle exception
            e.printStackTrace();;
            System.out.println("Mensaje después de la excepción.");
        } finally {
            System.out.println("Hemos finalizado la ejecución de la aplicación, ya se que la operación se haya ralizado o no.");
        }
    }
}
