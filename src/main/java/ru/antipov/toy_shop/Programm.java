package ru.antipov.toy_shop;


public class Programm {

    public static void main(String[] args) {

        ToyStore toyStore = new ToyStore(ToyFabric.generateToysList(5));
        System.out.println("\n-----СПИСОК НА НАЧАЛО-----");
        toyStore.showStoreToyList();
        toyStore.deleteToyById(1);
        toyStore.setToyRate(3, 88);
        toyStore.addToy();
        System.out.println("\n-----СПИСОК ПОСЛЕ УДАЛЕНИЯ И ДОБАВЛЕНИЯ ИГРУШКИ-----");
        toyStore.showStoreToyList();
        Lottery lottery = new Lottery(toyStore.getStoreToysList());
        lottery.startLottery();
        System.out.println("\n-----СПИСОК ПОСЛЕ ОКОНЧАНИЯ (уменьшение кол-ва игрушек)-----");
        lottery.showLotteryToyList();
    }
}
