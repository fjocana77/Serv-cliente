package server;
import java.rmi.RemoteException;
import java.rmi.Remote;

public interface IHelloService extends Remote {
    String sayHello(String name) throws RemoteException;
}
