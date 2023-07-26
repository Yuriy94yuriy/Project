package converter;

public class CelsiumToKelvin extends Parameter{

    public CelsiumToKelvin(int temperatureC) {
        super(temperatureC);
        setTemperatureC(temperatureC);
    }

    @Override
    public double convertCelsiumToKelvin(double temperatureK) {

        return super.convertCelsiumToKelvin(temperatureK);
    }

    public void printInfo(){
        System.out.println("Temperature in K: " + super.convertCelsiumToKelvin(temperatureK));
    }
}
