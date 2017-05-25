package songslist;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class SongsFile {

   public void writeSongsListToFile(String filePath, ArrayList<Song> songs){
        File file=new File(filePath);
        String textToWrite="";
        for(Song song:songs){
            textToWrite+=song.getName()+" "+song.getFilePath()+"\n";
            
        }
        try {
                FileWriter fileWriter=new FileWriter(file);
                
                fileWriter.write(textToWrite);
            } catch (IOException ex) {
              
            }
    }
    
    public String getSongsListFromFile (String filePath) throws IOException{
        String songsAsTxt="";
        try {
            BufferedReader reader=new BufferedReader(new FileReader(filePath));
            String line;
            while((line=reader.readLine())!=null){
                songsAsTxt+=line;
            }
            reader.close();
        } catch (FileNotFoundException ex) {
            
        }
        return songsAsTxt;
    }
    
}