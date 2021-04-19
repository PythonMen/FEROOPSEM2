public class Festival extends Event implements EventPromoter{

    private String date;
    private String name;
    private Band[] bandList;

    public Festival(String name, String location, String date, Band[] bandList){
        super(name,location,date,bandList);
        this.name = name;
        this.date = date;
        this.bandList = bandList;
    }

    private String getBandNames(Band[] bands){
        String ret="";

        for (Band b: bands){
            ret += b.getBandName() + ", ";
        }
        return (ret.substring(0, ret.length()-2));
    }

    public void printEventPoster(){
        System.out.println(this.name + "\n" + this.date + "\n" + getBandNames(bandList));
    }
}
