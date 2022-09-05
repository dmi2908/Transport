package Transport.Ground;

import Transport.Transport;
import Transport.CommonInterface;

public class Bus extends Transport implements CommonInterface {

    boolean hasRoute;
    public Bus(){
        this.type = "bus";
        this.fuelType = "gasoline";
        this.isMilitary = false;
        this.name = "SU-50";
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
