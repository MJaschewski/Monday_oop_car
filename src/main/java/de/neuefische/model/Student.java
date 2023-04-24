package de.neuefische.model;

public class Student {
    //Properties
        private static final int currentYear = 2023;
        private String name;
        private int birthYear;
        private  String className;
    //Access methods
    public Student() {

        }
    public Student(String name, int birthYear){
            this.name = name;
            this.birthYear = birthYear;
            setClassName();
        }

    public Student(String name, int birthYear, String className){
            this.name = name;
            this.birthYear = birthYear;
            this.className = className;
        }
    public void setName(String name){
            this.name = name;
        }
    public String getName(){
            return this.name;
        }
    public void setBirthYear( int birthYear){
            this.birthYear = birthYear;
        }

    public int getBrithYear() {
        return this.birthYear;
    }

    public void setClassName(){
            int classYear = currentYear - this.birthYear - 6;
            this.name.split(" ");
            String lastName = this.name.substring(this.name.lastIndexOf(" "));
            char lastNameFistLetter = lastName.charAt(1);
            this.className ="" + classYear + "-" + lastNameFistLetter;
        }
    public String getClassName() {
            return this.className;
        }
    public String toString() {
        String allInfo = "Name: " + this.name + " Birth: " + this.birthYear + " class: " + this.className;
        return allInfo;
    }

}
