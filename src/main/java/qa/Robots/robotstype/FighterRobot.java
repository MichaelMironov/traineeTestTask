package qa.Robots.robotstype;

import qa.Robots.Energy;
import qa.Robots.Robot;
import qa.Robots.enums.Weapons;


public class FighterRobot extends Robot {

    private final Weapons weapon;
    private int amountAmmo = 500;

    public FighterRobot(Weapons weapon, Energy energy, int dateOfCreation) {
        super(energy, dateOfCreation);
        this.weapon = weapon;
        this.energy = energy;
    }

    public void fire(){
            if(isCharged()){
                if(weapon == Weapons.GUN && amountAmmo > 0){
                    super.charge--;
                    System.out.println("Боевой робот стреляет");
                    this.amountAmmo -= 100;
                }

                if(weapon == Weapons.GUN && amountAmmo == 0){
                    System.out.println("Патроны закончились. Необходимо пополнить боезапас");
                }

                if(weapon != Weapons.GUN){
                    System.out.println("У этого робота отсутствует стрелковое оружие");
                }
            }
    }

    public int getAmountAmmo() {
        return amountAmmo;
    }

    public void reload() {
        this.amountAmmo = 500;
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
