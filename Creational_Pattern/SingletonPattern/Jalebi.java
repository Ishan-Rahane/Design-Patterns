package Creational_Pattern.SingletonPattern;

public class Jalebi {

    private static Jalebi jalebi = new Jalebi();

    public static Jalebi getJalebi(){
        return jalebi;
    }
}
