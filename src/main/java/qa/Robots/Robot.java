package qa.Robots;

import qa.Robots.interfaces.Driving;
import qa.Robots.interfaces.Flying;
import qa.Robots.interfaces.Walking;

import java.time.LocalDate;
import java.util.Scanner;

public abstract class Robot implements Driving, Flying, Walking {

    protected int dateOfCreation;
    protected Energy energy;
    protected int charge;

    public Robot(Energy energy, int dateOfCreation) {
        this.energy = energy;
        this.charge = energy.getFullCharge();
        this.dateOfCreation = dateOfCreation;
        checkDate();
        System.out.println("Робот создан. Тип - " + this.getClass().getSimpleName() +"\n" + "Вид энергии - " + energy.getName() + "\n" + "Заряд - " + charge);
    }

    public boolean isCharged(){
        switch (energy){
            case ATOMIC -> {
                if(charge == 0 && ((LocalDate.now().getYear() - dateOfCreation) % 50 == 0 && ((LocalDate.now().getYear() - dateOfCreation) != 0))){
                    System.out.println("Настало время заправки атомной энергией");
                    charge += energy.getFullCharge();
                    System.out.println("Атомная энергия получена");
                    return true;
                }
                if(charge == 0){
                    if(LocalDate.now().getYear() - dateOfCreation > 0 && LocalDate.now().getYear() - dateOfCreation < 50){
                        System.out.printf("Атомная энергия закончена. Количество лет до следующей автоматической заправки: %d\n", (LocalDate.now().getYear()-dateOfCreation));
                        return false;
                    }
                }
            }
            case FUEL -> {
                if(charge == 0){
                    System.out.println("Бензобак пуст");
                    return false;
                }
            }
            case ELECTRICITY -> {
                if(charge == energy.getFullCharge() * 0.2){
                    System.out.println("Разряжен");
                    return false;
                }
            }
        }
        return true;
    }

    public void energize(Energy energy){
        setEnergy(energy);
        charge = energy.getFullCharge();
        System.out.println("Робот заряжен. Тип энергии - " + energy.getName());
    }

    public void setEnergy(Energy energy) {
        this.energy = energy;
    }

    public int getCharge() {
        return charge;
    }

    protected void checkDate(){
        if(dateOfCreation > LocalDate.now().getYear()){
            System.out.printf("Робот не может быть создан в будущем. Введите дату до %d года: ", LocalDate.now().getYear());
            Scanner scanner = new Scanner(System.in);
            dateOfCreation = scanner.nextInt();
            checkDate();
        }
        if(dateOfCreation < 1972)
            while(dateOfCreation < 1972){
                System.out.println("Робот не мог быть создан ранее даты создания фабрики. Введите дату от 1972 года: ");
                Scanner scanner = new Scanner(System.in);
                dateOfCreation = scanner.nextInt();
                checkDate();
            }
    }



}
