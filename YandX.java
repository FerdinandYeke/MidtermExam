import java.util.*;


public class YandX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter value of x to calculate the value of Y: ");
		
		double x = scan.nextDouble();
	
		double y = 1/2*Math.pow(x, 2)-Math.pow(x, 2)+1;
		
		System.out.println("The value of Y is: "+y);
		
		
		
		
		
	}

}
