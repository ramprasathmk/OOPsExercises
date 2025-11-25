package com.oops_exercises.Abstraction.MediaPlayer;

public class VideoPlayer extends MediaPlayer {
    private String resolution;

    VideoPlayer() {}

    VideoPlayer(String resolution, String fileName) {
        super(fileName);
        this.resolution=resolution;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution=resolution;
    }

    @Override
    public void play() {
        System.out.println("Playing "+getFileName()+" Video in "+resolution+" Resolution.");
    }
}
