package com.example.projetjava.Traitement;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Filtraing {

    public static void CvFiltring(String filePath){


        // Créer une liste pour stocker les chaînes de caractères
        List<String> stringsList = new ArrayList<>();

        File file = new File(filePath);

        Scanner scanner = null;

        try {

            scanner = new Scanner(file);

        } catch (FileNotFoundException e) {

            throw new RuntimeException(e);

        }

        // Skip the first line
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }

        while (scanner.hasNext()) {

            String word = scanner.next();

            // Faites quelque chose avec le mot
            stringsList.add(word);

        }

        String[] text = stringsList.toArray(new String[0]);

        List<String> wordsToSearch = new ArrayList<>();

        wordsToSearch.add("php");

        wordsToSearch.add("Python");

        wordsToSearch.add("java");

        List<String> foundWords = searchWords(text, wordsToSearch);

        System.out.println("Mots trouvés : " + foundWords);




    }
    public static void main(String[] args) {

        CvFiltring("C:/Users/hp/Downloads/ProjetJava/src/main/java/com/example/projetjava/Traitement/cv.txt");
    }


    public static List<String> searchWords(String[] text, List<String> wordsToSearch) {
        Set<String> foundWords = new LinkedHashSet<>();

        for (String sentence : text) {
            for (String wordToSearch : wordsToSearch) {
                String pattern = "\\b" + wordToSearch.toLowerCase() + "\\b";
                Pattern regex = Pattern.compile(pattern);
                Matcher matcher = regex.matcher(sentence.toLowerCase());

                if (matcher.find()) {
                    foundWords.add(wordToSearch);
                }
            }
        }

        return new ArrayList<>(foundWords);
    }
}
