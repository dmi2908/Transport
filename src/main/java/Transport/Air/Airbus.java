package Transport.Air;

import Transport.Transport;
import Transport.CommonInterface;

public class Airbus extends Transport implements CommonInterface {

    int wingsCount;
    public Airbus(){
        this.type = "plane";
        this.fuelType = "kerosene";
        this.isMilitary = false;
        this.name = "Airbus A220";
        this.wingsCount = 2;
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
