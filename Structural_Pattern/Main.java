package Structural_Pattern;

public class Main {

    public static void main(String[] args) {

//        AppleCharger appleCharger = new ChargerXYZ();

        //here adapter has taken adnriod charger and it is providing apple charger to Iphone
        AppleCharger appleCharger = new AdapterCharger(new ChargerAndy());

        IPhone13 iPhone13 = new IPhone13(appleCharger);
        iPhone13.chargePhone();
    }
}
