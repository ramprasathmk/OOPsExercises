package com.oops_exercises.Abstraction.MediaPlayer;

public class AudioPlayer extends MediaPlayer {
    private int duration;

    AudioPlayer() {}

    AudioPlayer(int duration, String fileName) {
        super(fileName);
        this.duration=duration;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration=duration;
    }

    @Override
    public void play() {
        System.out.println("Playing "+getFileName()+" Audio For "+duration+" Minutes.");
    }
}
