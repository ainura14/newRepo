package org.example.Entity;

public class Employee {
    private String fullName;
    private String position;
    private int startYear;
    private double salary;

    public Employee(String fullName,String position, int startYear, double salary){
        this.fullName = fullName;
        this.position = position;
        this.startYear = startYear;
        this.salary = salary;
    }
    public Employee(){
        super();
    }


    public String getfullName(){
        return fullName;
    }
    public void setfullName(String fullName){
        this.fullName= fullName;
    }

    public String getPosition(){
        return position;
    }
    public void setPosition(String position){
        this.position = position;
    }

    public int getStartYear(){
        return startYear;
    }
    public void setStartYear(int startYear){
        this.startYear = startYear;
    }

    public double getSalary(){
        return salary;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
}
