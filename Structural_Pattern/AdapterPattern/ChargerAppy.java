package Structural_Pattern.AdapterPattern;

public class ChargerAppy implements AppleCharger{
    @Override
    public void chargePhone() {
        System.out.println("your iphone is charging!!!");
    }
}
