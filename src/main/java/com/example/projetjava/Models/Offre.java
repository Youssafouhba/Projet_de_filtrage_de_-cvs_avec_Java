package com.example.projetjava.Models;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.Date;

public class Offre {

    // Attributs
    private final SimpleIntegerProperty idOffre;
    private SimpleStringProperty intituleOffre;
    private SimpleStringProperty lieu;
    private SimpleDoubleProperty salaire;
    private SimpleStringProperty description;
    private SimpleObjectProperty<Date> dateLancement;
    private SimpleObjectProperty<Date> dateExpiration;
    private Recruteur recruteur;
    private ObservableList<Candidat> listeCandidats; // Liste des candidats pour cette offre

    // Constructeur
    public Offre(int idOffre, String intituleOffre, String lieu, double salaire, String description,
                 Date dateLancement, Date dateExpiration, Recruteur recruteur) {
        this.idOffre = new SimpleIntegerProperty(idOffre);
        this.intituleOffre = new SimpleStringProperty(intituleOffre);
        this.lieu = new SimpleStringProperty(lieu);
        this.salaire = new SimpleDoubleProperty(salaire);
        this.description = new SimpleStringProperty(description);
        this.dateLancement = new SimpleObjectProperty<>(dateLancement);
        this.dateExpiration = new SimpleObjectProperty<>(dateExpiration);
        this.recruteur = recruteur;
        this.listeCandidats = FXCollections.observableArrayList();
    }

    // Getters et Setters
    public int getIdOffre() {
        return idOffre.get();
    }

    public void setIdOffre(int idOffre) {
        this.idOffre.set(idOffre);
    }

    public String getIntituleOffre() {
        return intituleOffre.get();
    }

    public void setIntituleOffre(String intituleOffre) {
        this.intituleOffre.set(intituleOffre);
    }

    public String getLieu() {
        return lieu.get();
    }

    public void setLieu(String lieu) {
        this.lieu.set(lieu);
    }

    public double getSalaire() {
        return salaire.get();
    }

    public void setSalaire(double salaire) {
        this.salaire.set(salaire);
    }

    public String getDescription() {
        return description.get();
    }

    public void setDescription(String description) {
        this.description.set(description);
    }

    public Date getDateLancement() {
        return dateLancement.get();
    }

    public void setDateLancement(Date dateLancement) {
        this.dateLancement.set(dateLancement);
    }

    public Date getDateExpiration() {
        return dateExpiration.get();
    }

    public void setDateExpiration(Date dateExpiration) {
        this.dateExpiration.set(dateExpiration);
    }

    public Recruteur getRecruteur() {
        return recruteur;
    }

    public void setRecruteur(Recruteur recruteur) {
        this.recruteur = recruteur;
    }

    public ObservableList<Candidat> getListeCandidats() {
        return listeCandidats;
    }

    public void setListeCandidats(ObservableList<Candidat> listeCandidats) {
        this.listeCandidats = listeCandidats;
    }

    public void ajouterCandidat(Candidat candidat) {
        listeCandidats.add(candidat);
    }

    public void supprimerCandidat(Candidat candidat) {
        listeCandidats.remove(candidat);
    }
}

