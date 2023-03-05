package crm;

import java.util.Scanner;

public class Earth {
    private Scanner scan = new Scanner(System.in); // Create a Scanner object
    private final int maxPlayers = 5;
    private final int minPlayers = 1;
    private PlayerBoard[] players;

    public Earth() {
        intro();
        initPlayers();
    }

    public void GameStartBeginner() {
        int i = 0;
        int inputInt1 = 0;
        int inputInt2 = 0;
        boolean quit = false;
        while (!quit) {
            for (i = 0; i < players.length; i++) {
                System.out.println(players[i].getName() + "'s turn.");
                System.out.println("Place a card on your field (input row, then column, 0-3).");
                inputInt1 = scan.nextInt();
                inputInt2 = scan.nextInt();
                players[i].playCard(inputInt1,inputInt2);
                players[i].printGrid();
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
            System.out.print("Enter player " + (i+1) + "'s name: ");
            inputString = scan.nextLine();
            p.setName(inputString);
            players[i] = p;
        }
    }
}