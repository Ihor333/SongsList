package songslist;   

import java.util.ArrayList;
import java.util.Random;

public class Songs {
    public ArrayList<Song> songs = new ArrayList<>();

   public void addSong(String name, String filePath){
       Song song = new Song();
       song.setName(name);
       song.setFilePath(filePath);
       songs.add(song);
   }
    public void removeSong(String name, String filePath){
       Song song = new Song();
       song.setName(name);
       song.setFilePath(filePath);
       songs.remove(song);
}
    public ArrayList<Song> getMixedList(){
        ArrayList<Song> mixedList = new ArrayList<>();
        if(songs.isEmpty()){
            return mixedList;
        }
        ArrayList<Song> tempList = new ArrayList<>();   
        for (Song song : songs){
            tempList.add(song);
        }
        Random random = new Random();
        while(!tempList.isEmpty()){
            int index = random.nextInt(tempList.size());
            mixedList.add(tempList.get(index));
        }
         return mixedList;
    }
}