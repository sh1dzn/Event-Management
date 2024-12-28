public class Main {
    public static void main(String[] args) {
        EventManager eventManager = new EventManager();

        Event event1 = new Event("Tech Conference", "2024-01-15", "Almaty");
        Event event2 = new Event("Music Festival", "2024-02-20", "Astana");
        Event event3 = new Event("Art Exhibition", "2024-03-10", "Shymkent");
        Event event4 = new Event("Music Festival", "2024-02-25", "Almaty");

        eventManager.addEvent(event1);
        eventManager.addEvent(event2);
        eventManager.addEvent(event3);
        eventManager.addEvent(event4);

        eventManager.listEvents();

        System.out.println("\nSearching for 'Music Festival':");
        eventManager.searchEventByName("Music Festival");

        System.out.println("\nFiltering Events on '2024-02-20':");
        eventManager.filterEventsByDate("2024-02-20");

        System.out.println("\nSorting Events by Date:");
        eventManager.sortEventsByDate();

        System.out.println("\nSorting Events by Name:");
        eventManager.sortEventsByName();
    }
}