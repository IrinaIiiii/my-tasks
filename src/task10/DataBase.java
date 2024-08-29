package task10;

import java.util.ArrayList;
import java.util.List;

public class DataBase {

    public static final DataBase DATA_BASE = new DataBase();
    private List<Data> list = new ArrayList<>();

    private DataBase() {}

    public Data getData(int idData) {
        for (Data data: list) {
           if (data.getId()==idData) {
               return data;
           }
        }
        return null;
    }

    public void addData(Data data) {
        list.add(data);
    }
}
