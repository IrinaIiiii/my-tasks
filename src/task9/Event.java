package task9;

public class Event {

    private int id;
    private EventType eventType;
    private String info;

    public Event(int id, EventType eventType, String info) {
        this.id = id;
        this.eventType = eventType;
        this.info = info;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public EventType getEventType() {
        return eventType;
    }

    public void setEventType(EventType eventType) {
        this.eventType = eventType;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }


}
