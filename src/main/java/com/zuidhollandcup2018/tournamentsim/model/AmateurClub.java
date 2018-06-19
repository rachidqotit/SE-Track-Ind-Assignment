package com.zuidhollandcup2018.tournamentsim.model;

public class AmateurClub extends FootballClub {

    private String localPub;


    //i have made a contructor with more parameters than in the abstract class constructor
    public AmateurClub (String name, String LocalPub, String teamSymbol){
        super (name, teamSymbol);
    }

    public String getLocalPub() {

        return localPub;
    }

    public void setLocalPub(String localPub) {

        this.localPub = localPub;
    }


}
