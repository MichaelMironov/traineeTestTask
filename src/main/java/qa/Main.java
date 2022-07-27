package qa;

import qa.Robots.Energy;
import qa.Robots.enums.Food;
import qa.Robots.robotstype.ChefRobot;
import qa.Robots.robotstype.FighterRobot;
import qa.Robots.enums.Weapons;
import qa.Robots.robotstype.WelderRobot;

public class Main {
    public static void main(String[] args) {
        //Роботы-войны------------------------------------//
        //Валидация на дату создания робота до создания фабрики роботов и на дату создания робота в еще не наступившем времени
        FighterRobot fighter1 = new FighterRobot(Weapons.SWORD,Energy.ELECTRICITY,2000);
        for (int i = 0; i < 3; i++) {
            fighter1.fire();
        }

        FighterRobot fighter2 = new FighterRobot(Weapons.GUN,Energy.FUEL,2015);

        for (int i = 0; i < 5; i++) {
            fighter2.fire();
        }
        fighter2.energize(Energy.ELECTRICITY);
        fighter2.reload();
        for (int i = 0; i < 5; i++) {
            fighter2.fire();
        }

        FighterRobot fighter3 = new FighterRobot(Weapons.GUN,Energy.ATOMIC,1975);

        for (int i = 0; i < 6; i++) {
            fighter3.fire();
        }

        fighter3.energize(Energy.FUEL);
        fighter3.reload();

        for (int i = 0; i < 6; i++) {
            fighter3.fire();
        }

        //Роботы-повары------------------------------------//
        ChefRobot chef1 = new ChefRobot(Energy.ELECTRICITY,2001);
        for (int i = 0; i < 8; i++) {
            chef1.cook(Food.SPAGHETTI);
        }
        chef1.energize(Energy.FUEL);

        ChefRobot chef2 = new ChefRobot(Energy.ATOMIC,2005);
        for (int i = 0; i < 5; i++) {
            chef1.cook(Food.SPAGHETTI);
        }
        chef2.energize(Energy.ELECTRICITY);

        ChefRobot chef3 = new ChefRobot(Energy.FUEL,2015);
        for (int i = 0; i < 5; i++) {
            chef3.cook(Food.SPAGHETTI);
        }
        chef2.energize(Energy.ATOMIC);

        //Роботы-сварщики------------------------------------//

        WelderRobot welder1 = new WelderRobot(Energy.ELECTRICITY,1975);
        for (int i = 0; i < 5; i++) {
            welder1.weldDetails("деталь1","деталь2");
        }
        welder1.energize(Energy.FUEL);

        WelderRobot welder2 = new WelderRobot(Energy.FUEL,1985);
        for (int i = 0; i < 5; i++) {
            welder2.weldDetails("деталь3", "деталь4");
        }
        welder1.energize(Energy.ELECTRICITY);

        WelderRobot welder3 = new WelderRobot(Energy.ATOMIC,1995);
        for (int i = 0; i < 6; i++) {
            welder3.weldDetails("деталь5", "деталь6");
        }
        welder3.energize(Energy.ATOMIC);

    }
}