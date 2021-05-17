package br.com.gfwesllei;

import br.com.gfwesllei.factory.BikeTransportFactory;
import br.com.gfwesllei.factory.CarTransporteFactory;
import br.com.gfwesllei.factory.MotocycleTransportFactory;
import br.com.gfwesllei.factory.Transport;

public class Main {

    private static Transport transport;

    public static void main(String[] args) {
        configure(args[0]);
        if(transport!=null){
            runTransport();
        }
    }

    private static void runTransport() {
        transport.startTransport();
    }

    private static void configure(String type) {

        switch (type){
            case "user":
                transport = new CarTransporteFactory();
                break;
            case "log":
                transport = new MotocycleTransportFactory();
                break;
            case "eats":
                transport = new BikeTransportFactory();
                break;
            default:
                System.out.println("Invalid type, take valid type");
        }

    }
}
