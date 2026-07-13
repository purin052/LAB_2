package com.example.lab_2;

public class User {
    //Attributes
    String Id;
    String Password;
    String userName;
    //Method
    public String getId(){

        return Id;
    }
    public void setId(String newId){

        this.Id = newId;
    }
    public String getPassword(){

        return Password;
    }

    public void setPassword(String newPassword){

        this.Password = newPassword;
    }
    public boolean login(){
        return true;

   }
   public void logout(){

        System.out.println(" logged out.");
   }
   String getUserName(){

        return userName;
   }
   void setUserName(String newUserName){

        this.userName = newUserName;
   }
}
