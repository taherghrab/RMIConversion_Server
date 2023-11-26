package rmiService;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ConversionImpl extends UnicastRemoteObject implements IConversion {

    // Constructeur par défaut qui appelle le constructeur de la classe parente
    public ConversionImpl() throws RemoteException {
    }

    //  le montant donné MULTIPLIER par 3.3 pour  une conversion arbitraire
    @Override
    public double convertirMontant(double mt) throws RemoteException {
        return mt * 3.3;
    }
}