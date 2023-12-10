package ru.antipov.seminar_7.factory;



import java.util.ArrayList;
import java.util.Random;

public class Program {

    static Random random = new Random();

    private static Employee generateEmployee(EmployeeType employeeType){

        String[] names = new String[]{"Эдуард", "Геннадий", "Виктор", "Матвей", "Роман",
                "Константин", "Даниил", "Денис", "Егор", "Никита", "Вячеслав", "Михаил",
                "Александр", "Валентин", "Борис", "Максим", "Павел", "Тимур", "Антон", "Микола"};

        String[] surNames = new String[]{"Блинов", "Овчинников", "Матвеев", "Никитин", "Лебедев",
                "Маслов", "Зайцев", "Тарасов", "Антонов", "Чернов", "Рожков", "Анисимов", "Мишин",
                "Соболев", "Королев", "Рогов", "Кулагин", "Павлов", "Захаров", "Харитонов"};
        int salary = random.nextInt(200, 500);
        int index = random.nextInt(100, 150);

        return switch (employeeType){
            case Worker -> new Worker(surNames[random.nextInt(surNames.length)],
                    names[random.nextInt(names.length)], salary * index);
            case Freelacer -> new Freelancer(surNames[random.nextInt(surNames.length)],
                    names[random.nextInt(names.length)], salary);
        };
    }

    static Employee generateEmployee(){
        int typeIndex = random.nextInt(2);
        return switch (typeIndex){
            case 0 -> generateEmployee(EmployeeType.Worker);
            case 1 -> generateEmployee(EmployeeType.Freelacer);
            default -> null;
        };
    }

    static ArrayList<Employee> generateEmployees (int  count){
        ArrayList<Employee> employees = new ArrayList<>();
        for (int i = 0; i < count; i++){
            employees.add(generateEmployee());
        }
        return employees;
    }

    public static void main(String[] args) {
        for (Employee e1: generateEmployees(15)){
            System.out.println(e1);
        }


    }
}
