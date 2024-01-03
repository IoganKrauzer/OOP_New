package ru.antipov.toy_shop;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Lottery {

    ArrayList<Toy> lotteryToysList;
    ArrayList<Toy> lotteryPrizeToysList;


    public Lottery(ArrayList<Toy> storeToysList) {
        lotteryToysList = storeToysList;
        lotteryPrizeToysList = new ArrayList<>();
    }

    private double findPrizeToyRate() {
        double maxPrizeToyRate = 0;
        for (Toy toy : lotteryToysList) {
            if (toy.getRate() > maxPrizeToyRate) {
                maxPrizeToyRate = toy.getRate();
            }
        }
        return maxPrizeToyRate;
    }

    private int findPrizeToy() {
        int winningToyId = 0;
        for (Toy toy : lotteryToysList) {
            if (toy.getRate() == findPrizeToyRate()) {
                winningToyId = toy.getId();
                break;
            }
        }
        return winningToyId;
    }

    public void getPrizeToy() throws IOException {
        for (Toy toy : lotteryToysList) {
            if (toy.getId() == findPrizeToy()) {
                lotteryPrizeToysList.add(toy);
                if (toy.getQuantity() - 1 > 0) {
                    toy.setQuantity(toy.getQuantity() - 1);
                } else {
                    lotteryToysList.remove(toy);
                }
            }
        }
        showPrizeToy();
        if (!lotteryPrizeToysList.isEmpty()) {
            Toy prizeToy = lotteryPrizeToysList.remove(0);
            FileWriter writer = new FileWriter("prize_toys.txt", true);
            writer.write("Призовая игрушка: " + prizeToy.getName() + "\n");
            writer.close();
        }
    }

    public void startLottery() {
        System.out.println("Лотерея начинается...");
        System.out.println("Машина ищет призовую игрушку...");
        try {
            getPrizeToy();
        } catch (IOException e) {
            e.getMessage();
        }
    }

    public void showPrizeToy(){
        for (Toy toy: lotteryPrizeToysList){
            System.out.println("Призовая игрушка: " + toy.getName());
        }
    }

    public void showLotteryToyList() {
        for (Toy toy : lotteryToysList) {
            System.out.println(toy);
        }
    }
}
