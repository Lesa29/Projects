
public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Employee e1 = new Employee();
          
          e1.name = "Robert";
          e1.yearofjoining = 1994;
          e1.address ="64C-WallsStreet";
          System.out.println("Name:" + e1.name);
          System.out.println("Year Of Joining:" + e1.yearofjoining);
          System.out.println("Address:" + e1.address);
          
          System.out.println("----------------------");
          
          Employee e2 = new Employee();
          e2.name = "Sam";
          e2.yearofjoining = 2000;
          e2.address ="68D-WallsStreet";
          System.out.println("Name:" + e2.name);
          System.out.println("Year Of Joining:" + e2.yearofjoining);
          System.out.println("Address:" + e2.address);
          
          
          System.out.println("----------------------");
          
          Employee e3 = new Employee();
          e3.name = "John";
          e3.yearofjoining = 1999;
          e3.address ="26B-WallsStreet";
          System.out.println("Name:" + e3.name);
          System.out.println("Year Of Joining:" + e3.yearofjoining);
          System.out.println("Address:" + e3.address);
          
	}

}
