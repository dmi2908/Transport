package Transport.Ground;

import Transport.Transport;
import Transport.CommonInterface;

public class Locomotive extends Transport implements CommonInterface {

    boolean isExpress;
    public Locomotive(){
        this.type = "train";
        this.fuelType = "disel";
        this.isMilitary = false;
        this.name = "VL-1";
        this.isExpress = true;
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
