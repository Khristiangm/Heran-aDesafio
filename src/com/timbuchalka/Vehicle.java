package com.timbuchalka;

/**
 * Created by KH389659 on 27/09/2017.
 */
public class Vehicle {
    //Fields da classe pai
    private String name;
    private int speed;
    private int size;
    private int direction;

    //Construtor da Classe pai
    public Vehicle(String name, int speed, int size) {
        this.name = name;
        this.speed = speed;
        this.size = size;
    }

    //Metodo Criado para alterar a velocidade do Veiculo.
    public void changeSpeed(int speedChange) {
        if (speedChange == 0) {
            System.out.println("The " + name + " speed have not Changed");
        } else {
            this.speed += speedChange;
            System.out.println("The " + name + " have increased it's Speed by " + speedChange + " and is now at a Speed of " + speed);
        }

    }

    //Metodo Criado para alterar a direcao do Veiculo.
    public void changeDirection(int directionChange) {
        //tratamento dos possiveis erros, na chamada do metodo.
        if (directionChange == 0) {
            System.out.println("the" + name + " Direction have not Changed");
        } else if (directionChange > 360 || directionChange < -360) {
            System.out.println("Direction not valid");
        }
        //--------------------------------------------------------------
        // o else nesse caso e a situacao aprovada da verificacao, se for uma direction valida ele guarda dentro de this.direction o valor inserido em directionChange
        else {
            this.direction += directionChange;
            System.out.println("The " + name + " have changed It's Direction by " + directionChange + "º and is now at a Direction of " + direction + "º");

        }

    }
    //Metodo Criado para situacoes em que o carro precise parar imediatamente ou por outros fatores como piloto automatico e afins
    public void stop() {

        this.speed = 0;
        System.out.print("The " + name + " Stopped, the Speed now is " + this.speed + " ");

    }
    //Getters para manipular os dados no Main e trazer o resultado dos metodos.
    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public int getSize() {
        return size;
    }
}
