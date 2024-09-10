package Creational_Pattern.SingletonPattern;

import java.lang.reflect.Constructor;

public class MainSamosa {
    public static void main(String[] args) throws Exception {

/*
        Samosa s1 = Samosa.getSamosa();
        System.out.println(s1.hashCode());

        Samosa s2 = Samosa.getSamosa();
        System.out.println(s2.hashCode());

        System.out.println(Jalebi.getJalebi().hashCode());
        System.out.println(Jalebi.getJalebi().hashCode());
*/

        /* ways to break singleton DP and their solution
        *
        *  1. Reflection API
        * solution = throw exception in Samosa's constructor
        */

        Samosa s1 = Samosa.getSamosa();
        System.out.println(s1.hashCode());
        Constructor<Samosa> constructor = Samosa.class.getDeclaredConstructor();
        constructor.setAccessible(true);


        Samosa s2 = constructor.newInstance();
        System.out.println(s2.hashCode());

        /*
        *
        * 2. Deserialization
        * solution = implementing readResolve()
        *
        */
//        Samosa s1 = Samosa.getSamosa();
//        System.out.println(s1.hashCode());
//
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("abc.ob"));
//        oos.writeObject(s1);
//
//        System.out.println("Serialization done!");
//
//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("abc.ob"));
//        Samosa s2 = (Samosa) ois.readObject();
//        System.out.println(s2.hashCode());


        /*
        *
        * 3. Clone
        * solution - override clone method
        */
//        Samosa s1 = Samosa.getSamosa();
//        System.out.println(s1.hashCode());
//
//        Samosa s2 = (Samosa) s1.clone();
//        System.out.println(s2.hashCode());

    }

}
