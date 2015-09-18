package ejercicios;

/**
 * Created by Jhonatan on 31/8/2015.
 */
public class TestDigitalCamera {
    public static void main(String[]args){
        DigitalCamera cam1 = new DigitalCamera("Canon", 6);

        cam1.details();

        DigitalCamera cam2 = new DigitalCamera("Sony", 11);
        cam2.details();
    }
}
