package Transport.Water;

import Transport.Transport;
import Transport.CommonInterface;

public class Submarine extends Transport implements CommonInterface {
    int immersionDepth;
    boolean hasNuclearWeapon;
    public Submarine(){
        this.type = "submarine";
        this.fuelType = "disel";
        this.isMilitary = true;
        this.name = "K-50";
        this.immersionDepth = 1000;
        this.hasNuclearWeapon = true;
    }

    @Override
    public void showAssignment(){
        System.out.println(this.isMilitary ? "Military " : "Civilian " + this.type);
    }

    @Override
    public void fuelType(){
        System.out.println(this.fuelType);
    }

    @Override
    public void showName(){
        System.out.println(this.name);
    }
}
