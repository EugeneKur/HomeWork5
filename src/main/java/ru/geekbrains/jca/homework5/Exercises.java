package ru.geekbrains.jca.homework5;

public class Exercises {
    public static void main(String[] args) {
        Employee employee22 = new Employee("Ivanov", "Petr", "Sergeevich", "Engineer", "Ivanov@gmail.com", "8-(999)-888-77-66", 200000, 30);
        employee22.informationOfEmployee();

        Employee[] employeeArray = new Employee[5];
        employeeArray[0] = new Employee("Petrov", "Sergey", "Aleksandrovich", "Booker", "Petrov@mail.ru", "8-(800)-555-353-35", 150000, 41);
        employeeArray[1] = new Employee("Sidorov", "Dmitry", "Valerevich", "Taxi driver", "Sidorov@mail.ru", "8-(987)-111-353-35", 100000, 25);
        employeeArray[2] = new Employee("Belkin", "Eugene", "Maksimovich", "jurist", "Belkin@mail.ru", "8-(963)-222-353-35", 250000, 53);
        employeeArray[3] = new Employee("Medvedeva", "Natalia", "Petrovna", "manager", "Medvedeva@mail.ru", "8-(951)-333-353-35", 50000, 22);
        employeeArray[4] = new Employee("Smirnova", "Anastasia", "Konstantinovna", "builder", "Smirnova@mail.ru", "8-(975)-444-353-35", 90000, 35);

        for (int i = 0; i < employeeArray.length; i++) {
            if (employeeArray[i].age > 40) {
                employeeArray[i].informationOfEmployee();
            }
        }
    }
}
