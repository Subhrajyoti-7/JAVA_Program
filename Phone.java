package com.practice.javaprograms;

interface GPU {
    void vibrate();
}
interface Camera {
    void takePhoto();
    void recordVideo();
}
interface Music {
    void playMusic();
}
class MyPhone {
    void call(String phoneNumber) {
        System.out.println("Calling " + phoneNumber);
    }
    void sms() {
        System.out.println("Message received");
    }
}

class SmartPhone extends MyPhone implements GPU, Camera, Music {

    @Override
    public void vibrate() {
        System.out.println("Vibrating");
    }

    @Override
    public void takePhoto() {
        System.out.println("Picture has taken");
    }

    @Override
    public void recordVideo() {
        System.out.println("Video recorded");
    }

    @Override
    public void playMusic() {
        System.out.println("Playing Music");
    }
}

public class Phone {
    public static void main(String[] args) {
        SmartPhone sm = new SmartPhone();
        sm.playMusic();
        sm.call("8339828210");
        sm.sms();
        sm.takePhoto();
    }
}