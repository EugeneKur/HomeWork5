package ru.geekbrains.jca.homework5;

public class Employee {
    String surname;
    String name;
    String patronymic;
    String position;
    String email;
    String phone;
    int salary;
    int age;

    Employee (String surname, String name, String patronymic, String position, String email, String phone, int salary, int age) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.position = position;
        this.email = email;
        this. phone = phone;
        this.salary = salary;
        this.age = age;
    }

    void informationOfEmployee() {
        System.out.printf(" Surname: %s \n Name: %s \n Patronymic: %s \n Postion: %s \n Email: %s \n Phone: %s \n Salary: %s \n Age: %s \n \n",
                surname, name, patronymic, position, email, phone, salary, age);
    }

    void informationOfEmployeeOlder40() {

    }






}
