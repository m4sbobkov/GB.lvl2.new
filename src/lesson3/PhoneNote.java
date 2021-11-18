package lesson3;

import java.util.*;

public class PhoneNote {
    private Map<String, List<String>> phoneNumbers;

    public PhoneNote() {
        this.phoneNumbers = new HashMap<>();
    }




    public void addNote (String name, String phoneNumber){
        if(phoneNumbers.containsKey(name)){
            phoneNumbers.get(name).add(phoneNumber);
        } else {
            phoneNumbers.put(name, new ArrayList<>());
            phoneNumbers.get(name).add(phoneNumber);
        }


    }

    public void getNumber (String name){

        System.out.println(name + phoneNumbers.get(name));
    }

}