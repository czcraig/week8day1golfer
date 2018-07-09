package models;

public class Golfer {

    private String firstName;
    private String secondName;
    private int age;
    private int handyCap;

    public Golfer(String firstName, String secondName, int age, int handyCap){
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        this.handyCap = handyCap;
    }

    public String getFirstName(){
        return this.firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getSecondName(){
        return this.secondName;
    }

    public void setSecondName(String secondName){
        this.secondName = secondName;
    }

    public int getAge(){
        return this.age;
    }

    public void canSetAge(int age){
        this.age = age;
    }

    public int canGetHandyCap(){
        return this.handyCap;
    }

    public void setHandyCap(int handyCap) {
        this.handyCap = handyCap;
    }
}