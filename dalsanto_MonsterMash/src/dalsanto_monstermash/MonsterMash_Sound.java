package dalsanto_monstermash;
import java.io.InputStream;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

//Matthew Dal Santo
//ITDEV140
//Assignment 6

public class MonsterMash_Sound {
    
    public MonsterMash_Sound(String wav) { soundPath = wav; } 

    private String soundPath;
    
    public void Play()
    {
        try
        {
            InputStream inputStream = getClass().getResourceAsStream(soundPath);
            AudioStream audioStream = new AudioStream(inputStream);
            AudioPlayer.player.start(audioStream);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
