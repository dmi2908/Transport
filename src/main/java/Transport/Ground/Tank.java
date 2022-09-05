package Transport.Ground;

import Transport.Transport;
import Transport.CommonInterface;

public class Tank extends Transport implements CommonInterface {

    int countOfShells;
    public Tank(){
        this.type = "tank";
        this.fuelType = "disel";
        this.isMilitary = true;
        this.name = "T-90";
        this.countOfShells = 500;
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
