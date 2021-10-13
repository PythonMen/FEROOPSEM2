package Spas;


import java.util.*;
import java.util.function.Predicate;

public class Analysis {
    public static Predicate<Earthquake> newerThan(int year){
        return newerThan -> Integer.parseInt(newerThan.getDate().split("-")[0])>year;
    }
    public static Predicate<Earthquake> byCityName(String cityName){
        return ((earth)-> earth.getCityName().equals(cityName));
    }
    public static Predicate<Earthquake> byMagnitudeAndDepth(int depth, double magnitude){
        return (earth)-> (earth.getDepth()>depth && earth.getMagnitude()>magnitude);
    }
}