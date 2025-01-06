package client;

import server.IHelloService;

import java.rmi.*;

public class cliente {

    public static void main(String [] args) {
        try {
            // Busca el objeto remoto en el registro RMI
            IHelloService helloService = (IHelloService) Naming.lookup("rmi://localhost/HelloService");

            //Invoca el metodo remoto
            String response = helloService.sayHello("Juanito");
            System.out.println("Respuesta del servidor: " + response);
        }catch (Exception e) {
            System.out.println("Error en el cliente: " + e.getMessage());
            e.printStackTrace();
        }
    }

}
