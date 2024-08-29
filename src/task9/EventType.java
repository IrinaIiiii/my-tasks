package task9;

public enum EventType {

    CONFERENCE("Конференция"),
    MEETING("Встреча"),
    PHONED("Созвон"),
    CORPORATE_PARTY("Корпаратив");

    private String description;

    EventType(String description) {
        this.description = description;
    }
}
