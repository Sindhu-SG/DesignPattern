package com.eqbank.designpattern.command.commands;


import com.eqbank.designpattern.command.hardware.Music;

public class MusicOnCommand implements Command {
    Music music;

    public MusicOnCommand(Music music) {
        this.music = music;
    }

    @Override
    public void execute() {
        music.on();
        music.setVolume(5);
        music.setStation(99.9F);
    }

}
