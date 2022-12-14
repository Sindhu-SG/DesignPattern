package com.eqbank.designpattern.command.commands;


import com.eqbank.designpattern.command.hardware.KitchenLights;
import com.eqbank.designpattern.command.hardware.Music;

public class EverythingOnCommand implements Command {
    Music music;
    KitchenLights kitchenLights;

    public EverythingOnCommand(Music music, KitchenLights kitchenLights) {
        this.music = music;
        this.kitchenLights = kitchenLights;
    }

    @Override
    public void execute() {
        System.out.println("--- ITS PARTY TIME! ---");
        kitchenLights.on();
        music.on();
        music.setVolume(10);
        music.setStation(102.1F);
    }

}
