package Structural_Pattern.AdapterPattern;

public class AdapterCharger implements AppleCharger{

    private AndriodCharger andriodCharger;

    public AdapterCharger(AndriodCharger andriodCharger) {
        this.andriodCharger = andriodCharger;
    }

    @Override
    public void chargePhone() {
        andriodCharger.chargeAndriodPhone();
        System.out.println("your phone is charging with ADAPTER");
    }
}
