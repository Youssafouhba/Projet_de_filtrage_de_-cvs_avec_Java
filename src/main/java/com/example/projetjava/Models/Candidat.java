package com.example.projetjava.Models;


import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Candidat extends User {

    /**
     *   Attributs
     **/
    private SimpleStringProperty cheminCV;
    private ObservableList<Offre> listeOffres; // Utilisation d'ObservableList pour les offres

    // Constructeur
    public Candidat(int idCandidat, String nom, String prenom, String login, String motDePasse, int idCV) {

        this.nom = new SimpleStringProperty(nom);
        this.prenom = new SimpleStringProperty(prenom);
        this.login = new SimpleStringProperty(login);
        this.motDePasseHash = new SimpleStringProperty(motDePasse);
        this.cheminCV = new SimpleStringProperty(""); // Initialisation du chemin du CV
        this.listeOffres = FXCollections.observableArrayList(); // Initialiser avec une ObservableList
    }

    public ObservableList<Offre> getListeOffres() {
        return listeOffres;
    }

    public void setListeOffres(ObservableList<Offre> listeOffres) {
        this.listeOffres = listeOffres;
    }

    public void PostulerOffre(Offre offre) {
        listeOffres.add(offre);
    }


    public String afficherOffresPostulees() {
        StringBuilder result = new StringBuilder();
        result.append("Liste des offres auxquelles ").append(prenom.get()).append(" ").append(nom.get()).append(" a postulé :\n");

        for (Offre offre : listeOffres) {
            result.append("- ").append(offre.getIntituleOffre()).append("\n");
        }

        return result.toString();
    }

    // Méthode pour obtenir les informations du profil du candidat
    public String afficherProfil() {
        StringBuilder result = new StringBuilder();
        result.append("Profil du candidat ").append(prenom.get()).append(" ").append(nom.get()).append(" :\n");
        result.append("1. Nom: ").append(nom.get()).append("\n");
        result.append("2. Prénom: ").append(prenom.get()).append("\n");
        result.append("3. Login: ").append(login.get()).append("\n");
        result.append("Liste des offres postulées:\n");

        for (Offre offre : listeOffres) {
            result.append(afficherOffresPostulees()).append("\n");
        }

        return result.toString();
    }

    // Méthode pour mettre à jour les informations du profil
    public void modifierProfil(String nouveauNom, String nouveauPrenom, String nouveauLogin) {
        this.nom.set(nouveauNom);
        this.prenom.set(nouveauPrenom);
        this.login.set(nouveauLogin);
    }

    // Méthode pour importer le CV
    public void importerCV(String cheminNouveauCV) {
        // Ajouter la logique pour copier le fichier du CV vers le répertoire de stockage du candidat
        // par exemple, vous pourriez utiliser java.nio.file.Files.copy() pour cela
        // Assurez-vous également de mettre à jour le chemin du CV
        // Notez que ceci est un exemple simplifié et peut nécessiter des ajustements en fonction de votre structure d'application
        // Par exemple, vous devriez probablement stocker les CV dans un emplacement spécifique sur le serveur ou dans une base de données
        // Placer les CV dans le répertoire du projet est généralement à des fins de démonstration et pourrait ne pas être sécurisé ou optimal.

        // Exemple :
        // java.nio.file.Files.copy(Paths.get(cheminNouveauCV), Paths.get("chemin/vers/le/repertoire/cv/" + nom.get() + "_" + prenom.get() + "_CV.pdf"), StandardCopyOption.REPLACE_EXISTING);

        // Mettre à jour le chemin du CV
        cheminCV.set("chemin/vers/le/repertoire/cv/" + nom.get() + "_" + prenom.get() + "_CV.pdf");
    }

    // Méthode pour récupérer le chemin du CV
    public String getCheminCV() {
        return cheminCV.get();
    }

    public static void main(String[] args) {

    }
}

