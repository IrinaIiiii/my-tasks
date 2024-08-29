package task9;

import java.util.*;

public class Main {

    private Map<Integer,Event> mapEvents = new HashMap<>();
    private Map<EventType, List<Event>> mapEventType = new HashMap<>();

    public void addEvent(Event event) {
        mapEvents.put(event.getId(), event);
        if(mapEventType.containsKey(event.getEventType())) {
            List<Event> list = mapEventType.get(event.getEventType());
            list.add(event);
        } else {
            List<Event> list = new ArrayList<>();
            list.add(event);
            mapEventType.put(event.getEventType(),list);
        }
    }

    public void updateEvent(Event event, String info) {
        mapEvents.get(event.getId()).setInfo(info);
        if (mapEvents.containsKey(event.getEventType())) {
            List<Event> list = mapEventType.get(event.getEventType());
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getId()==event.getId()) {
                    list.get(i).setInfo(info);
                }
            }
        }
    }

    public Event getEvent(int idEvent) {
        return mapEvents.get(idEvent);
    }

    public void deleteEvent(int idEvent) {
        Event event = mapEvents.get(idEvent);
        mapEvents.remove(idEvent);
        List<Event> list = mapEventType.get(event.getEventType());
        Iterator<Event> iterator = list.iterator();
        while (iterator.hasNext()) {
            if(iterator.next().equals(event)) {
                iterator.remove();
            }
        }
    }

    public List<Event> printEvents(EventType eventType) {
        return mapEventType.get(eventType);
    }

}
