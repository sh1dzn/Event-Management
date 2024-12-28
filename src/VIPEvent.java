public class VIPEvent extends Event {
    private String specialGuests;

    public VIPEvent(String eventName, String date, String location, String specialGuests) {
        super(eventName, date, location);
        this.specialGuests = specialGuests;
    }

    public String getSpecialGuests() {
        return specialGuests;
    }

    public void setSpecialGuests(String specialGuests) {
        this.specialGuests = specialGuests;
    }

    @Override
    public String toString() {
        return super.toString() + ", Special Guests: " + specialGuests;
    }
}