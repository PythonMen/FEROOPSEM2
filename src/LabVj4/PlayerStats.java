package LabVj4;

public class PlayerStats {
    private double accuracy;
    private double assist;
    private double entryFragging;
    private double utility;

    public PlayerStats(double acc, double ast, double ent, double utl) {
        this.accuracy = acc;
        this.assist = ast;
        this.entryFragging = ent;
        this.utility = utl;
    }

    public double getAccuracy() {
        return accuracy;
    }

    public double getAssist() {
        return assist;
    }

    public double getEntryFragging() {
        return entryFragging;
    }

    public double getUtility() {
        return utility;
    }

    public void setAccuracy(double accuracy) {
        this.accuracy = accuracy;
    }

    public void setAssist(double assist) {
        this.assist = assist;
    }

    public void setEntryFragging(double entryFragging) {
        this.entryFragging = entryFragging;
    }

    public void setUtility(double utility) {
        this.utility = utility;
    }
}
