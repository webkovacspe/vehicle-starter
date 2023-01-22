package hu.kovacspeterzoltan.bootcamp.vehiclestarter;

import hu.kovacspeterzoltan.bootcamp.vehicleconsoleui.controller.ConsoleUIController;
import hu.kovacspeterzoltan.bootcamp.vehicleconsoleui.dao.ConsoleUIRegisterPresenterImp;
import hu.kovacspeterzoltan.bootcamp.vehiclepersistencestorage.PersistenceStorageCSV;
import hu.kovacspeterzoltan.bootcamp.vehicleregister.controller.RegisterInteractor;
import hu.kovacspeterzoltan.bootcamp.vehicleregister.dao.VehicleRegisterStorageInterface;

public class Main {
    public static void main(String[] args) {
        VehicleRegisterStorageInterface persistenceStorageCSV = new PersistenceStorageCSV();

        RegisterInteractor registerInteractor = new RegisterInteractor();
        registerInteractor.setStorageImp(persistenceStorageCSV);

        ConsoleUIRegisterPresenterImp consoleUIRegisterPresenter = new ConsoleUIRegisterPresenterImp();
        registerInteractor.setPresenterImp(consoleUIRegisterPresenter);

        ConsoleUIController consoleUI = new ConsoleUIController();
        consoleUI.setRegisterInteractorImp(registerInteractor);

        consoleUI.start();
    }
}