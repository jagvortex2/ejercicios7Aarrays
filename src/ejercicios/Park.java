package ejercicios;

import java.util.Scanner;

/**
 * Created by Jhonatan on 4/9/2015.
 */
public class Park {

    final String SALUDO = "*****Cloverdale*****";
    String parkName;
    int size;
    boolean hasPicnicFacilities = false;
    boolean hasTennisCourt = false;
    boolean hasPlayground = false;
    boolean hasSwimmingPool = false;

    Scanner keyboard = new Scanner(System.in);

    //retorna el nombre del parqueo
    public String getParkName() {
        return parkName;
    }


    public void setParkName(String parkName) {
        this.parkName = parkName;
    }

    public int getSize() {
        return size;
    }

    //establece el tamaño en numero de acres del parqueo
    public void setSize(int size) {
        if((size >= 400) || (size < 0))
        {
            System.out.println("Valor no valido");
            int validSize = 0;
            System.out.print("Ingrese nuevo valor>> ");
            validSize = keyboard.nextInt();
            setSize(validSize);
        }
        this.size = size;
    }

    public boolean isHasPicnicFacilities() {
        return hasPicnicFacilities;
    }

    public void setHasPicnicFacilities(boolean hasPicnicFacilities) {
        this.hasPicnicFacilities = hasPicnicFacilities;
    }

    public boolean isHasTennisCourt() {
        return hasTennisCourt;
    }

    public void setHasTennisCourt(boolean hasTennisCourt) {
        this.hasTennisCourt = hasTennisCourt;
    }

    public boolean isHasPlayground() {
        return hasPlayground;
    }

    public void setHasPlayground(boolean hasPlayground) {
        this.hasPlayground = hasPlayground;
    }

    public boolean isHasSwimmingPool() {
        return hasSwimmingPool;
    }

    public void setHasSwimmingPool(boolean hasSwimmingPool) {
        this.hasSwimmingPool = hasSwimmingPool;
    }
}
