package de.neuefische;

public class Main {
    public static void main(String[] args) {
        /*
        //SvenjaCar
            Car svenjaCar = new Car();

            //Set private property
            svenjaCar.setBrand("BMW");
            //svenjaCar.year = 2012;
            svenjaCar.price = 25000.00;
            // svenjaCar.hasFourWheels = true; not needed. Already defined with static

        //CristianCar
            Car cristianCar = new Car();

            //cristianCar.brand = "Seat";
            //cristianCar.year = 2020;
            cristianCar.price = 2000.00;

            cristianCar.printPrice(17500.00);
        //DominicCar
            Car dominicCar = new Car();

            //dominicCar.brand = "BMW";
            //If variable not set, zero in definition
            //System.out.println(dominicCar.year);
        */
        //Constructor defined
            /*
            Car michaelCar = new Car("Toyota", 2017, 17948.32, true);
            Car testCar = new Car("Mercedes", 2018, 20000.99);

            System.out.println(michaelCar.getBrand());

            System.out.println(michaelCar.getPrice());
            michaelCar.setPrice(8500.00);
            System.out.println(michaelCar.getPrice());
            */
        //Exercise Student Class
            Student tom = new Student();

            tom.setName("Tom Meier");
            tom.setBirthYear(2012);
            tom.setClassName();

            Student klaus = new Student("Klaus Bauer",2010);
            System.out.println(klaus.getClassName());


    }
}
