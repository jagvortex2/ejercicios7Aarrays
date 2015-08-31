package ejercicios;


import java.util.Scanner;
/**
 * Created by Jhonatan on 18/05/2015.
 */
public class TwoDimensionalArrayDemo {
    public static void main(String[] args){
        //declaramos un array(matriz en este caso) bidimensional de 3 columnas y tres filas
        int[][] count = new int[3][3];


        //declaramos un objeto Scanner para capturar entrada del usuario
        Scanner input = new Scanner(System.in);

        //declaramos una constante que servira como escape del programa
        final int QUIT = 99;

        //declaramos dos variables q seran los suscriptores para poder poblar y acceder a los elementos del array(matriz en este caso)
        int row, column;

        //pedimos al usuario que ingrese el numero de la fila o 99 para salir
        System.out.print("Enter a row or " + QUIT
        + " to quit > ");

        //inicializamos la variable row con el valor ingresado por el usuario
        row = input.nextInt();

        //comienza el loop que seguira indefinidamente mientras el usuario no ingrese 99
        while(row != QUIT)
        {
            System.out.print("Enter a column > ");                              //se pide al usuario ingresar el numero de una columna
            column = input.nextInt();                                           //se inicializa la variable column con el valor ingresado por el usuario

            //la sentencia if comprueba q los valores ingresados por el usuarios esten dentro del rango del array
            if(row < count.length && column < count[row].length)
            {
                count[row][column]++;

                for(int r = 0; r < count.length; ++r)
                {
                 for(int c = 0; c < count[r].length; ++c)
                     System.out.print(count[r][c] + " ");
                    System.out.println();
                }
            }
            else
                System.out.println("Invalid position selected");


            System.out.print("Enter a row or " + QUIT + "to quit > ");
            row = input.nextInt();

        }


    }
}
