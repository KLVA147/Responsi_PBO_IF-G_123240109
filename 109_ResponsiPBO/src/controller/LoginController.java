/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import view.LoginView;
import view.MenuView;
import controller.MenuController;
import model.login.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Lab Informatika
 */
public class LoginController {
    private LoginView view;
    private LoginDAO model;
    
    public LoginController(LoginView view) {
        this.view = view;
        this.model = new Login();
        this.view.addLoginListener(new ActionListener(e -> {
        public void ActionPerformed(ActionEvent e) {
        String username = view.getUsername();
        String password = view.getPassword();
        
        if(username.isEmpty()||password.isEmpty()) {
            view.showErrorMessage("Username dan Password Tidak Boleh Kosong");
            return;
        }
        
        boolean LoginSukses = model.loginValidasi(username, password);
        if (LoginSukses) {
            view.showMessage("Login Berhasil");
            view.dispose();
            
            java.awt.EventQueue.invokeLater(() -> {
                MenuView view = new MenuView();
                MenuController(view);
                view.setVisible(true);
            }
            );
        } else {
            view.showErrorMessage("Username atau Password salah.");
        }
        }
    };
}   
}
