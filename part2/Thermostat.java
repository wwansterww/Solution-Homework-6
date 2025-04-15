package part2;//PART2-----------------------------------------------------------------------------------------------------------------

public class Thermostat {
    private int temperature;

    public void setTemperature(int temp) {
        temperature = temp;
        System.out.println(" -| The temperature is set to |- " + temperature + " C");
    }

    public void revertToPreviousTemperature() {
        System.out.println(" -| Return to previous temperature |-");
    }
}