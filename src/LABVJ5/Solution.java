package LABVJ5;

import java.util.*;
import java.util.function.Predicate;

class Solution {
    static Predicate<Superhero> superheroesFightingOnlySupervillain(String supervillain){
        return ((superhero) -> superhero.getSupervillains().contains(supervillain) && superhero.getSupervillains().size() == 1);
    }
    static Predicate<Superhero> superheroesWithMoreThanOneWordInAlias(){
        return ((superhero) -> superhero.getAlias().split(" ").length != 1);
    }
}

// Success!! :D