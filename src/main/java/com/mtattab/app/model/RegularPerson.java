package com.mtattab.app.model;

import java.util.Objects;

public class RegularPerson {

    String firstName;
    String lastName;
    String email;
    String phoneNumber;
    Integer age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RegularPerson that = (RegularPerson) o;
        return Objects.equals(firstName, that.firstName) && Objects.equals(lastName, that.lastName) && Objects.equals(email, that.email) && Objects.equals(phoneNumber, that.phoneNumber) && Objects.equals(age, that.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, email, phoneNumber, age);
    }

    @Override
    public String toString() {
        return "RegularPerson{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", age=" + age +
                '}';
    }

    public RegularPerson() {
    }

    public RegularPerson(String firstName, String lastName, String email, String phoneNumber, Integer age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.age = age;
    }

    public static void main(String[] args) {
        RegularPerson person = new RegularPerson();
        person.setFirstName("Mohamed");
        person.setLastName("Hattab");
        person.setEmail("MohammedEmail@email.com");
        person.setPhoneNumber("123-456-7890");
        person.setAge(30);
        System.out.println(person.getAge());
        System.out.println(person.toString());
    }
}
