
package com.mela.pet_store;

import com.mela.CoreCode.Pets;
import com.mela.CoreCode.User;
import java.util.ArrayList;

public class VirtualDataBase {

    private static ArrayList<User> virtualDataBaseUser = new ArrayList<>();
    private static ArrayList<Pets> virtualDatabaseAnimal = new ArrayList<>();
    
    public void addAnimal(Pets a) {
        virtualDatabaseAnimal.add(a);
    }

    public void deleteCustomer(Pets a) {
        virtualDatabaseAnimal.add(a);
    }
 
    public boolean doesAnimalExist(Pets a) {
        for (Pets pet : virtualDatabaseAnimal) {  
            if(pet.equals(a)){
                return true;
            }
        }
        return false;
    }
    public void addCustomer(User u) {
        virtualDataBaseUser.add(u);
    }

    public void deleteCustomer(User u) {
        virtualDataBaseUser.add(u);
    }

    public boolean doesCustomerExist(User u) {
        for (User user : virtualDataBaseUser) {
            return u.getName().equals(user.getName()) && u.getPassword().equals(user.getPassword());
        }
        return false;
    }
    
}

