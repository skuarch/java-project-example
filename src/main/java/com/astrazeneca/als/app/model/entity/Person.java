package com.astrazeneca.als.app.model.entity;

import java.io.ObjectOutputStream;
import java.io.OutputStream;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Person {
    
    @Id
    Long id;
    String name;                        // visibility modifier is missing
    int age;                            // visibility modifier is missing
    static final int somenumber = 0;    // constant no uppercase
    
    public void sum() {                 // no javadoc // wrong name
         int r = 500 + 600;             // magic numbers  
    }
    
    public void opensome_Resources() {  // wrong name
        
        try {
            // unused variable
            OutputStream outputStream = new ObjectOutputStream(System.out); 
        } catch (Exception e) {         // empty trycatch
        }
        
    }
    
    
}
