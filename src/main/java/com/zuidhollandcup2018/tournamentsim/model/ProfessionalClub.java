package com.zuidhollandcup2018.tournamentsim.model;

public class ProfessionalClub extends FootballClub {

    private double budget;


    public ProfessionalClub(String name, String teamSymbol) {

        super(name, teamSymbol);
    }

    public double getBudget() {

        return budget;
    }

    public void setBudget(double budget) {

        this.budget = budget;
    }


}
