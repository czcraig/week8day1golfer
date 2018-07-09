package models;

import javax.persistence.*;

@Table(name = "golfers")
@Entity
public class Golfer {

    private int id;
    private String firstName;
    private String secondName;
    private int age;


    public Golfer(String firstName, String secondName, int age, int ){
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "first_name")
    public String getFirstName(){
        return this.firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    @Column(name = "second_name")
    public String getSecondName(){
        return this.secondName;
    }

    public void setSecondName(String secondName){
        this.secondName = secondName;
    }

    @Column(name = "age")
    public int getAge(){
        return this.age;
    }

    public void canSetAge(int age){
        this.age = age;
    }

}