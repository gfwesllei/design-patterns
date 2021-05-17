package br.com.gfwesllei.vehicles;

public class Car implements Vehicle{

    public void startRouter() {
        getCargo();
        System.out.println("Iniciando rota");
    }

    public void getCargo() {
        System.out.println("Pegando Passageiros rota");
    }
}
