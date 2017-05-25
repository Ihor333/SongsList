package songslist;



public class SongsList {

    public static void main(String[] args) {
        Songs songs=new Songs();
        for(int i=1; i<=10; i++){
            Song song=new Song();
            song.setName("someSong"+i);
            song.setFilePath("C:\\Songs\\songs"+i+".mp3");
            songs.addSong(song.getName(), song.getFilePath());
            System.out.println(songs.songs.get(i-1).getName());
            // или System.out.println(songs.songs.get(i-1).getFilePath());
            
        }
        
        //создаем файл в который будем записывать список песень
        String filePath="C:\\Songs\\songs.txt";
        SongsFile songsFile=new SongsFile();
        songsFile.writeSongsListToFile(filePath, songs.songs);
        
    }
    
}