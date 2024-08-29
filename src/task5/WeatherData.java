package task5;

public class WeatherData {
    private String city;
    private double tempetature;
    private double humidity;

    public WeatherData(String city, double tempetature, double humidity) {
        this.city = city;
        this.tempetature = tempetature;
        this.humidity = humidity;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getTempetature() {
        return tempetature;
    }

    public void setTempetature(double tempetature) {
        this.tempetature = tempetature;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    @Override
    public String toString() {
        return "WeatherData{" +
                "city='" + city + '\'' +
                ", tempetature=" + tempetature +
                ", humidity=" + humidity +
                '}';
    }
}
