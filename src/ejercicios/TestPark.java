package ejercicios;

/**
 * Created by Jhonatan on 17/9/2015.
 */
public class TestPark {
    public static void main(String[] args) {

    }

    //Indica si el objeto Park tiene picnic y parque de juegos
    public static boolean parkHasPicnicAndPlayground(Park park){
            boolean result = false;
            return result;
    }


    //retorna true si el parque tiene todas las caracteristicas
    public static boolean hasAllFeatures(Park park, boolean hasPicnic, boolean hasTennis, boolean hasPlayground, boolean hasSwimming){
        boolean result = false;
        if((hasPicnic == true) && (hasTennis == true) && (hasPlayground = true) && (hasSwimming == true))
        {
            result = true;
        }

        return result;
    }


    //Regresa el numero de facilidades q el parque tiene
    public static int facilities(Park park){
        int numOfFacilities = 0;
        return numOfFacilities;
    }

    //retorna el objeto Park mas largo
    public static Park lagerPark(Park park1, Park park2){
        Park parkX = park1;
        Park parkY = park2;
        if(parkX.getSize() < parkY.getSize())
        {
         return parkY;
        }else {

            return parkX;
        }
    }
}
