package hu.kovacspeterzoltan.bootcamp.vehiclestarter;

import hu.kovacspeterzoltan.bootcamp.vehicleconsoleui.controller.ConsoleUIController;
import hu.kovacspeterzoltan.bootcamp.vehicleconsoleui.dto.ConsoleUIRegisterPresenterImp;
import hu.kovacspeterzoltan.bootcamp.vehiclepersistencestorage.VehicleRegisterPersistenceStorageCSV;
import hu.kovacspeterzoltan.bootcamp.vehicleregister.VehicleInteractor;
import hu.kovacspeterzoltan.bootcamp.vehicleregister.api.VehicleRegisterPresenterInterface;
import hu.kovacspeterzoltan.bootcamp.vehicleregister.storage.VehicleRegisterStorageInterface;

public class Main {
    public static void main(String[] args) {
        VehicleInteractor vehicleInteractor = new VehicleInteractor();

        VehicleRegisterStorageInterface persistenceStorageCSV = new VehicleRegisterPersistenceStorageCSV();
        vehicleInteractor.setStorageImp(persistenceStorageCSV);

        VehicleRegisterPresenterInterface consoleUIRegisterPresenter = new ConsoleUIRegisterPresenterImp();
        vehicleInteractor.setPresenterImp(consoleUIRegisterPresenter);

        ConsoleUIController consoleUI = new ConsoleUIController();
        consoleUI.setSaveVehicleInteractorImp(vehicleInteractor);
        consoleUI.setFindInteractorImp(vehicleInteractor);

        consoleUI.start();
    }
}