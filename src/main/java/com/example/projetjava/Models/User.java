package com.example.projetjava.Models;

import javafx.beans.property.SimpleStringProperty;

public class User {
    /**
     *   Attributs
     **/
    protected SimpleStringProperty nom;
    protected SimpleStringProperty prenom;
    protected SimpleStringProperty telephone;
    protected SimpleStringProperty email;
    protected SimpleStringProperty motDePasseHash;
    protected SimpleStringProperty login;

    /***
     * getters and setters
     ***/
    public String getNom() {
        return nom.get();
    }

    public void setNom(String nom) {
        this.nom.set(nom);
    }

    public String getPrenom() {
        return prenom.get();
    }

    public void setPrenom(String prenom) {
        this.prenom.set(prenom);
    }

    public String getTelephone() {
        return telephone.get();
    }

    public void setTelephone(String telephone) {
        this.telephone.set(telephone);
    }
    public void setMotDePasseHash(String motDePasseHash) {
        this.motDePasseHash.set(motDePasseHash);
    }
    public String getMotDePasseHash() {
        return motDePasseHash.get();
    }

    public void setEmail(String email) {
        this.email.set(email);
    }
    public String getEmail() {
        return email.get();
    }
    public void setlogin(String login){
        this.login.set(login);
    }
    public String getLogin() {
        return login.get();
    }
}
