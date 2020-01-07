package ua.splinestudio.rentautobus.model;

import java.util.Objects;

public class TripData {
    private final String from;
    private final String to;
    private final String date;
    private final String time;

    @Override
    public String toString() {
        return "TripData{" +
                "from='" + from + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TripData tripData = (TripData) o;
        return Objects.equals(from, tripData.from);
    }

    @Override
    public int hashCode() {
        return Objects.hash(from);
    }

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
