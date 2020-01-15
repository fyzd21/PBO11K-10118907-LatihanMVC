/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.yazid.latihanmvc.model;

import edu.yazid.latihanmvc.event.PelangganListener;
import javax.swing.JOptionPane;

/**
 *
 * NIM   : 10118907
 * Nama  : Yazid Fadlullah A.
 * Kelas : IF11K
 * 
 */
public class PelangganModel {
    private String nama;
    private String email;
    private String notelp;

    private PelangganListener pelangganListener;

    public PelangganListener getPelangganListener() {
        return pelangganListener;
    }

    public void setPelangganListener(PelangganListener pelangganListener) {
        this.pelangganListener = pelangganListener;
    }
    
    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNotelp() {
        return notelp;
    }

    public void setNotelp(String notelp) {
        this.notelp = notelp;
        fireOnChange();
    }
    
    public void fireOnChange() {
        if (pelangganListener != null) {
            pelangganListener.onChange(this);
        }
    }
    public void resetForm() {
        setNama("");
        setEmail("");
        setNotelp("");
    }
    
    public void simpanForm() {
        JOptionPane.showMessageDialog(null, "Berhasil disimpan");
        resetForm();
    }
}
