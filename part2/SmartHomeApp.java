package part2;//PART2-----------------------------------------------------------------------------------------------------------------

public class SmartHomeApp {
    public static void main(String[] args) {
        Light light = new Light();
        Thermostat thermostat = new Thermostat();
        MusicPlayer musicPlayer = new MusicPlayer();

        Command lightOn = new LightCommand(light);
        Command setThermostat = new ThermostatCommand(thermostat, 22);
        Command playMusic = new MusicPlayerCommand(musicPlayer);

        RemoteControl remote = new RemoteControl(5);
        remote.setCommand(0, lightOn);
        remote.setCommand(1, setThermostat);
        remote.setCommand(2, playMusic);

        remote.pressButton(0);
        remote.pressButton(1);
        remote.pressButton(2);

        remote.undoLast();
        remote.undoLast();
    }
}