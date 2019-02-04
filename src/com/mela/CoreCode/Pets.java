
package com.mela.CoreCode;

import java.util.Objects;


public class Pets {
    
    private String name, DOB, color, breed, uri;
    private int petID;
    
    public Pets(String name,String DOB,   String breed,String color,
                int petID ,String uri){
        this.DOB=DOB;
        this.breed=breed;
        this.color=color;
        this.name=name;
        this.petID=petID;
        this.uri=uri;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }
    
  //Get, Set name
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

 //Get , Set DOB
    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

 //Get, Set oolor
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

 //Get , Set breed
    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

 //Get , Set origin
   
   
   
    public int getPetID() {
        return petID;
    }

    public void setPetID(int petID) {
        this.petID = petID;
    }

    @Override
    public String toString() {
        return "Animals{" + "name=" + name + ", DOB=" + DOB + ", color=" + color + ", breed=" + breed + ", petID=" + petID + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pets other = (Pets) obj;
        if (this.petID != other.petID) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.DOB, other.DOB)) {
            return false;
        }
        if (!Objects.equals(this.color, other.color)) {
            return false;
        }
        if (!Objects.equals(this.breed, other.breed)) {
            return false;
        }
      
        return true;
    }
    
    
   
     
}