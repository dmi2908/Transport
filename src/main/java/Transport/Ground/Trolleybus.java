package Transport.Ground;

import Transport.Transport;
import Transport.CommonInterface;

public class Trolleybus extends Transport implements CommonInterface {

    boolean hasRoute;
    public Trolleybus(){
        this.type = "trolleybus";
        this.fuelType = "electrical";
        this.isMilitary = false;
        this.name = "ZIU-5";
        this.hasRoute = true;
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
