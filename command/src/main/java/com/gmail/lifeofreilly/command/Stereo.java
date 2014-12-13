package com.gmail.lifeofreilly.command;

public class Stereo {
    private String description;
    private boolean on;
    private int volume;

    public Stereo() {
        this.description = description;
        on = false;
        volume = 0;
    }


    public void on() {
        on = true;
        System.out.println("The stereo is now on.");
    }

    public void off() {
        on = false;
        System.out.println("The stereo is now off.");
    }

    public void setCD() {
        System.out.println("The stereo is now in CD mode.");
    }

    public void setVolume(int i) {
        volume = i;
        System.out.println("The stereo volume has been set to: " + volume);

    }
}
