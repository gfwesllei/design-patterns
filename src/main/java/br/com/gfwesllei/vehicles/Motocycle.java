package br.com.gfwesllei.vehicles;

public class Motocycle implements Vehicle{
    public void startRouter() {
        getCargo();
        System.out.println("Iniciando rota moticleta");
    }

    public void getCargo() {
        System.out.println("Pegando encomenda");
    }
}
