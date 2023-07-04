import java.util.InputMismatchException;
import java.util.Scanner;
public class DivisionCON_Excepcion {
    //este ejercicio especifico la división donde el ususario puede ingresar 0 en el denominador
    public static int cociente( int numerador, int denominador )
            throws ArithmeticException {
        return numerador / denominador; // posible división entre cero
        }

    public static void main(String[] args) {
        Scanner explorador = new Scanner( System.in ); // objeto Scanner para entrada
        boolean continuarCiclo = true; // determina si se necesitan más datos de entrada
        do{
            //dentro del try excrivo que que quiero realizar, asi sea posible generar una excepcion
            try {
                //establezcomo como se realiza mi division
                System.out.print("Introduzca un numerador entero: ");
                int numerador = explorador.nextInt();
                System.out.print("Introduzca un denominador entero: ");
                int denominador = explorador.nextInt();

                int resultado = cociente(numerador, denominador);
                System.out.printf("\nResultado: %d / %d = %d\n", numerador, denominador, resultado);

                continuarCiclo = false; // entrada exitosa; termina el ciclo

            }catch ( InputMismatchException inputMismatchException ){
                //en caso de que se desee dividir para cero dentro del try, en catch especifico el mensaje que quiero mostrar
                //por la excepcion generada
                //que hacer/mostrar si el try no se ejecuta correctamente
                System.err.printf( "\nExcepcion: %s\n", inputMismatchException ); //es donde se imprimen mensajes de error, cuando algo sale mal o pasa algo inesperado,
                explorador.nextLine(); // descarta entrada para que el usuario intente otra vez
                System.out.println("Debe introducir enteros. Intente de nuevo.\n" );
            }
            catch ( ArithmeticException arithmeticException ) {
                System.err.printf( "\nExcepcion: %s\n", arithmeticException );
                System.out.println("Cero es un denominador invalido. Intente de nuevo.\n" );
                }

        }while (continuarCiclo);
    }

}
