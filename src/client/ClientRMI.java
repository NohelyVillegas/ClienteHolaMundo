package client;
import server.IHelloService;
import java.rmi.Naming;

public class ClientRMI {
    /**
     * @param args
     *
     */

    public static void main(String[] args) {
        try {
            // Cambiar localhost por la IP del servidor
            IHelloService helloService = (IHelloService) Naming.lookup("rmi://10.40.43.75/HelloService");

            // Invoca
            String response = helloService.sayHello("Nohely");
            System.out.println("Respuesta del servidor: " + response);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
