package cliente;
import server.IHelloService;
import java.rmi.Naming;


public class ClientRMI {
    public static void main(String[] args) {
        try {
            // Dirección IP del servidor RMI (reemplazar con la IP del servidor)
            String serverAddress = "//10.40.46.220/HelloService";

            // Localizar el servicio remoto
            IHelloService helloService = (IHelloService) Naming.lookup(serverAddress);

            // Invocar el método remoto
            String response = helloService.sayHello("Dayanna");
            System.out.println("Respuesta del servidor: " + response);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
