package qa.Robots.robotstype;

import qa.Robots.Energy;
import qa.Robots.Robot;

public class WelderRobot extends Robot {

    public WelderRobot(Energy energy, int dateOfCreation) {
        super(energy, dateOfCreation);
    }

    public void weldDetails(String firstDetail, String secondDetail){
        if(isCharged()){
            System.out.println(firstDetail+secondDetail);
            super.charge--;
        }
    }

    @Override
    public void drive() {
        if(isCharged()){
            //TODO Driving method
            charge--;
        }
    }

    @Override
    public void fly() {
        if(isCharged()){
            //TODO flying method
            charge--;
        }
    }

    @Override
    public void walk() {
        if(isCharged()){
            //TODO Driving method
            charge--;
        }
    }
}
