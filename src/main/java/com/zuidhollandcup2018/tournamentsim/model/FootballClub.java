package com.zuidhollandcup2018.tournamentsim.model;

public abstract class FootballClub {

    private String name;
    private String teamSymbol;
    /*The teamSymbol variable describes the Sponsor for Pro clubs and the drinking mascotte for amateur clubs
    at first I did not have the teamSymbol variable, but separate Sponsor and DrinkingMascotte variables in the respective classes.
    I then had a problem to get the sponsor or drinking mascotte for the winner of the tournament so therefore I have grouped the two variables
    in this superclass, so I can use one getter for the finalist
     */

    public FootballClub(String name, String teamSymbol) {
        this.name = name;
        this.teamSymbol = teamSymbol;
    }

    public String getTeamSymbol() {
        return teamSymbol;
    }

    public void setTeamSymbol(String teamSymbol) {
        this.teamSymbol = teamSymbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

    this.name = name;
    }

}
