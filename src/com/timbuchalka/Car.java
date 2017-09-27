package com.timbuchalka;

/**
 * Created by KH389659 on 27/09/2017.
 */
public class Car extends Vehicle {

    private int wheels;
    private int doors;
    private boolean isManual;
    private int gear;

    public Car(String name, int speed, boolean isManual) {
        super(name, speed, 30);
        this.wheels = 5;
        this.doors = 5;
        this.isManual = isManual;
    }
    //Metodos para simular a troca de marcha baseado na velocidade do Veiculo..
    public void changeGear(int speed){

        if (speed > 0 && speed < 10){
            this.gear = 1;
            System.out.println("First Gear");
        }else if (speed >= 10 && speed < 30){
            this.gear = 2;
            System.out.println("Second Gear");
        }else if (speed >= 30 && speed < 50){
            this.gear = 3;
            System.out.println("Third Gear");
        }else if (speed >= 50 && speed < 80){
            this.gear = 4;
            System.out.println("fourth Gear");
        }else if (speed > 80){
            this.gear = 5;
            System.out.println("Last Gear");
        }else{
            System.out.println("This Car is Stopped");
        }
    }
    //Getters para serem chamados no Main
    public int getWheels() {
        return wheels;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isManual() {
        return isManual;
    }
}
