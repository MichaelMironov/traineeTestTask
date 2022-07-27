package qa.Robots.robotstype;

import qa.Robots.Energy;
import qa.Robots.Robot;
import qa.Robots.enums.Food;

public class ChefRobot extends Robot {

    public ChefRobot(Energy energy, int dateOfCreation) {
        super(energy, dateOfCreation);
        this.energy = energy;
    }

    public void cook(Food food){
        if(isCharged()){
            super.charge--;
            System.out.println("Робот-повар приготовил - " + food.getFood());
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
