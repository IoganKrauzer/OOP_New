package ru.antipov.toy_shop;
import java.util.ArrayList;
import java.util.Random;
public class ToyFabric {

    private static int idToyCounter = 0;

    public static Random random = new Random();

    public static Toy generateToy() {
        int idGenerate = ++idToyCounter;
        String nameGenerate = String.format("Toy #%d", idGenerate);
        int quantityGenerate = random.nextInt(5,31);
        double rateGenerate = random.nextDouble(1, 100);
        return new Toy(idGenerate, nameGenerate, quantityGenerate, rateGenerate);
    }

    public static ArrayList<Toy> generateToysList(int count) {
        ArrayList<Toy> toysFabricList = new ArrayList<>();
        for (int i = 0; i < count; i++){
            toysFabricList.add(generateToy());
        }
        return toysFabricList;

    }
}
