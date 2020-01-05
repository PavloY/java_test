package ua.splinestudio.rentautobus.model;

public class TripData {
    private final String from;
    private final String to;
    private final String date;
    private final String time;

    public TripData(String from, String to, String date, String time) {
        this.from = from;
        this.to = to;
        this.date = date;
        this.time = time;
    }

    public String getFrom() { return from; }

    public String getTo() {
        return to;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }
}
