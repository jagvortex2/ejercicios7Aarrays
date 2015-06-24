package ejercicios;

/**
 * Created by Jhonatan on 23/06/2015.
 */
public class PartyWithConstructor {

  private int guests;

    public PartyWithConstructor(){
        System.out.println("Creating a party");
    }

    public int getGuests() {
        return guests;
    }

    public void setGuests(int numGuests) {
        guests = numGuests;
    }

    public void displayInvitation() {
        System.out.println("Please come to my party!");
    }
}
