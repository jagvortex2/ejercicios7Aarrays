package ejercicios;

import java.math.BigDecimal;

/**
 * Created by Jhonatan on 31/8/2015.
 */
public class DigitalCamera {
    private String brand;
    private int mpx;
     private String price;
     private BigDecimal costo;

//constructor
    public DigitalCamera(String brand, int mpx){
        if(mpx > 10)
        {
            this.mpx = 10;
        }else
            this.mpx = mpx;

        this.brand = brand;
        setPrice(this.mpx);

    }



    public void setPrice(int mpx) {
        if(this.mpx <=6)
        {
            this.price = "99";
        }else
            this.price = "129";
    }


/*
    public BigDecimal bigPrice(){
        this.costo = new BigDecimal(this.price);
        return costo;
    }
    */

    public void details(){
        System.out.println("you have selected a " + brand + " camera with " + mpx +"\nand the price is "
        + price /*+ " mas exactamente con la clase BIgDecimal() " + costo.toString()*/);
    }


}

