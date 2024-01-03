package ru.antipov.toy_shop;

import java.util.ArrayList;

public class ToyStore {

    ArrayList<Toy> storeToysList;


    public ToyStore(ArrayList<Toy> fromFabric) {
        storeToysList = fromFabric;
    }

    public void addToy() {
        storeToysList.add(ToyFabric.generateToy());
    }

    public void setToyRate(int id, double newRate) {
        for (Toy toy : storeToysList) {
            if (toy.getId() == id) {
                toy.setRate(newRate);
                break;
            }
        }
    }

    public void showStoreToyList() {
        for (Toy toy : storeToysList) {
            System.out.println(toy);
        }
    }

    public void deleteToyById(int id){
        for (Toy toy : storeToysList) {
            if (toy.getId() == id){
                storeToysList.remove(toy);
                break;
            }
        }
    }

    public ArrayList<Toy> getStoreToysList() {
        return storeToysList;
    }
}
