package LabVj4;

import java.util.HashMap;
import java.util.Map;

class Game {

    public static double getAveragePlayerSkill(String nick, Map<String, PlayerStats> virtusPro) {

        double averageSum;
        double average;
        averageSum = (virtusPro.get(nick).getAccuracy()+virtusPro.get(nick).getAssist()+virtusPro.get(nick).getEntryFragging()+virtusPro.get(nick).getUtility());
        average = averageSum/4.;
        return average;
    }

    public static double getAverageTeamSkill(Map<String, PlayerStats> virtusPro) {

        double sum = 0;
        int x = 0;
        double average;

        for(String name : virtusPro.keySet()) {
            sum += Game.getAveragePlayerSkill(name, virtusPro);
            x++;
        }

        average = sum/x;

        return average;
    }

    public static String getMatchWinner(HashMap<String, HashMap<String, PlayerStats>> match) {

        String winner = new String();
        double max = 0;

        HashMap<String, PlayerStats> temp = new HashMap<>();

        for(String team : match.keySet()) {
            temp = match.get(team);
            if(Game.getAverageTeamSkill(temp) > max) {
                max =  Game.getAverageTeamSkill(temp);
                winner = team;
            }
        }

        return winner;

    }

    public static void replacePlayer(String player1, String player2, PlayerStats playerStats, HashMap<String, PlayerStats> team) {
        team.remove(player1);
        team.put(player2, playerStats);
    }
}