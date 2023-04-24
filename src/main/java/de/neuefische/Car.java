package de.neuefische;

public class Car {
        //Properties
        private String brand;
        private int year;
        private double price;
        //static = set for all objects
        //final = unchangeable
        boolean hasFourWheels = true;

    //Methods
        //Constructor
        Car(String brand, int year, double price, boolean hasFourWheels){
            this.brand = brand;
            this.year = year;
            this.price = price;
            this.hasFourWheels = hasFourWheels;
        }
    Car(String brand, int year, double price){
        this.brand = brand;
        this.year = year;
        this.price = price;
    }
        void honks() {
            System.out.println("HONK!");
            System.out.println();
            System.out.println("HONK! HONK!");
        }

        int getYear() {
            return year;
        }
        void setYear(int year){
            this.year = year;
        }
        String getBrand() {
            return this.brand;
        }
        void setBrand(String brand){
            this.brand = brand;
        }

        void printBrand(){
            System.out.println(brand);
        }

        void setPrice(double price){
            this.price = price;
        }

        double getPrice(){
            return this.price;
        }
        void printPrice(double price){
            //this = explicitly THIS object
            System.out.println("Without this;");
            System.out.println(price);
            System.out.println("With this:");
            System.out.println(this.price);
        }
}
