package com.eqbank.designpattern.command.commands;


import com.eqbank.designpattern.command.hardware.KitchenLights;

public class KitchenLightsOnCommand implements Command {
    KitchenLights kitchenLights;

    public KitchenLightsOnCommand(KitchenLights kitchenLights) {
        this.kitchenLights= kitchenLights;
    }

    @Override
    public void execute() {
        kitchenLights.on();
    }

}
