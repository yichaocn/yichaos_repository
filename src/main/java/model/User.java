package model;

import lombok.Data;

@Data
public class User {

     private int age;

     private String name ;

     public  void    intro(){
         System.out.println("name:"+name+"  age:"+age);

     }
}
