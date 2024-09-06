package Creational_Pattern.FactoryPattern;

public class JavaDeveloper implements EmployeeSalary{
    @Override
    public int salary() {
        System.out.println("Java Developer");
        return 40000;
    }
}
