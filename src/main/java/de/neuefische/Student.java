package de.neuefische;

public class Student {
    //Properties
        private static final int currentYear = 2023;
        private String name;
        private int birthYear;
        private  String className;
    //Access methods
        Student() {

        }
        Student(String name, int birthYear){
            this.name = name;
            this.birthYear = birthYear;
            setClassName();
        }

        Student(String name, int birthYear, String className){
            this.name = name;
            this.birthYear = birthYear;
            this.className = className;
        }
        void setName(String name){
            this.name = name;
        }
        String getName(){
            return this.name;
        }
        void setBirthYear( int birthYear){
            this.birthYear = birthYear;
        }

        void setClassName(){
            int classYear = currentYear - this.birthYear - 6;
            this.name.split(" ");
            String lastName = this.name.substring(this.name.lastIndexOf(" "));
            char lastNameFistLetter = lastName.charAt(1);
            this.className ="" + classYear + "-" + lastNameFistLetter;
        }
        String getClassName() {

            return this.className;
        }

}
