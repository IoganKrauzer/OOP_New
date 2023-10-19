package ru.antipov.seminar_1;

import java.util.List;

public class VendingMachine {

    List<Product> productList;

    public VendingMachine(List<Product> productList) {
        this.productList = productList;
    }

    public List<Product> getProductList() {
        return productList;
    }

   public  BottleOfMilk getProductBottle(String name, double price, double volume, double fat) {
       for (Product product : productList) {
           if (product instanceof BottleOfMilk){
               BottleOfMilk bottleOfMilk = (BottleOfMilk) product;
               if (bottleOfMilk.getName().equals(name) && bottleOfMilk.getPrice() == price
               && bottleOfMilk.getVolume() == volume && bottleOfMilk.getFat() == fat){
                   return bottleOfMilk;
               }
           }
        }
       return null;
    }

    public  BottleOfWater getProductBottle(String name, double price, double volume) {
        for (Product product : productList) {
            if (product instanceof BottleOfWater){
                BottleOfWater bottleOfWater = (BottleOfWater) product;
                if (bottleOfWater.getName().equals(name) && bottleOfWater.getPrice() == price
                        && bottleOfWater.getVolume() == volume){
                    return bottleOfWater;
                }
            }
        }
        return null;
    }
    public  CanOfBeer getProductOther(String name, double price, double volume, double alcohol) {
        for (Product product : productList) {
            if (product instanceof CanOfBeer){
                CanOfBeer canOfBeer = (CanOfBeer) product;
                if (canOfBeer.getName().equals(name) && canOfBeer.getPrice() == price
                && canOfBeer.getVolume() == volume && canOfBeer.getAlcohol() == alcohol){
                    return canOfBeer;
                }
            }
        }
        return null;
    }

    public  PackageOfCigarettes getProductOther(String name, double price) {
        for (Product product : productList) {
            if (product instanceof PackageOfCigarettes){
                PackageOfCigarettes packageOfCigarettes = (PackageOfCigarettes) product;
                if (packageOfCigarettes.getName().equals(name) && packageOfCigarettes.getPrice() == price){
                    return packageOfCigarettes;
                }
            }
        }
        return null;
    }


    @Override
    public String toString() {
        return "Товары в автоматe: " + "\n" + productList
                .toString()
                .replace("[", " ")
                .replace("]","")
                .replace(",", "");
    }
}

