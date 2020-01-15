/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.yazid.latihanmvc.controller;

import edu.yazid.latihanmvc.model.PelangganModel;
import edu.yazid.latihanmvc.view.PelangganView;
import javax.swing.JOptionPane;

/**
 *
 * NIM   : 10118907
 * Nama  : Yazid Fadlullah A.
 * Kelas : IF11K
 * 
 */
public class PelangganController {
    private PelangganModel model;

    public void setModel(PelangganModel model) {
        this.model = model;
    }
    
    public void resetForm(PelangganView view) {
        String nama = view.getTxtNama().getText();
        String email = view.getTxtEmail().getText();
        String notelp = view.getTxtNoTelp().getText();
        
        if (nama.equals("") && email.equals("") && notelp.equals("")) {
            
        } else {
            model.resetForm();
        }
    }
    
    public void simpanForm(PelangganView view) {
        String nama = view.getTxtNama().getText();
        String email = view.getTxtEmail().getText();
        String notelp = view.getTxtNoTelp().getText();
        
        if (nama.trim().equals("")) {
            JOptionPane.showMessageDialog(view, "Nama masih kosong");
        } else if (email.trim().equals("")) {
            JOptionPane.showMessageDialog(view, "Email masih kosong");
        } else if (notelp.trim().equals("")) {
            JOptionPane.showMessageDialog(view, "No. Telepon masih kosong");
        } else {
            model.simpanForm();
        }
        
    }
        
}
