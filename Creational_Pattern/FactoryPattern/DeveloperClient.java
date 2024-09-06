package Creational_Pattern.FactoryPattern;

public class DeveloperClient {
    public static void main(String[] args) {

        System.out.println("*****DYANMIC*****");
        Employee e = new Employee(1,"Ishan","Java Developer");
        EmployeeSalary sal = EmployeeFactory.getEmployee(e.getEmpType());
        int java = sal.salary();
        System.out.println("Salary: "+java);

        Employee e1 = new Employee(2,"Rutu","Web Developer");
        EmployeeSalary sal1 = EmployeeFactory.getEmployee(e1.getEmpType());
        int web = sal1.salary();
        System.out.println("Salary: "+web);

        System.out.println("*****STATIC*****");

        EmployeeSalary employeeSalary = EmployeeFactory.getEmployee("Java Developer");
        int javadev = employeeSalary.salary();
        System.out.println("Salary: "+javadev);

        EmployeeSalary employeeSalary1 = EmployeeFactory.getEmployee("Web Developer");
        int webdev = employeeSalary1.salary();
        System.out.println("Salary: "+webdev);
    }
}
