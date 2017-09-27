package com.timbuchalka;

public class Main {

    public static void main(String[] args) {

        //Instanciando Objeto da classe Ferrari
        Ferrari ferrari = new Ferrari(50);

        //Segundo construtor criado pra teste na hora de instanciar o segundo objeto da classe ferrari
        Ferrari ferrari1 = new Ferrari(100, "Ronaldo");

        //Testando a chamada dos metodos criados para o Primeiro Objeto..
        ferrari.autoStop(true, 500);
        ferrari.changeGear(50);
        ferrari.changeDirection(400);
        ferrari.changeSpeed(30);
        ferrari.changeSpeed(50);

    }
}
