package com.eqbank.designpattern.command.commands;

import com.eqbank.designpattern.command.hardware.KitchenLights;
import com.eqbank.designpattern.command.hardware.Music;

public class EverythingOffCommand implements Command {
    Music music;
    KitchenLights kitchenLights;

    public EverythingOffCommand(Music music, KitchenLights kitchenLights) {
        this.music = music;
        this.kitchenLights = kitchenLights;
    }

    @Override
    public void execute() {
        System.out.println("--- PARTY TIME OVER! ---");
        kitchenLights.off();
        music.off();
        music.setVolume(0);
        music.setStation(0);
    }

}
