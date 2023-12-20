package ru.antipov.exceptions_final;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.FileSystemException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите следующие данные через пробел: "
                + "\n\t #1 Фамилия Имя Отчество"
                + "\n\t #2 Дата рождения (дд.мм.гггг.)"
                + "\n\t #3 Номер телефона (9991234567)"
                + "\n\t #4 Пол (m - man | f - female)");

        String userData = "Drobik Vasldon Vasseldonovich 31.11.1978 1234567890 f";
//        String userData = sc.nextLine();
        String[] dataArray = userData.split(" ");
        for (String s : dataArray) {
            System.out.println(s);
        }
        checkAllData(dataArray);

        try {
            saveData(dataArray);
            System.out.println("Запись произошда успешно");
        } catch (FileSystemException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    static void saveData(String[] dataArray) throws Exception {
        String surname = dataArray[0];
        String name = dataArray[1];
        String patronymic = dataArray[2];
        String dateOfBirth = dataArray[3];
        String telephone = dataArray[4];
        String sex = dataArray[5];


        String fileName = surname.toLowerCase() + ".txt";
        File file = new File(fileName);
        try (FileWriter fileWriter = new FileWriter(file, true)) {
            if (file.length() > 0) {
                fileWriter.write('\n');
            }

            fileWriter.write(String.format("<%s><%s><%s><%s><%s><%s>", surname, name,
                    patronymic, dateOfBirth, telephone, sex));
        } catch (IOException e) {
            throw new FileSystemException("Ошибка при работе с файлом");
        }
    }


    static void checkAllData(String[] dataArray) {
        try {
            dataCountCheck(dataArray);
            fioCheck(dataArray, 0);
            nameCheck(dataArray, 1);
            patronymicCheck(dataArray, 2);
            dateOfBirthCheck(dataArray, 3);
            dateOfTelNumberCheck(dataArray, 4);
            sexCheck(dataArray, 5);
            System.out.println("Чудеса! Данные  введены верно!");
        } catch (DataCountException e) {
            System.out.println("Введенное вами кол-во данных не соответствует заданному");
        } catch (WrongFioException e) {
            System.out.println("В введенных данных присутствуют не только буквы");
        } catch (NotDigitalException e) {
            System.out.println("Данные должны содержать цифры");
        } catch (WrondDayException e) {
            System.out.println("Укажите правильный день рождения");
        } catch (WrongMonthException e) {
            System.out.println("Укажите правильный месяц рождения");
        } catch (WrongYearException e) {
            System.out.println("Укажите правильный год рождения");
        } catch (CountTelDigitalException e) {
            System.out.println("неверное количество цифр в номере");
        } catch (SexChoiceException e) {
            System.out.println("Пожалуйста выберите m или f");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void dataCountCheck(String[] dataArray) throws DataCountException {
        int countDataComponents = 6;

        if (dataArray.length < countDataComponents) {
            throw new DataCountException("Вы ввели недостаточное количество данных, " +
                    "надо было ввести: ", countDataComponents - 1);
        }
        if (dataArray.length > countDataComponents) {
            throw new DataCountException("Вы ввели слишком много данных, " +
                    "надо было ввести: ", countDataComponents - 1);
        }
    }

    static void dateOfTelNumberCheck(String[] array, int index) throws CountTelDigitalException,
            NotDigitalException {

        int counterForTelDigitals = 10;
        String checkLength = array[index];
        if (checkLength.length() < counterForTelDigitals) {
            throw new CountTelDigitalException("Вы ввели недостаточно цифр в номере телефона");
        }
        if (checkLength.length() > counterForTelDigitals) {
            throw new CountTelDigitalException("Вы ввели слишком много цифр в номере телефона");
        }
        try {
            Integer.parseInt(array[index]);
        } catch (NumberFormatException e) {
            throw new NotDigitalException("Введенные вами телефон состоит не из цифр");
        }
    }

    static void sexCheck(String[] array, int index) throws SexChoiceException {
        if (!array[index].equalsIgnoreCase("m") && !array[index].equalsIgnoreCase("f")) {
            throw new SexChoiceException("Пожалуйста выберите m или f");
        }
    }

    static void fioCheck(String[] array, int index) throws WrongFioException {

        String fioCheck = array[index];
        if (fioCheck.length() < 3) {
            throw new RuntimeException("Слишком короткое имя");
        }

        char c;
        for (int i = 0; i < fioCheck.length(); i++) {
            c = fioCheck.charAt(i);
            if ((c < 'A' || c > 'Z') && (c < 'a' || c > 'z')) {
                throw new WrongFioException("В введенных данных присутствуют не только буквы");
            }
        }
    }

    static void nameCheck(String[] array, int index) throws WrongFioException {

        String fioCheck = array[index];
        if (fioCheck.length() < 3) {
            throw new RuntimeException("Слишком короткое фамилия");
        }

        char c;
        for (int i = 0; i < fioCheck.length(); i++) {
            c = fioCheck.charAt(i);
            if ((c < 'A' || c > 'Z') && (c < 'a' || c > 'z')) {
                throw new WrongFioException("В введенных данных присутствуют не только буквы");
            }
        }
    }

    static void patronymicCheck(String[] array, int index) throws WrongFioException {

        String fioCheck = array[index];
        if (fioCheck.length() < 3) {
            throw new RuntimeException("Слишком короткое отчество");
        }

        char c;
        for (int i = 0; i < fioCheck.length(); i++) {
            c = fioCheck.charAt(i);
            if ((c < 'A' || c > 'Z') && (c < 'a' || c > 'z')) {
                throw new WrongFioException("В введенных данных присутствуют не только буквы");
            }
        }
    }

    static void dateOfBirthCheck(String[] array, int index) throws NotDigitalException,
            WrondDayException, WrongMonthException, WrongYearException {
        String helpS = array[index];
        String[] arrayCheck = helpS.split("\\.");

        for (String s : arrayCheck) {
            try {
                Integer.parseInt(s);
            } catch (NumberFormatException e) {
                throw new NotDigitalException("данные должны содержать цифру");
            }

            for (int i = 0; i < arrayCheck.length; i++) {
                int helperForCheck = Integer.parseInt(arrayCheck[i]);
                if (i == 0) {
                    if (helperForCheck < 0 || helperForCheck > 31) {
                        throw new WrondDayException("Укажите правильный день рождения");
                    }
                }
                if (i == 1) {
                    if (helperForCheck < 1 || helperForCheck > 12) {
                        throw new WrongMonthException("Укажите правильный месяц рождения");
                    }
                }

                if (i == 2) {
                    if (helperForCheck < 1950 || helperForCheck > 2008) {
                        throw new WrongYearException("Укажите правильный год рождения");
                    }
                }
            }
        }
    }
}
