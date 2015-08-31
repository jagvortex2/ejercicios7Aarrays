package ejercicios;

/**
 * Created by Jhonatan on 15/05/2015.
 */
public class QuickSortClaseOrden {

public static void main(String[] args){
    int[] array1 = {10, 99, 5, 78, 98, 1, 3, 2, 8, 100};

    for(int x = 0; x < array1.length; ++x)
    {
        System.out.print(array1[x] + " ");
    }

    quickSort(array1,0, array1.length - 1 );

    System.out.println();
    for(int elementos : array1)
        System.out.print(elementos + " ");
}


    //EXCELENTE METODO DE ORDENACION "QUICKSORT"
    public static void quickSort(int a[], int left, int right){

        int pivot = a[left];         // tomamos primer elemento como pivote
        int j =  right;             // i realiza la búsqueda de izquierda a derecha
        int i = left;               // j realiza la búsqueda de derecha a izquierda
        int aux;


        while(i < j)
        {
            while(a[i] <= pivot && i<j)
                i++;                               // busca elemento mayor que pivote
            while(a[j]>pivot)
                j--;                               // busca elemento menor que pivote

            if (i < j) {                      // si no se han cruzado
                aux = a[i];                  // los intercambia
                a[i] = a[j];
                a[j] = aux;
            }
        }

        a[left] = a[j]; // se coloca el pivote en su lugar de forma que tendremos
        a[j] = pivot; // los menores a su izquierda y los mayores a su derecha
        if(left < j - 1)
            quickSort(a, left, j - 1); // ordenamos subarray izquierdo
        if(j + 1 < right)
            quickSort(a, j + 1, right); // ordenamos subarray derecho
    }

}
