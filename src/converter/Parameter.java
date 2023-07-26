package converter;

abstract class Parameter {

    double temperatureK;
    int temperatureF;
    private int temperatureC;

    public Parameter(int temperatureC) {

        this.temperatureC = temperatureC;
    }

    public int getTemperatureC() {

        return temperatureC;
    }

    public void setTemperatureC(int temperatureC) {

        this.temperatureC = temperatureC;
    }

    public int convertCelsiumToFarenheit(int temperatureF) {
        temperatureF = (int) (getTemperatureC() * 1.8 + 32);
        return temperatureF;
    }

    public double convertCelsiumToKelvin(double temperatureK) {
        temperatureK = getTemperatureC() + 273.15;
        return temperatureK;
    }
}


//Створіть абстрактний клас конвертер для конвертації температури.
//Цей клас повинем мати методи для конвертації з градусів Цельсія та у градуси Цельсія.
//Створить два класа нащадка абстрактного класа для конвертації Цельсій-Фарингейт, Цельсій-Кельвін.
//В окремому пакеті створіть клас, який буде містити main-метод і демонструвати роботу зі створеними класами.
//Формули:
//Для переводу градусів Цельсия у Кельвіни необхідно використовувати формулі
// T=t+T0 де T- температура у Кельвінах, t- температура в градусах Цельсія, T0=273.15 Кельвина;
//Для переводу градусів Цельсия у Фарінгейти необхідно використовувати формулу T = t х 1,8 + 32,
// де T - температура у Фаренгейтах, t- температура в градусах Цельсія. Приклад: 10°C x 1,8 + 32 = 50°F.