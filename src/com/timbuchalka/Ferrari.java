package com.timbuchalka;

/**
 * Created by KH389659 on 27/09/2017.
 */
public class Ferrari extends Car {

    private boolean autopilot;

    //Construtor da classe Ferrari que por sua vez herda os metodos de CAR e VEICULO(classe pai) tendo apenas seu atributo especifico chamado "autopilot"
    public Ferrari(int speed) {
        super("Ferrari", speed, false);
        this.autopilot = true;
    }

    //Segundo construtor criado para o caso de passar o nome do carro alem da velocidade no Main
    public Ferrari(int speed, String name) {
        super(name, speed, false);
        this.autopilot = true;
    }
    //Metodo criado para verificar se o usuario esta dormindo e deslocando-se ao mesmo tempo, se sim chamamos o metodo STOP da classe pai e o carro para..
    public void autoStop(boolean isSleep, int speed) {
        if (isSleep && speed > 0) {
            stop();
            System.out.println("Because is Sleeping");

        }else{
            System.out.println("Ok!.");
        }
    }

    public boolean isAutopilot() {
        return autopilot;
    }
}
