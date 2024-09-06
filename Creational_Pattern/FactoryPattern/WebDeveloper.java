package Creational_Pattern.FactoryPattern;

public class WebDeveloper implements EmployeeSalary{

    @Override
    public int salary() {
        System.out.println("Web Developer");
        return 50000;
    }
}
