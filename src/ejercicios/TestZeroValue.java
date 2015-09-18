package ejercicios;

/**
 * Created by Jhonatan on 17/9/2015.
 */
public class TestZeroValue {
    public static void main(String[] args){
        int value = -10;
        int zero = 0;
        System.out.println( "un numero negativo es menor que cero? "+ testValue(value, zero));
    }
public static boolean testValue(int val1, int val2){
    boolean result = false;
    if(val1 < val2)
        result = true;
    return result;
}
}
