package testaudio;
import java.io.InputStream;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

//Matthew Dal Santo
//ITDEV140
//In-Class Exercise

public class TestAudio {

    public static void main(String[] args) {
        
        PlayAudio pa = new PlayAudio();
        pa.playAudio();
    }    
}

class PlayAudio
{
    public void playAudio()
    {
        try
        {
            InputStream inputStream = getClass().getResourceAsStream("\\step.wav");
            AudioStream audioStream = new AudioStream(inputStream);
            AudioPlayer.player.start(audioStream);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
