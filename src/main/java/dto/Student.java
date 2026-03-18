package dto;

import enums.Gender;
import enums.Hobbies;

import java.util.List;

public class Student {
    private String name;
    private String lastName;
    private String email;
    private Gender gender;
    private String mobile;
    private String dateOfBirth;
    private String subjects;
    private List<Hobbies> hobbies;
    private String picture;
    private String address;
    private String state;
    private String city;

    public Student(String name, String lastName, String email, Gender gender, String mobile, String dateOfBirth, String subjects, List<Hobbies> hobbies, String picture, String address, String state, String city) {
        this.address = address;
        this.city = city;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.gender = gender;
        this.hobbies = hobbies;
        this.lastName = lastName;
        this.mobile = mobile;
        this.name = name;
        this.picture = picture;
        this.state = state;
        this.subjects = subjects;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public List<Hobbies> getHobby() {
        return hobbies;
    }

    public void setHobby(List<Hobbies> hobbies) {
        this.hobbies = hobbies;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getSubjects() {
        return subjects;
    }

    public void setSubjects(String subjects) {
        this.subjects = subjects;
    }

}
