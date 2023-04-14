package Lecture3;



public class Vehicle {
    public boolean engineStatus;
    public String name;
    public int year;

    public Vehicle(String name, int year){
        this.name = name;
        this.year = year;
    }
    public int getYear() {
        return year;
    }

    public String getName() {
        return name;
    }

    public void startEngine(){
        this.engineStatus = true;
        System.out.println(this.engineStatus);
    }

    public void stopEngine(){
        this.engineStatus = false;
        System.out.println(this.engineStatus);
    }
}

