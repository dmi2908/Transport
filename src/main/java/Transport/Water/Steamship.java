package Transport.Water;

import Transport.Transport;
import Transport.CommonInterface;

public class Steamship extends Transport implements CommonInterface {

    int countOfPassagers;
    public Steamship(){
        this.type = "steamship";
        this.fuelType = "disel";
        this.isMilitary = false;
        this.name = "Some steamship";
        this.countOfPassagers = 4000;
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
