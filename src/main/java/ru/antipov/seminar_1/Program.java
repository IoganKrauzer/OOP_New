package ru.antipov.seminar_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {


        List <Product> productList = new ArrayList<>();
        BottleOfMilk bottleOfMilk1 = new BottleOfMilk("Milk1", 69.2,
                1.5, 1.5);
        BottleOfMilk bottleOfMilk2 = new BottleOfMilk("Milk2", 19.2,
                0.3, 2.5);
        BottleOfMilk bottleOfMilk3 = new BottleOfMilk("Milk3", 29.2,
                0.5, 3.5);
        BottleOfWater bottleOfWater1 = new BottleOfWater("Water1", 35,
                0.5);
        BottleOfWater bottleOfWater2 = new BottleOfWater("Water2", 50,
                1);
        PackageOfCigarettes packageOfCigarettes1 = new PackageOfCigarettes("LmRed", 189,
                0.6);
        PackageOfCigarettes packageOfCigarettes2 = new PackageOfCigarettes("LmBlue", 189,
                0.4);
        CanOfBeer canOfBeer1 = new CanOfBeer("DontKnow", 55,
                0.5, 4.5);

        productList.add(bottleOfMilk1);
        productList.add(bottleOfMilk2);
        productList.add(bottleOfMilk3);
        productList.add(bottleOfWater1);
        productList.add(bottleOfWater2);
        productList.add(packageOfCigarettes1);
        productList.add(packageOfCigarettes2);
        productList.add(canOfBeer1);

        VendingMachine vendingMachine = new VendingMachine(productList);
        System.out.println(vendingMachine);

        Scanner sc = new Scanner(System.in);
        System.out.println("""
                Что вы желаете выбрать?
                1 - Bottle of Milk
                2 - Bottle of Water
                3 - Package of Cigarettes
                4 - Can of Beer""");

        String choices = sc.nextLine();
        List<Object> paramList = new ArrayList<>();
        ListWithParametres listWithParametres = new ListWithParametres(paramList);
        switch (choices){
            case "1":
                listWithParametres.parameteresForMilk();
                BottleOfMilk bottleOfMilk = vendingMachine.getProductBottle(
                        (String) ListWithParametres.getListWithParametres().get(0),
                        (Double) ListWithParametres.getListWithParametres().get(1),
                        (Double) ListWithParametres.getListWithParametres().get(2),
                        (Double) ListWithParametres.getListWithParametres().get(3));
                if (bottleOfMilk == null){
                    System.out.println("Такого товара в автомате нет");
                }
                else  {
                    System.out.println("Вы купили: ");
                    System.out.println(bottleOfMilk);
                }
                break;

            case "2":
                listWithParametres.parameteresForWater();
                BottleOfWater bottleOfWater = vendingMachine.getProductBottle(
                        (String) ListWithParametres.getListWithParametres().get(0),
                        (Double) ListWithParametres.getListWithParametres().get(1),
                        (Double) ListWithParametres.getListWithParametres().get(2));
                if (bottleOfWater == null){
                    System.out.println("Такого товара в автомате нет");
                }
                else  {
                    System.out.println("Вы купили: ");
                    System.out.println(bottleOfWater);
                }
                break;

            case "3":
                listWithParametres.parameteresForCigarettes();
                PackageOfCigarettes packageOfCigarettes = vendingMachine.getProductOther(
                        (String) ListWithParametres.getListWithParametres().get(0),
                        (Double) ListWithParametres.getListWithParametres().get(1));
                if (packageOfCigarettes == null){
                    System.out.println("Такого товара в автомате нет");
                }
                else  {
                    System.out.println("Вы купили: ");
                    System.out.println(packageOfCigarettes);
                }
                break;

            case "4":
                listWithParametres.parameteresForBeer();
                CanOfBeer canOfBeer = vendingMachine.getProductOther(
                        (String) ListWithParametres.getListWithParametres().get(0),
                        (Double) ListWithParametres.getListWithParametres().get(1),
                        (Double) ListWithParametres.getListWithParametres().get(2),
                        (Double) ListWithParametres.getListWithParametres().get(3));
                if (canOfBeer == null){
                    System.out.println("Такого товара в автомате нет");
                }
                else  {
                    System.out.println("Вы купили: ");
                    System.out.println(canOfBeer);
                }
                break;

            default:
                break;
        }
    }
}


