package br.com.gfwesllei.vehicles;

public class Bike implements Vehicle{
    @Override
    public void startRouter() {
        getCargo();
        System.out.println("Start delivery");
    }

    @Override
    public void getCargo() {
        System.out.println("Taking the food");
    }
}
