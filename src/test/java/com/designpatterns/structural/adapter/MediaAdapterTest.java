package com.designpatterns.structural.adapter;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.assertj.core.api.Assertions.*;

class MediaAdapterTest {
    
    @Test
    void testAudioPlayerMP3() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        
        AudioPlayer player = new AudioPlayer();
        player.play("mp3", "song.mp3");
        
        assertThat(outContent.toString()).contains("Playing MP3 file: song.mp3");
        System.setOut(System.out);
    }
    
    @Test
    void testAudioPlayerWithAdapter() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        
        AudioPlayer player = new AudioPlayer();
        player.play("vlc", "movie.vlc");
        
        assertThat(outContent.toString()).contains("Playing VLC file: movie.vlc");
        System.setOut(System.out);
    }
}
