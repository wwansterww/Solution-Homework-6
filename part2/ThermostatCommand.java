package part2;//PART2-----------------------------------------------------------------------------------------------------------------

public class ThermostatCommand implements Command {
    private Thermostat thermostat;
    private int temperature;

    public ThermostatCommand(Thermostat thermostat, int temp) {
        this.thermostat = thermostat;
        this.temperature = temp;
    }

    @Override
    public void execute() {
        thermostat.setTemperature(temperature);
    }

    @Override
    public void undo() {
        thermostat.revertToPreviousTemperature();
    }
}