package com.eqbank.designpattern.command;

import com.eqbank.designpattern.command.commands.EverythingOnCommand;
import com.eqbank.designpattern.command.commands.KitchenLightsOffCommand;
import com.eqbank.designpattern.command.commands.KitchenLightsOnCommand;
import com.eqbank.designpattern.command.hardware.KitchenLights;
import com.eqbank.designpattern.command.hardware.Music;

public class CommandTest {
    public static void main(String[] args) {

//      ---------------------------------------------------------------

        AlexaDevice alexa = new AlexaDevice();

        //Create an instance
        KitchenLights kitchenLights = new KitchenLights();

        //Set the slots with new commands
        alexa.setRoutine(
                0,
                new KitchenLightsOnCommand(kitchenLights)
        );

        System.out.println(alexa);
        alexa.activateRoutine(0);

//      ---------------------------------------------------------------

        // Everything on!
//        AlexaDevice alexa = new AlexaDevice();
//
//        //Create an instance
//        KitchenLights kitchenLights = new KitchenLights();
//        Music music = new Music();
//
//        //Set the slots with new commands
//        alexa.setRoutine(
//                1,
//                new EverythingOnCommand(music, kitchenLights)
//        );
//
//        System.out.println(alexa);
//
//        alexa.activateRoutine(1);

    }
}
