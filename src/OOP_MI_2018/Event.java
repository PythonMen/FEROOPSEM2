public abstract class Event {

    private final String name;
    private final String location;
    private String date;
    private Band band;
    private Band[] bandList;
    private String[] songs;


    // Concert
    public Event(String name, String location, String date, Band band, String[] songs){
        this.name = name;
        this.location = location;
        this.date = date;
        this.band = band;
        this.songs = songs;
    }

    // Festival
    public Event(String name, String location, String date, Band[] bandList){
        this.name = name;
        this.location = location;
        this.date = date;
        this.bandList = bandList;
    }
}
