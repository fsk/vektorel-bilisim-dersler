package com.fsk.egitim.enumerations;

public class Insan {
    private String name;
    private String surname;
    private String identityNumber;
    private int age;
    //private char gender;
    private Gender gender;

    public Insan(String name, String surname, String identityNumber, int age, Gender gender) {
        this.name = name;
        this.surname = surname;
        this.identityNumber = identityNumber;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getIdentityNumber() {
        return identityNumber;
    }

    public void setIdentityNumber(String identityNumber) {
        this.identityNumber = identityNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Insan{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", identityNumber='" + identityNumber + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
