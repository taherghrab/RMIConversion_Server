package rmiServer;

import rmiService.ConversionImpl;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class ConversionServer {
    public static void main(String[] args) {

        try {
            // Création d'un registre RMI sur le port 1099
            LocateRegistry.createRegistry(1098);

            // Création d'une instance de la classe d'implémentation ConversionImpl
            ConversionImpl conversionObject = new ConversionImpl();

            // Affichage de la représentation textuelle de l'objet créé
            System.out.println(conversionObject.toString());

            // Liaison de l'objet avec le registre RMI sous le nom "ConversionObject"
            Naming.rebind("rmi://localhost:1098/ConversionObject", conversionObject);
        } catch (RemoteException | MalformedURLException e) {
            // En cas d'erreur, l'exception est encapsulée dans une RuntimeException
            throw new RuntimeException(e);
        }
    }
}