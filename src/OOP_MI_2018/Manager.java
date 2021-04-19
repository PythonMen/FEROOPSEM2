public class Manager extends Person{
    private Band managingBend;


    public Manager(String name, String country, int age, Band band){
        super(name, country, age, band);
        this.managingBend = band;
    }

    public void kickBandMember (Musician musician){
        int i=0;
        Musician [] musicians = new Musician[managingBend.getMusicians().length - 1];
        for (Musician m: managingBend.getMusicians()){
            if (m != musician){
                musicians[i] = m;
                i++;
            }
        }
        managingBend.setMusicians(musicians);
        i=0;
    }
}
