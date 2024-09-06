package Creational_Pattern.FactoryPattern;

public class EmployeeFactory {

    public static EmployeeSalary getEmployee(String empType){
        if (empType.trim().equalsIgnoreCase("Java Developer")){
            return new JavaDeveloper();
        }
        else if (empType.trim().equalsIgnoreCase("Web Developer")){
            return new WebDeveloper();
        }
        return null;
    }
}
