

public class Employee{
    String name;
    int age ;
    String designation;
    double salary;
    // this is the constructor of the class Employee
    public Employee (String name){
        this.name= name;
    }
    public void empAge (int empAge){
        age= empAge;
    }
    public void empDesign(String empDesign){
        designation=empDesign;
    }
    public void empSal(double empSal){
        salary=empSal;
    }
    //print Employee information
    System.out.println("employee name is "+name);
    System.out.println("employee age is"+age);
    System.out.println("employee designation is "+designation);
    System.out.println("employee slary is "+salary);
}
