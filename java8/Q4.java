package java8;
//Create an Employee Class with instance variables (String) name, (Integer)age, (String)city
// and get the instance of the Class using constructor reference
class Employee{
    String name;
    Integer age;
    String city;
    Employee(String name, Integer age, String city)   {
        this.name=name;
        this.age=age;
        this.city=city;
    }
    Employee getObject(){
        return this;
    }
   public String toString(){
        return "Employee name: "+name+"\nEmployee Age: "+age+"\nEmployee city: "+city;
   }
}
interface employeeDetails{
    Employee empDetails();
}
public class Q4 {
    public static void main(String[] args) {

        employeeDetails empdetails=new Employee("Ankit", 23,"Delhi")::getObject;
        System.out.println(empdetails.empDetails());

    }
}
