package DeclarationOfIndependence.src.main.java;

import java.util.*;

public class songs {
    public static void main (String[] args){
         //String variable generated from HW-2 from my favorite rock-band
         String intro = "Meet one of the worlds most famouse band: \"Bon Jovi\". These are info of the song \\ Bed of Roses";
         String title = "Bed of roses";
         String band = "Jon Bon Jovi, " + "Alec John Such, " + "Tico Torres, " + "Richie Sambora, " + "Phil X, " + "Hugh McDonald";
         String album = "Keep The Faith";
         String genre = "Rock";
         String releasedDate = "Jan 26th 1993";
         String recordedYear = "1992";
         String duration = "60 mins";
         String label = "Mercury";
         String songWriters = "Jon Bon Jovi";
         String producers = "Bob Rock";
         
 
         //Mapping the string key and value of the variable song with the HashMap method
         //And insert the keys and values with the put method
         Map<String,String> song = new HashMap<>();
         song.put("Song Intro:  " , intro);
         song.put("Song Title:  " , title);
         song.put("Song Band:  " , band);
         song.put("Song Album:  " , album);
         song.put("Song Genre:  " , genre);
         song.put("Song Label:  " , label);
         song.put("Song Writers:  " , songWriters);
         song.put("Song Producers:  " , producers);
         song.put("Song Released Date: " , releasedDate);
         song.put("Song Recorded Year: " , recordedYear);
         song.put("Song Duration: " , duration);
         
         //Creating a for loop for our mapped object with the entrySet method 
         //And printing out the keys and values using the getKey and getValue method
         for(Map.Entry<String,String> item: song.entrySet()) {
             System.out.println(item.getKey() + " " + item.getValue());
         }
    }
    
}
