package ejercicios;

/**
 * Created by Jhonatan on 23/06/2015.
 */
public class DinnerPartyWithConstructor extends PartyWithConstructor2{
    private int dinnerChoice;

    DinnerPartyWithConstructor() {
        super(1);
    }
    public int getDinnerChoice(){
        return dinnerChoice;
    }

    public void setDinnerChoice(int choice){
        dinnerChoice = choice;
    }
    public void displayInvitation(){
        System.out.println("Please come to my dinner party");
    }
}
