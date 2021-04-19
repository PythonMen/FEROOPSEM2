public class Person {
    private final String name;
    private final String country;
    private int age;
    private BandPosition bandPosition;
    private Integer skill;
    private Band band;

    // General, not necessary
    public Person(String name, String country, int age){
        this.name = name;
        this.country = country;
        this.age = age;
    }

    // Musician
    public Person(String name, String country, int age, BandPosition bandPosition, int skill){
        this.name = name;
        this.country = country;
        this.age = age;
        this.bandPosition = bandPosition;
        this.skill = skill;
    }

    // Manager
    public Person(String name, String country, int age, Band band){
        this.name = name;
        this.country = country;
        this.age = age;
        this.band = band;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public Integer getSkill() {
        return skill;
    }

    @Override
    public String toString(){
        return String.format("%s, %s, %s ", age, name, country);
    }

}
