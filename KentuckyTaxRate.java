import java.text.*;
import java.util.Scanner;

public class KentuckyTaxRate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberFormat format1 = NumberFormat.getCurrencyInstance();
		NumberFormat format2 = NumberFormat.getPercentInstance();
		
		final double TAX_RATE = 0.06;
		
		System.out.println("The Tax Rate of Kentucky is: "+format2.format(TAX_RATE));
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the amount of money you've spent"
				+ " on food last week: ");
		
		double cost = scan.nextDouble();
		
		System.out.println("You have spent "+format1.format(cost)+" Last week"
				+ " on food purchase");
		
		
		
	}

}
