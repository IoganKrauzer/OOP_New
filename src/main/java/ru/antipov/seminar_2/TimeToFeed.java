package ru.antipov.seminar_2;


public class TimeToFeed {
    static boolean checker;
    public static void main(String[] args) {

        Cat cat1 = new Cat("Пес", 15);
        Cat cat2 = new Cat("Васян", 36);
        Cat cat3 = new Cat("Петрович", 55);
        Cat cat4 = new Cat("Кальвадос", 44);
        Cat cat5 = new Cat("Петя", 29);
        Cat cat6 = new Cat("ЯнеКот", 37);
        Cat cat7 = new Cat("АяКот", 41);

        Cat[] cats = {cat1, cat2, cat3, cat4, cat5, cat6, cat7};
        Plate plate = new Plate(250);
        plate.showPlateInfo();
        System.out.println("-----------------------------------");
        boolean flag = true;

        while (flag) {
            for (Cat cat : cats) {
                if (!cat.isSatiety()) {
                    cat.setSatiety(cat.eat(plate.getFood()));
                    if (plate.getFood() - cat.getAppetite() < 0) {
                        System.out.println("Еды на тарелке больше не осталось");
                    } else {
                        plate.setFood(plate.getFood() - cat.getAppetite());
                        System.out.printf("Еды на тарелке осталось %d ед.\n", plate.getFood());
                    }
                }
            }
            System.out.println("-----------------------------------");
            for (Cat cat : cats) {
                checker = cat.isSatiety();
            }

            if (checker) {
                System.out.println("Все коты были накормлены и чувствуют себя прекрасно!\n");
                flag = false;
            }
            else {
                System.out.println("Не все коты были накормлены, старушка предлагает пополнить тарелку");
                plate.addFood();
                }
        }
        System.out.println("-----------------------------------");

        for (Cat cat: cats){
            System.out.printf("%s состояние сытости: %b\n", cat.getName(), cat.isSatiety());
        }
        System.out.println("-----------------------------------");
    }
}


