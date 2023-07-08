import java.text.DecimalFormat;
import java.util.Scanner;

public class BillCalculator {
    public static void main(String[]args){

        double totalBill;
        double rate;
        double baseCharge;
        double hours;
        double allowedhours;
        double extrahours=0;
        String contract;


        Scanner keyboard=new Scanner(System.in);
        System.out.println("What Package have you bought?? ");
        contract= keyboard.next();
        System.out.println("How many hours did you use?? ");
        hours= keyboard.nextDouble();

        if (contract.equals("A"))
        {
            baseCharge=9.95;
            rate=2.00;
            allowedhours=10;
            if (hours > allowedhours) {
                extrahours = hours- allowedhours;
            }


           totalBill=baseCharge+(rate*extrahours);

            // Formatting the totalBill to two decimal places
            DecimalFormat decimalFormat = new DecimalFormat("#.00");
            String formattedBill = decimalFormat.format(totalBill);



            System.out.println("your bill is " + formattedBill+"$");

        }
         else if (contract.equals("B"))
         {

            baseCharge=13.95;
            rate=1.00;
             if (hours > 20) {
            totalBill=baseCharge+(rate*(hours-20)) ;}
             else {totalBill=baseCharge;}

             // Formatting the totalBill to two decimal places
             DecimalFormat decimalFormat = new DecimalFormat("#.00");
             String formattedBill = decimalFormat.format(totalBill);




            System.out.println("your total bill is " + formattedBill);

        }    else if (contract.equals("C")){
            System.out.println("total monthly bill is $19.95");

        }
           else
            System.out.println("Wrong input");

    }
}

