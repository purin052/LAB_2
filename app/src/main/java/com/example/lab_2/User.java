package com.example.lab_2;

public class User {
    //Attributes
    String id;
    String password;
    String userName;
    //Method
   void login(){
       System.out.println("login");
   }
   void logout(){
       System.out.println(" logged out.");
   }
   void setUserName(String newUserName){
       this.userName = newUserName;
   }
}
