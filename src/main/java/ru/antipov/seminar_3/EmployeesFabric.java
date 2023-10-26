package ru.antipov.seminar_3;

import java.util.Random;

public class EmployeesFabric {

private static Random random = new Random();

    public static Employee generateEmployee() {
        String[] names = new String[]{"Эдуард", "Геннадий", "Виктор", "Матвей", "Роман",
                "Константин", "Даниил", "Денис", "Егор", "Никита", "Вячеслав", "Михаил",
                "Александр", "Валентин", "Борис", "Максим", "Павел", "Тимур", "Антон", "Микола"};

        String[] surNames = new String[]{"Блинов", "Овчинников", "Матвеев", "Никитин", "Лебедев",
                "Маслов", "Зайцев", "Тарасов", "Антонов", "Чернов", "Рожков", "Анисимов", "Мишин",
                "Соболев", "Королев", "Рогов", "Кулагин", "Павлов", "Захаров", "Харитонов"};

        String[] education = new String[]{"Middle school", "Secondary education", "Higher education"};

        String[] developmentDepartment =  new String[]{"Frontend", "Backend"};




        int salaryRate = random.nextInt(200, 2001);
        int employeeChoice = random.nextInt(1, 4);

        switch (employeeChoice){
            case 1:
                return new Worker(surNames[random.nextInt(surNames.length)],
                        names[random.nextInt(names.length)], salaryRate, random.nextInt(18, 65),
                        developmentDepartment[random.nextInt(developmentDepartment.length)]);
            case 2:
                int workHoursPerMonth = 0;
                int[]  averageMonthlyWorkHours = new int [12];
                for (int i = 0; i < 12; i++){
                    averageMonthlyWorkHours[i] = random.nextInt(40, 101);
                    workHoursPerMonth += averageMonthlyWorkHours[i];
                }
                workHoursPerMonth /= 12;
                return new Freelancer(surNames[random.nextInt(surNames.length)],
                        names[random.nextInt(names.length)], salaryRate , workHoursPerMonth,
                        developmentDepartment[random.nextInt(developmentDepartment.length)]);
            case 3:
                return new PartTimeWorker(surNames[random.nextInt(surNames.length)],
                        names[random.nextInt(names.length)], random.nextInt(200, 501),
                        random.nextInt(16, 25), education[random.nextInt(education.length)],
                        developmentDepartment[random.nextInt(developmentDepartment.length)]);
            default:
                break;
        }
        return null;
    }

    public static Employee [] generateEmployees(int count){
        Employee [] employees = new Employee[count];
        for (int i = 0; i < count; i++){
            employees[i] = generateEmployee();
        }
        return employees;
    }
}
