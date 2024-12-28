import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EventManager {
    private List<Event> events; // Data pool for Events

    // Constructor
    public EventManager() {
        this.events = new ArrayList<>();
    }

    // Add an Event to the data pool
    public void addEvent(Event event) {
        events.add(event);
    }

    public void listEvents() {
        System.out.println("All Events:");
        for (Event event : events) {
            System.out.println(event);
        }
    }

    public void searchEventByName(String name) {
        System.out.println("Search Results for Event Name: " + name);
        for (Event event : events) {
            if (event.getEventName().equalsIgnoreCase(name)) {
                System.out.println(event);
            }
        }
    }

    public void filterEventsByDate(String date) {
        System.out.println("Events on Date: " + date);
        for (Event event : events) {
            if (event.getDate().equals(date)) {
                System.out.println(event);
            }
        }
    }

    public void sortEventsByDate() {
        events.sort(Comparator.comparing(Event::getDate));
        System.out.println("Events Sorted by Date:");
        listEvents();
    }

    public void sortEventsByName() {
        events.sort(Comparator.comparing(Event::getEventName));
        System.out.println("Events Sorted by Name:");
        listEvents();
    }
}