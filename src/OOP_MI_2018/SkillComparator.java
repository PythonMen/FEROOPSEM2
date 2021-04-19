public class SkillComparator implements Comparator {

    @Override
    public int compare(Object musician1, Object musician2){
        Musician m1 = (Musician) musician1;
        Musician m2 = (Musician) musician2;

        try {
            if (m1.getSkill() > m2.getSkill()) {
                return 1;
            } else if (m1.getSkill() < m2.getSkill()) {
                return -1;
            } else {
                return 0;
            }
        }
        catch (NullPointerException e){
            throw new NullPointerException();
        }
        catch (ClassCastException e){
            throw new ClassCastException();
        }
    }
}
