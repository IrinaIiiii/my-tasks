package task5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cache {

   private Map<String, WeatherData> map = new HashMap<>();

   private final DataBase DATA_BASE = DataBase.DATA_BASE;

   public WeatherData weatherData(String city) {
      if (map.containsKey(city)) {
         return map.get(city);
      } else {
         return DATA_BASE.getWeather(city);
      }
   }

   public void delete(String city) {
      map.remove(city);
   }

   public void updateWeatherData(String city, double tempetature, double humidity) {
         map.get(city).setTempetature(tempetature);
         map.get(city).setHumidity(humidity);
   }

   public List<String> getListCity(Double tempetature) {
      List<String> list = new ArrayList<>();
      for (var entry: map.entrySet()) {
         if (entry.getValue().getTempetature()>20) {
            list.add(entry.getKey());
         }
      }
      return list;
   }
}
