public class Band {

    private String bandName;
    private Musician[] musicians;

    public Band(Musician[] musicians, String bandName) {
        this.musicians = musicians;
        this.bandName = bandName;

    }

    public Musician[] getMusicians() {
        return musicians;
    }

    public String getBandName(){
        return bandName;
    }

    public void setMusicians(Musician[] musicians){
        this.musicians = musicians;
    }

    @Override
    public String toString(){
        String ret = "Members of the band " + bandName + ": ";
        for (Musician m:musicians){
            ret += m.getName() + ", ";
        }
        return (ret.substring(0,ret.length()-2));
    }
}
