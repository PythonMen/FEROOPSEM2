public class Concert extends Event implements EventPromoter{

    private Band band;
    private String[] songs;
    private String date;

    public Concert(String name, String location, String date, Band band, String[] songs){
        super(name,location,date,band,songs);
        this.band = band;
        this.songs = songs;
        this.date = date;
    }

    public void printEventPoster(){
        System.out.println(this.date + "\n" + makeList(this.songs) + "\n" + this.band.getBandName());
    }

    private String makeList (String[] list){
        String ret = "";
        for(String l:list){
            ret += l + ", ";
        }
        return (ret.substring(0, ret.length()-2));
    }
}
