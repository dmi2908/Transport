package Transport.Air;

import Transport.Transport;
import Transport.CommonInterface;

public class Fighter extends Transport implements CommonInterface {
    boolean hasStelsMode;
    public Fighter(){
        this.type = "plane";
        this.fuelType = "kerosene";
        this.isMilitary = true;
        this.name = "SU-50";
        this.hasStelsMode = true;
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
