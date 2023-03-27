/***********************************************
 *     Calculate user's Gross Monthly Income   *
 ***********************************************/

package monthlygross;

import java.util.Scanner;

/**
 *
 * @author skubjana
 */
public class MonthlyGross {

    public static double GrossIncome(double tothours) {

        Scanner money = new Scanner(System.in);

        System.out.print("Enter your hourly rate: R");
        double hourRate = money.nextDouble();

        double grossInc = tothours * hourRate;

        //Displaying final results
        System.out.println("\n----------------------------------------");

        System.out.println("\t Your Monthly Gross Income ");

        System.out.println("   Total Hours of work: " + tothours);
        System.out.println("   Hourly Rate: R" + hourRate);
        System.out.println("   Monthly Gross Income: R" + grossInc);

        return grossInc; //Every method with the return type, int, double, float... must return that type

    }

    public static void main(String[] args) {
        // TODO code application logic here

        Scanner hours = new Scanner(System.in);

        System.out.print("How many hours have you worked for this month? > ");
        double nhour = hours.nextDouble(); //Total number of hours worked

        GrossIncome(nhour);   //invoke method GrossIncome

        System.out.println("----------------------------------------");
    }

 /**************************************************************************
  * Please note that this is not the only approach to the problem.         *
  * Author: Sam                                                            *
  **************************************************************************/
}
