/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaassignment.SalesManager;

import javaassignment.Admin.User;

/**
 *
 * @author jchok
 */
public class SalesManager extends User {

    // Constructor using User's constructor
    public SalesManager(String userId, String password) {
        super(userId, password);
    }

    public SalesManager(String[] userDetails) {
        super(userDetails);
    }

    public void viewItems() {
        //I don't think i need this?        
    }
}
