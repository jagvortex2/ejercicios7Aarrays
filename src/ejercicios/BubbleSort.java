package ejercicios;

/**
 * Created by Jhonatan on 08/05/2015.
 */
public class BubbleSort {
    public static void main(String[] args){
        int[] someNums = {88, 33, 99, 22, 54};
        int b;
        int comparissonsToMake = someNums.length - 1;
        int temp;

        //Mostrar los elementos del array antes de ordenarlos
        for(int a = 0;a < someNums.length;++a)
            System.out.print(" " + someNums[a]);
        System.out.println();

        for(int a = 0;a < someNums.length; ++a)
        {
            for (b = 0; b < comparissonsToMake; ++b)
            {
                if (someNums[b] > someNums[b + 1]) {
                    temp = someNums[b];
                    someNums[b] = someNums[b + 1];
                    someNums[b + 1] = temp;
                }
            }
          --comparissonsToMake;
        }
        for(int a = 0;a < someNums.length;++a)
        System.out.print(" " + someNums[a]);
    }

}

