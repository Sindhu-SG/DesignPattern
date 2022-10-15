package com.eqbank.designpattern.command.commands;

import com.eqbank.designpattern.command.hardware.KitchenLights;

public class KitchenLightsOffCommand implements Command {
    KitchenLights kitchenLights;

    public KitchenLightsOffCommand(KitchenLights kitchenLights) {
        this.kitchenLights= kitchenLights;
    }

    @Override
    public void execute() {
        kitchenLights.off();
    }

}
