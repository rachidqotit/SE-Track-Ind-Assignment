package com.zuidhollandcup2018.tournamentsim;

import com.zuidhollandcup2018.tournamentsim.model.*;    //here i have imported the entire model package with *

import java.util.ArrayList;
import java.util.List;

public class App {

    //here I have made a play method for the actual match that we will use in the main method
// I assign a random double to two teams, after that I see which number is higher, the team with the higher number is the winner
    private static FootballClub play(FootballClub homeTeam, FootballClub awayTeam) {
        double team1 = Math.random();
        double team2 = Math.random();
        if (team1 > team2) {
            //System.out.println("The winner is " + homeTeam.getName());
            //I have chosen to get ride of the line above, because I want to have a specific message after each match
            return homeTeam;
        } else {
            //System.out.println("The winner is " + awayTeam.getName());
            ////I have chosen to get ride of the line above, because I want to have a specific message after each match
            return awayTeam;
        }

    }

    public static void main(String[] args) {

        //first I initialise four objects of the ProfessionalClub class, these are my 4 pro clubs
        ProfessionalClub feyenoord = new ProfessionalClub("Feyenoord", "Current");
        ProfessionalClub sparta = new ProfessionalClub("Sparta", "Centric");
        ProfessionalClub excelsior = new ProfessionalClub("Excelsior", "DSW");
        ProfessionalClub ado = new ProfessionalClub("ADO Den Haag", "Cars Jeans");

        //then I set budgets for each teams. I realise it's cleaner to add this variable as a parameters in the constructor,
        //but in this case I have chosen to use the setter. I actually use the parameter option later for the amateur clubs
        feyenoord.setBudget(10000000.00);
        sparta.setBudget(5000000);
        excelsior.setBudget(2000000);
        ado.setBudget(5000000);

        //here I make an Array List and add the 4 pro clubs to the list
        List<ProfessionalClub> profClubs = new ArrayList<>();
        profClubs.add(feyenoord);
        profClubs.add(sparta);
        profClubs.add(excelsior);
        profClubs.add(ado);

        /* When I created the pro club objects, I used setters. For the amateur clubs I have decided to enter the local pubs and
        drinking mascottes as parameters. Therefore I will not be using the AmateurClass specific methods anymore, so I have used
        polymorfism the initialise the amateur clubs as FootballClubs, as you can see on the left side below*/
        FootballClub alphenseBoys = new AmateurClub("Alphense Boys", "Cafe Lokaal", "Loekie de Leeuw");
        FootballClub fcBoshuizen = new AmateurClub("fc Boshuizen", "Het Dorrup", "Pipo de Clown");
        FootballClub hercules = new AmateurClub("Hercules", "Cafe Sport", "Super Hercules");
        FootballClub swiftBoys = new AmateurClub("Swift Boys", "Het Pleintje", "Swifty");

        List<FootballClub> amateurClubs = new ArrayList<>();
        amateurClubs.add(alphenseBoys);
        amateurClubs.add(fcBoshuizen);
        amateurClubs.add(hercules);
        amateurClubs.add(swiftBoys);

        //now I have two Array Lists, for professional clubs and amateur clubs


        /*As I have understood from the assignment we get pro clubs playing against amateur clubs.
        therefore, for the first round I have set the pro clubs against the amateur clubs, as you can see.
        I've  chosen to make a new ArrayList with the winners of the first round. I used the play method which I have
        made outside the main method to determine the winner*/


        System.out.println("Ladies and Gentlemen, welcome to the Zuid-Holland Cup 2018!");
        System.out.println("The first round of the tournament will be as follows: " +
                "The first match of the day will be played between " + amateurClubs.get(0).getName() + " and "
                + profClubs.get(0).getName()
                + ". The second match will be between " + amateurClubs.get(1).getName() + " and " + profClubs.get(1).getName()
                + ". After that we will see " + amateurClubs.get(2).getName() + " play " + profClubs.get(2).getName() +
                ". And the final match of the first round will be between " + amateurClubs.get(3).getName() + " and " + profClubs.get(3).getName());


//I have made a winnerlist for the first round. And I have added the winner of each match to the winner list. I have chosen
        List<FootballClub> winnerRound1 = new ArrayList<>();
        winnerRound1.add(play(amateurClubs.get(0), profClubs.get(0)));
        System.out.println("And the first semi-finalist is " + winnerRound1.get(0).getName() + "!");
        winnerRound1.add(play(amateurClubs.get(1), profClubs.get(1)));
        System.out.println("The second semi-finalist is " + winnerRound1.get(1).getName() + "!");
        winnerRound1.add(play(amateurClubs.get(2), profClubs.get(2)));
        System.out.println("Also " + winnerRound1.get(2).getName() + " will go through to the next round!");
        winnerRound1.add(play(amateurClubs.get(3), profClubs.get(3)));
        System.out.println("And our last semi-finalist is " + winnerRound1.get(3).getName());

        System.out.println("Ladies and gentlemen, we will now go through to the semi-finals which will be played between "
                + winnerRound1.get(0).getName() + " and " + winnerRound1.get(1).getName() + " first, followed by " + winnerRound1.get(2).getName() +
                " versus " + winnerRound1.get(3).getName());

        // here again I have made a new Arraylist for the finalists

        List<FootballClub> finalist = new ArrayList<>();
        finalist.add(play(winnerRound1.get(0), winnerRound1.get(1)));
        System.out.println("We have a first finalist, " + finalist.get(0).getName());
        finalist.add(play(winnerRound1.get(2), winnerRound1.get(3)));
        System.out.println("And the second finalist is " + finalist.get(1).getName() + "!");

        System.out.println("Okay, ladies and gentlemen, get ready for the final match between " + finalist.get(0).getName()
                + " and " + finalist.get(1).getName());

        //this line is to determine the final winner
        FootballClub tournamentWinner = play(finalist.get(0), finalist.get(1));

        System.out.println("....and the Winner is...." + tournamentWinner.getName() + "!. Let's watch the players as they celebrate" +
                " their hard earned victory with " + tournamentWinner.getTeamSymbol());

    }

}











