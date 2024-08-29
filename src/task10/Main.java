package task10;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class Main {
    private static final int CACHE_SIZE = 10;
    private Map<Integer, Data> cache = new HashMap<>();

    public void addNewData(int idData, String valueData) {
        Data data = new Data(idData, valueData, LocalDateTime.now());
        if (cache.size() == 10) {
            LocalDateTime localDateTimeOld = data.getLocalDateTime();
            int id = 0;
            for (var entry : cache.entrySet()) {
                var time = entry.getValue().getLocalDateTime();
                if (time.isBefore(localDateTimeOld)) {
                    localDateTimeOld = time;
                    id = entry.getKey();
                }
            }
            cache.remove(id);
        }
        cache.put(idData, data);
    }

    public Data getData(int idData) {
        if (cache.containsKey(idData)) {
            Data data = cache.get(idData);
            data.setLocalDateTime(LocalDateTime.now());
            return data;
        }
        Data data = DataBase.DATA_BASE.getData(idData);
        addNewData(idData, data.getValue());
        return data;
    }
}



