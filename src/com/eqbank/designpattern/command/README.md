## Command Pattern

Command is a behavioral design pattern that turns a request into a stand-alone object that contains all information about the request. 

In a classic implementation, the command pattern requires implementing four components: the Command, the Receiver, the Invoker, and the Client.

### [Command Class](src/com/eqbank/designpattern/command/commands/Command.java)

A command is an object whose role is to store all the information required for executing an action, including the method to call, the method arguments, and the object (known as the receiver) that implements the method.

### [Receiver Class](src/com/eqbank/designpattern/command/commands/MusicOffCommand.java)

A receiver is an object that performs a set of cohesive actions. It's the component that performs the actual action when the command's execute() method is called.

### [Invoker Class](src/com/eqbank/designpattern/command/AlexaDevice.java)

An invoker is an object that knows how to execute a given command but doesn't know how the command has been implemented. It only knows the command's interface.

### [Client Class](src/com/eqbank/designpattern/command/CommandTest.java)

A client is an object that controls the command execution process by specifying what commands to execute and at what stages of the process to execute them.

[Reference](https://www.baeldung.com/java-command-pattern)

