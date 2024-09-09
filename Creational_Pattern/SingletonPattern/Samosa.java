package Creational_Pattern.SingletonPattern;

import java.io.Serializable;

public class Samosa implements Serializable, Cloneable {

    private static Samosa samosa;

    //private constructor

//    private Samosa() {}


    public Samosa() {
        if (samosa != null)
            throw new RuntimeException("You are trying to break the singleton DP");
    }

    //static method to create an object
    public static Samosa getSamosa(){
        //if object does not exist
        if (samosa == null){
            samosa = new Samosa();
        }
        return samosa;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
//        return super.clone();
        return samosa;
    }

    public Object readResolve(){
        return samosa;
    }

}
