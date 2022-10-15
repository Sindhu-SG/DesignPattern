package com.eqbank.designpattern.command;


import com.eqbank.designpattern.command.commands.Command;
import com.eqbank.designpattern.command.commands.NoOpCommand;

import java.util.ArrayList;
import java.util.List;

public class AlexaDevice {

    List<Command> commands;
    int slots = 3;

    public AlexaDevice() {
        commands = new ArrayList<>();
    }

    public void setRoutine(int slot, Command command) {
        //slot between 0..2, neither commands can be nll
        if (command == null) {
            throw new IllegalArgumentException("Commands cannot be null!");
        } else {
            commands.add(command);
        }
    }

    public void activateRoutine(int slot) {
        if(slot > commands.size() -1 ) {
            System.out.println("No Routine to run, please add one ");
            return;
        }
        commands.get(slot).execute();
    }



    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n-------- Alexa Device Controller --------\n");
        for (int i = 0; i < slots; i++) {
            sb.append("Slot #" + i + " - " + commands.get(i).getClass().getSimpleName() + "(" + commands.getClass().getSimpleName() + ")" + "\n");
        }
        return sb.toString();
    }
}
