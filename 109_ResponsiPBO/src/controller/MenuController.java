/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import view.*;
/**
 *
 * @author Lab Informatika
 */
public class MenuController {
    private MenuView view;
    
    public MenuController(MenuView view) {
        this.view = view;
        this.view.addSupplierListener(e -> {
        
        view.dispose();
        });
        
        this.view.addBarangListener(e -> {
        
        view.dispose();
        });
        
        this.view.addLogoutListener(e -> {
        view.showMessage("Anda keluar dari program.");
        view.dispose();
        
        LoginView login = new LoginView();
        new LoginController(login);
        login.setVisible(true);
        });
    }
}
