public class Musician extends Person {
    private Integer skill;
    private BandPosition bandPosition;
    private int age;

    public Musician(String name, String country, int age, BandPosition bandPosition, int skill){
        super(name, country, age, bandPosition, skill);
        this.skill = skill;
        this.bandPosition = bandPosition;
    }

    public void trainForOneYear(){
        this.age++;
        this.skill += 1;
    }

    @Override
    public String toString(){
        return super.toString() + bandPosition + "skill = " + skill;
    }
}
