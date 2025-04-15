# --------------------------------------------------------------------------------------------------------------------Part 1-----------------------------------------------------------------------------------------------------------------------------------------------------
## Project Description

This project implements the **Chain of Responsibility** design pattern in the context of a tech support ticket handling system. In real life, when a user sends a request to tech support, it goes through multiple levels of support
The first level a chatbot that attempts to resolve common issues.
If the chatbot cannot help, the request is passed to a junior specialist.
If the junior specialist cannot resolve the issue, it is escalated to a senior engineer.

The goal of this project is to create a chain of handlers where each level either processes the request or passes it on to the next level.

## How it works
Each handler in the chain can either process the request or pass it along to the next handler.
If no handler can process the request, the system outputs a message indicating that manual escalation is needed.

## Main Components

**SupportHandler (abstract class)** The abstract class defining common methods for all handlers.
`setNext()` to set the next handler in the chain.
`handle()` to either process the request or forward it to the next handler.

**FAQBotHandler** A handler for simple requests such as password reset.
  
**JuniorSupportHandler** A handler for requests like refund requests and billing issues.
  
**SeniorSupportHandler** A handler for more complex requests like account bans and data loss.
**Invoker (SmartHomeRemoteControl)** Manages the execution and cancellation of commands, as well as outputting results.

## How the Chain of Responsibility Pattern works

The Chain of Responsibility pattern helps avoid direct coupling between the sender of a request and its handler. It allows passing the request through a chain of objects until a handler capable of processing the request is found.



# --------------------------------------------------------------------------------------------------------------------Part 2-----------------------------------------------------------------------------------------------------------------------------------------------------

## Project Description

This project implements the **Command Pattern** for controlling smart home devices through a remote control. Smart devices, such as **lights**, **thermostats**, and **music players**, can be controlled through commands that encapsulate the actions for these devices. Users can
1. Turn devices on and off.
2. Set parameters for devices (e.g., temperature).
3. Undo actions through the undo functionality.

### Goal
Control smart devices through commands.
Implement undo functionality.
Create macro commands (e.g., "Goodnight Mode" which turns off the lights and lowers the temperature).

## How the Command Pattern Works

The **Command Pattern** is used to encapsulate requests as objects. Each request becomes a command object that has `execute()` and `undo()` methods. This allows
Decoupling the sender of the request from the receiver.
Implementing functionality for undo and redo of commands.

## Main Components

**Command (interface)**  The interface for all commands, with methods `execute()` and `undo()`. These methods are used to execute the command and undo it.
  
**Light**, **Thermostat**, **MusicPlayer** Devices that are controlled by commands. These devices perform actions such as turning on the lights or changing the temperature.

**LightCommand**, **ThermostatCommand**, **MusicPlayerCommand** Concrete implementations of the commands for controlling the devices.

**RemoteControl** The invoker, which manages the execution of commands and supports undo functionality.


