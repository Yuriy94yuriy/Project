package converter;

public class CelsiumToFarenheit extends Parameter {

    public CelsiumToFarenheit(int temperatureC) {
        super(temperatureC);
        setTemperatureC(temperatureC);
    }

    @Override
    public int convertCelsiumToFarenheit(int temperatureF) {

        return super.convertCelsiumToFarenheit(temperatureF);
    }

    public void printInfo() {
        System.out.println("Temperature in F: " + super.convertCelsiumToFarenheit(temperatureF));
    }
}
