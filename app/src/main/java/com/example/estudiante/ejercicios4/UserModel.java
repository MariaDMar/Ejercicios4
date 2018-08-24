package com.example.estudiante.ejercicios4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class UserModel{

   private String name;
   private String email;
   private String password;
   private String username;

    public UserModel(String name) {
        this.name = name;
        this.password = password;
        this.email = email;
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

}
