package com.oops_exercises.Abstraction.MediaPlayer;

abstract class MediaPlayer {
    private String fileName;

    MediaPlayer() {}

    MediaPlayer(String fileName) {
        this.fileName=fileName;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName=fileName;
    }

    abstract void play();
}
