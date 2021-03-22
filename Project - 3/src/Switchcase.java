 import java.util.Scanner;
 
public class Switchcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int choice;
       System.out.println("Pick one : 1. Hi\t2. Hey\t3. hello\t");
       Scanner a = new Scanner(System.in);
       choice = a.nextInt();
       switch(choice)
       {
       case 1 : System.out.println("You said Hi");
         break;
       case 2 : System.out.println("You said Hey");
       break;
       case 3 : System.out.println("You said hello");
       break;
       default : System.out.println("Invalid choice");
       break;
       
       
       }
       
       
	}

}
