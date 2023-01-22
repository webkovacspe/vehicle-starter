package hu.kovacspeterzoltan.bootcamp.vehiclestarter;

import hu.kovacspeterzoltan.bootcamp.vehicleconsoleui.controller.VehicleConsoleUI;
import hu.kovacspeterzoltan.bootcamp.vehiclepersistencestorage.PersistenceStorageCSV;
import hu.kovacspeterzoltan.bootcamp.vehicleregister.controller.RegisterInteractor;
import hu.kovacspeterzoltan.bootcamp.vehicleregister.dao.VehicleRegisterStorageInterface;

public class Main {
    public static void main(String[] args) {
        VehicleRegisterStorageInterface persistenceStorageCSV = new PersistenceStorageCSV();

        RegisterInteractor registerInteractor = new RegisterInteractor();
        registerInteractor.setStorageImp(persistenceStorageCSV);

        VehicleConsoleUI consoleUI = new VehicleConsoleUI();
        consoleUI.setRegisterInteractorImp(registerInteractor);

        consoleUI.start();
    }
}