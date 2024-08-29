package task10;

import java.time.LocalDateTime;

public class Data {

    private int id;
    private String value;
    private LocalDateTime localDateTime;

    public Data(int id, String value, LocalDateTime localDateTime) {
        this.id = id;
        this.value = value;
        this.localDateTime = localDateTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }
}
