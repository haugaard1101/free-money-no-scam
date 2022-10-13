package com.example.freemoneynoscam.services;

public class ValidateEmailService {
    public boolean isEmailValid(String email){
        //TODO implement logic such that we verify an e-mail is valid
        if (email.contains("@")) {
            return true;
        } else if (email.contains(".")){
            return true;
        } else
            return false;
    }
}
