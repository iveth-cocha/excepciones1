import java.util.Scanner;
public class DivisionsinExcepcion {
    //Division entre cero sin excepciones

    //este ejercicio solo especifico la división donde el ususario puede ingresar 0 en el denominador
    public static int cociente( int numerador, int denominador ){//defino variables a usar
        return numerador / denominador;
    }

    public static void main(String[] args) {
        Scanner explorador = new Scanner( System.in );//permito el ingreso por teclado

        System.out.print( "Introduzca un numerador entero: " );
        int numerador = explorador.nextInt();

        System.out.print( "Introduzca un denominador entero: " );
        int denominador = explorador.nextInt();

        int resultado = cociente( numerador, denominador ); //useo de la funcion creada arriba
        System.out.printf("\nResultado: %d / %d = %d\n", numerador, denominador, resultado);


    }


}
