package com.Oops.java;

public class Classes {

    // state representation (data)

    public String NAME;
    public int id;
    public String branch;
    public byte age;
    public byte percentage;

    // behaviour (action)

    // 1. instance method

    void basicInformation() {

        System.out.println("student name:" + NAME);
        System.out.println("student id :" + id);
        System.out.println("student branch:" + branch);
        System.out.println("student percentage:" + percentage);
        System.out.println("studentt age:" + age);

    }

    // 2.no returntype and with perameters

    void memberShip(String product) {
        System.out.println(product);
    }

    //3. with return type and no perameters

    byte discountPercentageByAge() {
        byte discountPercentage = 0;

        if (age >= 60)

            discountPercentage = 15;

        else if (age >= 50 && age < 60)

            discountPercentage = 25;

        else
            discountPercentage = 35;


        return discountPercentage;
    }

    // 4.with return type and with perameters


    double discountPercentageByPercentage(float productPrice) {
        byte discountPercentage = discountPercentageByAge();
        return productPrice - (productPrice * discountPercentage) / 100;


    }
}



