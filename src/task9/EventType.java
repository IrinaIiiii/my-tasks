package task9;

public enum EventType {

    CONFERENCE("�����������"),
    MEETING("�������"),
    PHONED("������"),
    CORPORATE_PARTY("����������");

    private String description;

    EventType(String description) {
        this.description = description;
    }
}
