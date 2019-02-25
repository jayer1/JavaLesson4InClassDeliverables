/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testdates;

/**
 *
 * @author ayerj
 */
public enum Team {

    BOSTON_CELTICS("Boston Celtics"),
    NEW_YORK_KNICKS("New York Knicks"),
    PHILDELPHIA_76ERS("Philadelphia 76ers"),
    TORONTO_RAPTORS("Toronto Raptors"),
    CHICAGO_BULLS("Chicago Bulls"),
    CLEVELAND_CAVALIERS("Cleveland Cavaliers"),
    DETROIT_PISTONS("Detroit Pistons"),
    INDIANA_PACERS("Indiana Pacers"),
    MILWAUKEE_BUCKS("Milwaukee Bucks"),
    ATLANTA_HAWKS("Atlanta Hawks"),
    CHARLOTTE_HORNETS("Charlotte Hornets"),
    MIAMI_HEAT("Miami Heat");

    private String team;

    Team(String team) {
        this.team = team;
    }

    public String getTeam() {
        return team;
    }
}
