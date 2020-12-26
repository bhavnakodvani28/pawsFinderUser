/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package java.system.model;

/**
 *
 * @author user
 */
public class Dog {
    protected int dogID;
    protected String dogName;
    protected int dogAge;
    protected String dogSize;
    protected boolean gender;
    protected String breed;
    protected String color;
    protected String city;
    protected String description;
    protected boolean adoptionStatus;
    protected boolean friendly;
    protected float price;
 
    public Dog() {
    }
 
    public Dog(int dogID) {
        this.dogID = dogID;
    }
 
    public Dog(int dogID, String dogName, int dogAge, String dogSize, boolean gender, String breed, String color,String city, String description, boolean adoptionStatus, boolean friendly, float price)
    {        
        this.dogID = dogID;
        this.dogName = dogName;
        this.dogAge = dogAge;
        this.dogSize = dogSize;
        this.gender = gender;
        this.breed = breed;
        this.color = color;
        this.city = city;
        this.description = description;
        this.adoptionStatus = adoptionStatus;
        this.friendly = friendly;
        this.price = price;
    }
     
    public Dog(String dogName, int dogAge, String dogSize, boolean gender, String breed, String color,String city, String description, boolean adoptionStatus, boolean friendly, float price)
    {        
        this.dogName = dogName;
        this.dogAge = dogAge;
        this.dogSize = dogSize;
        this.gender = gender;
        this.breed = breed;
        this.color = color;
        this.city = city;
        this.description = description;
        this.adoptionStatus = adoptionStatus;
        this.friendly = friendly;
        this.price = price;
    }
 
    public int getDogID() {
        return dogID;
    }
 
    public void setId(int dogID) {
        this.dogID = dogID;
    }
 
    public String getName() {
        return dogName;
    }
 
    public void setName(String dogName) {
        this.dogName = dogName;
    }
 
    public int getAge() {
        return dogAge;
    }
 
    public void setAge(int dogAge) {
        this.dogAge = dogAge;
    }
    
    public String getSize() {
        return dogSize;
    }
 
    public void setSize(String dogSize) {
        this.dogSize = dogSize;
    }
    
    public boolean getGender() {
        return gender;
    }
 
    public void setGender(boolean gender) {
        this.gender = gender;
    }
    
    public String getBreed() {
        return breed;
    }
 
    public void setBreed(String breed) {
        this.breed = breed;
    }
    
    public String getColor() {
        return color;
    }
 
    public void setColor(String color) {
        this.color = color;
    }
    
    public String getCity() {
        return city;
    }
 
    public void setCity(String city) {
        this.city = city;
    }
    
    public String getDescription() {
        return description;
    }
 
    public void setDescription(String description) {
        this.description = description;
    }
    
    public boolean getAdoptionStatus() {
        return adoptionStatus;
    }
 
    public void setAdoptionStatus(boolean adoptionStauts) {
        this.adoptionStatus = adoptionStauts;
    }
    
    public boolean getFriendly() {
        return friendly;
    }
 
    public void setFriendly(boolean friendly) {
        this.friendly = friendly;
    }
    
    public float getPrice() {
        return price;
    }
 
    public void setPrice(float price) {
        this.price = price;
    }
}