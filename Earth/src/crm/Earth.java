package crm;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Earth {
    private Scanner scan = new Scanner(System.in); // Create a Scanner object
    private final int maxPlayers = 5;
    private final int minPlayers = 1;
    private PlayerBoard[] players;
    private List<Card> deck = new ArrayList<Card>();

    public Earth() {
        intro();
        initPlayers();
        loadCards();
    }

    public void GameStartBeginner() {
        int i = 0;
        int inputInt1 = 0;
        int inputInt2 = 0;
        int inputInt3 = 0;
        boolean quit = false;
        while (!quit) {
            // Round Start
            // Cycle through players in order
            for (i = 0; i < players.length; i++) {
                System.out.println(players[i].getName() + "'s turn.");
                System.out.println(players[i].getName() + " draws " + 1 + " card.");
                players[i].drawCard(1, this.deck);
                System.out.println(players[i].getName() + " has " + players[i].getPoints() + " point(s).");
                players[i].printGrid();
                System.out.println(players[i].getName() + "'s hand.");
                players[i].printHand();
                System.out.println("Pick a card to play (0 to pass).");
                inputInt3 = scan.nextInt();
                if (!players[i].emptyHand() && inputInt3 > 0 && inputInt3 < players[i].getHandSize() + 1) {
                    System.out.println("Place the card on your field (input row, then column, 0-3).");
                    inputInt1 = scan.nextInt();
                    inputInt2 = scan.nextInt();
                    players[i].playCard(inputInt1,inputInt2,inputInt3);
                    players[i].printGrid();
                } else {
                    System.out.println(players[i].getName() + "'s hand is empty.");
                }
                System.out.println();
                System.out.println();
            }
            System.out.print("Continue? (0 = no | 1 = yes): ");
            inputInt1 = scan.nextInt();
            if (inputInt1 == 0) {
                quit = true;
            }
        }
    }

    private void intro(){
        System.out.println("This is a console-based version of Earth");
        System.out.println();
    }

    private void initPlayers() {
        String inputString = "";
        int inputInt = 0;

        while (inputInt < minPlayers || inputInt > maxPlayers) {
            System.out.print("Set playercount (1-5): ");
            inputInt = Integer.parseInt(scan.nextLine());
            players = new PlayerBoard[inputInt];
        }

        for (int i = 0; i < inputInt; i++) {
            PlayerBoard p = new PlayerBoard();
            p.loadEmptyGrid(new Card());
            System.out.print("Enter player " + (i+1) + "'s name: ");
            inputString = scan.nextLine();
            p.setName(inputString);
            players[i] = p;
        }
    }

    // Loads the cards into the deck list
    // For now we just have a Gazelle card here to mess around with.
    private void loadCards() {
        NorthernGiraffe northernGiraffe = new NorthernGiraffe();
        deck.add(northernGiraffe);
    }
}