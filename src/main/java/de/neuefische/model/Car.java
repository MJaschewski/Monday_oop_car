package de.neuefische.model;

public class Car {
        //Properties
        private String brand;
        private int year;
        private double price;
        //static = set for all objects
        //final = unchangeable
        private boolean hasFourWheels = true;

    //Methods
        //Constructor
    //Modifier: have Constructors & getter/Setter puplic
    public  Car(String brand, int year, double price, boolean hasFourWheels){
            this.brand = brand;
            this.year = year;
            this.price = price;
            this.hasFourWheels = hasFourWheels;
        }
    public Car(String brand, int year, double price){
        this.brand = brand;
        this.year = year;
        this.price = price;
    }
    public  void honks() {
            System.out.println("HONK!");
            System.out.println();
            System.out.println("HONK! HONK!");
        }

    public   int getYear() {
            return year;
        }
    public  void setYear(int year){
            this.year = year;
        }
    public   String getBrand() {
            return this.brand;
        }
    public   void setBrand(String brand){
            this.brand = brand;
        }

    public  void printBrand(){
            System.out.println(brand);
        }

    public   void setPrice(double price){
            this.price = price;
        }

    public   double getPrice(){
            return this.price;
        }
    public  void printPrice(double price){
            //this = explicitly THIS object
            System.out.println("Without this;");
            System.out.println(price);
            System.out.println("With this:");
            System.out.println(this.price);
        }
}
