package ejercicios;

/**
 * Created by Jhonatan on 08/07/2015.
 */
import javax.swing.JOptionPane;

public class Pay {
    //metodo principal de la aplicacion
    public static void main(String[] args) {


        int hoursWorked = 0;
        double payment = 0;
        int levelSelection = 0;
        final double RETIREMENT_PLAN = 0.03;
        int opcionSeguro = 0;
        double seguro = 0;
         double pagoMenosSeguro = 0;
        int opcionRetiro = 0;
        double descuentoRetiro;


        levelSelection = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su " +
                "nivel de habilidades de los mostrados a continuacion:"
                + "\n1" + "\n2" + "\n3"));

        hoursWorked = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero " +
                "de horas trabajadas durante esta semana"));


        //se evalua si es nivel 2 ó 3 y se le pregunta si desea participar en las opciones de seguro
        if (levelSelection == 2 || levelSelection == 3) {
            opcionSeguro = JOptionPane.showConfirmDialog(null, "Le gustaria participar en las opciones de seguro?", "mensaje informativo", JOptionPane.YES_NO_OPTION);
            if (opcionSeguro == JOptionPane.YES_OPTION)
                seguro = seguro();
            payment = hourlyPay(levelSelection, hoursWorked);
            pagoMenosSeguro = payment - seguro;
            JOptionPane.showMessageDialog(null, "your payment is: $" + payment
            + " and with your deduction discount is: " + pagoMenosSeguro);
            //se evalua si selecciono nivel tres y si es asi se le pregunta si desea participar en un plan de retiro del 3%
            if(levelSelection == 3){
               opcionRetiro = JOptionPane.showConfirmDialog(null, "Le gustaria participar en el plan de retiro del 3%?", "plan de retiro",JOptionPane.YES_NO_OPTION);
               if(opcionRetiro == JOptionPane.YES_OPTION){
                   descuentoRetiro = plan(pagoMenosSeguro);
                   JOptionPane.showMessageDialog(null, "su descuento de retiro es de " + RETIREMENT_PLAN +
                   " Y SU SALARIO DESPUES DE APLICADO EL DESCUENTO ES DE: $" + descuentoRetiro);
               }
            }

        } else {
            payment = hourlyPay(levelSelection, hoursWorked);
            JOptionPane.showMessageDialog(null, "your payment is: $" + payment);
        }
    }



    //metod que determina el salario segun als horas trabajadas
    public static double hourlyPay(int selection, int hours){

        final double LEVEL1 = 17.00;
        final double LEVEL2 = 20.00;
        final double LEVEL3 = 22.00;
        final int LIMIT = 40;
        double extraPaid = 0;
        double payment = 0.0;
        int horasExtra = 0;

        if(hours > LIMIT) {
            horasExtra = hours - LIMIT;
        }else {
              horasExtra = 0;
        }

            if(selection == 1){
               extraPaid = horasExtra * (LEVEL1 + (LEVEL1 * 0.5));
                payment = (hours * LEVEL1) + extraPaid;

            }else if(selection == 2){
                extraPaid = horasExtra * (LEVEL2 + (LEVEL2 * 0.5));
                payment = (hours * LEVEL2) + extraPaid;
            }else if(selection == 3){
                extraPaid = horasExtra * (LEVEL3 + (LEVEL3 * 0.5));
                payment = (hours * LEVEL3) + extraPaid;
            }

           /*
            switch (selection) {
                case 1:
                    payment = (hours * LEVEL1) + extraPaid;
                    break;
                case 2:
                    payment = (hours * LEVEL2) + extraPaid;
                    break;
                case 3:
                    payment = (hours * LEVEL3) + extraPaid;
                    break;
            }
            */

        return payment;
    }

    //metodo que selecciona el tipo de seguro del empleado
    public static Double seguro(){
     final double MEDICAL = 32.50;
        final double DENTAL = 20.00;
        final double LONG_TERM = 10.00;
        String seleccion;
        double discount = 0;

        seleccion = JOptionPane.showInputDialog(null, "seleccione el tipo de seguro segun su preferencia:" +
         "\n1- Medical insurance = 32.50 " +
         "\n2- Dental insurance = 20.00" +
          "\n3- Long-term disability insurance = 10.00");

          switch (seleccion)
          {
              case "1":
                  discount = MEDICAL;
                          break;
              case "2":
                  discount = DENTAL;
                  break;
              case "3":
                  discount = LONG_TERM;
                  break;
          }

        return discount;
    }

    //metodo para aplicar el descuento del 3% al salario
    public static double plan(double total){
        int selection;
        double totalWithDiscount = 0;
        final float DISCOUNT = 0.03f;
           selection = JOptionPane.showConfirmDialog(null, "Le gustaria participar en el plan de retiro del 3%?", "info mesage", JOptionPane.YES_NO_OPTION);
           if(selection == JOptionPane.YES_OPTION) {
               totalWithDiscount = total -(total * DISCOUNT);

           }
        return totalWithDiscount;

    }
}
