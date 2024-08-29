package task5;

import java.util.ArrayList;
import java.util.List;

public class DataBase {

    public static final DataBase DATA_BASE = new DataBase();
    private List<WeatherData> weatherDataList = new ArrayList<>();

    private DataBase() {}

//    public static DataBase getDataBase() {
//        if(DATA_BASE==null) {
//            DATA_BASE = new DataBase();
//        }
//        return DATA_BASE;
//    }

    public WeatherData getWeather(String city) {
        for (WeatherData weatherData: weatherDataList) {
            if (weatherData.getCity().equals(city)) {
                return weatherData;
            }
        }
        return null;
    }

    public void addWeatherData(WeatherData weatherData) {
        weatherDataList.add(weatherData);
    }



}
