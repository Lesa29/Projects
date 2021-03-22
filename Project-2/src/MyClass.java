 import java.util.Scanner;
public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner (System.in);
        System.out.println("Input the number of minutes");
        int min = scanner.nextInt();
        int years = (min/525600);
        int days = min/(60*24)% 365;
        System.out.println("Years =" + years);
        System.out.println("Days =" + days);
        
	}

}
