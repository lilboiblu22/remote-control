package edu.iu.habahram.remotecontroller.model;

public class Stereo {

    String location = "";

    public Stereo(String location) {
        this.location = location;
    }

    public String on() {
        setCD();
        setVolume(8);
        return location + " stereo is on";
    }

    public String off() {
        return location + " stereo is off";
    }

    public String setCD() {
        return location + " stereo is set for CD input";
    }

    public String setDVD() {
        return location + " stereo is set for DVD input";
    }

    public String setRadio() {
        return location + " stereo is set for Radio";
    }

    public String setVolume(int volume) {
        return location + " stereo volume set to " + volume;
    }
}
