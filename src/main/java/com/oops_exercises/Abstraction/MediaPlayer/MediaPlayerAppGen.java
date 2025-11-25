package com.oops_exercises.Abstraction.MediaPlayer;

public class MediaPlayerAppGen {
    static void main() throws InterruptedException {
        MediaPlayer app1=new AudioPlayer(2, "Suzume.mp3");
        MediaPlayer app2=new VideoPlayer("4K", "Kaantara.mp4");

        Thread.sleep(1000);
        app1.play();
        System.out.println();

        Thread.sleep(1000);
        app2.play();
    }
}
