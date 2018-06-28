

 class Employee{
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

}

public class EmployeeText{
    public static void main(String args[]){
        //creating two objects as a constructor
        Employee empOne=new Employee("rahul");
        Employee empTwo=new Employee("rv");
        //invoking method for each object created

        empOne.empAge(27);
        empOne.empDesign("seniorsoftware developer");
        empOne.empSal(40000);
       // empOne.printEmployee();
        //invoking method for second object 
        empTwo.empAge(25);
        empTwo.empDesign("software developer");
        empTwo.empSal(35000);
       // empTwo.printEmployee();
        System.out.println("employee name is "+empOne.name);
        System.out.println("employee age is"+empOne.age);
        System.out.println("employee designation is "+empOne.designation);
        System.out.println("employee slary is "+empOne.salary);
    }
}