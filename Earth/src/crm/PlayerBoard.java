package crm;

import java.util.List;
import java.util.ArrayList;

public class PlayerBoard {
    private final int boardSize = 4;
    private String name;
    private int points;
    private Card[][] playGrid = new Card[boardSize][boardSize];
    private List<Card> hand = new ArrayList<Card>();

    public PlayerBoard() {
        this.name = "";
        this.points = 0;
    }

    public void loadEmptyGrid(Card x){
        for (int a = 0; a<boardSize; a++){
            for (int b = 0; b<boardSize; b++){
                playGrid[a][b] = x;
            }
        }
    }

    public void addPoints(int p) {
        points += p;
    }

    public int getPoints() {
        return points;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Returns the number of cards in the hand list.
    // To get an accurate count of the cards in hand,
    //  add 1 to the return.
    public int getHandSize(){
        return this.hand.size();
    }

    public void printHand() {
        System.out.print("  ");
        for (int b = 0; b<hand.size(); b++){
            System.out.printf("%-20s", "| " + hand.get(b).firstLine());
            System.out.print(" |  ");
        }
        System.out.println();
        System.out.print("  ");
        for (int b = 0; b<hand.size(); b++){
            System.out.printf("%-20s", "| " + hand.get(b).secondLine());
            System.out.print(" |  ");
        }
        System.out.println();
        System.out.print("  ");
        for (int b = 0; b<hand.size(); b++){
            System.out.printf("%-20s", "| " + hand.get(b).thirdLine());
            System.out.print(" |  ");
        }
        System.out.println();
        System.out.print("  ");
        for (int b = 0; b<hand.size(); b++){
            System.out.printf("%-20s", "| " + hand.get(b).fourthLine());
            System.out.print(" |  ");
        }
        System.out.println();
        System.out.print("  ");
        for (int b = 0; b<hand.size(); b++){
            System.out.printf("%-20s", "| " + hand.get(b).fifthLine());
            System.out.print(" |  ");
        }
        System.out.println();
        System.out.println("             1                       2                       3                       4                       5");
    }

    public boolean emptyHand() {
        if (hand.isEmpty()) {
            return true;
        }
        else {
            return false;
        }
    }

    public void playCard(int a, int b, int c) {
        this.playGrid[a][b] = this.hand.get(c-1);
    }

    // Draw x amount of cards.
    // Check if the deck is empty before attempting to draw.
    public void drawCard(int x, List<Card> d) {
        for (int a = 0; a < x; a++) {
            if (!d.isEmpty()) {
                this.hand.add(d.get(d.size() - 1));
                d.remove((d.size() - 1));
            }
            else {
                System.out.println("The deck is empty.");
                break;
            }
        }
    }

    public void printGrid() {
        for (int a = 0; a<boardSize; a++){
            System.out.print(a+1 + " ");
            for (int b = 0; b<boardSize; b++){
                System.out.printf("%-20s", "| " + playGrid[a][b].firstLine());
                System.out.print(" |  ");
            }
            System.out.println();
            System.out.print("  ");
            for (int b = 0; b<boardSize; b++){
                System.out.printf("%-20s", "| " + playGrid[a][b].secondLine());
                System.out.print(" |  ");
            }
            System.out.println();
            System.out.print("  ");
            for (int b = 0; b<boardSize; b++){
                System.out.printf("%-20s", "| " + playGrid[a][b].thirdLine());
                System.out.print(" |  ");
            }
            System.out.println();
            System.out.print("  ");
            for (int b = 0; b<boardSize; b++){
                System.out.printf("%-20s", "| " + playGrid[a][b].fourthLine());
                System.out.print(" |  ");
            }
            System.out.println();
            System.out.print("  ");
            for (int b = 0; b<boardSize; b++){
                System.out.printf("%-20s", "| " + playGrid[a][b].fifthLine());
                System.out.print(" |  ");
            }
            System.out.println();
            System.out.println();
        }
        System.out.println("             1                       2                       3                       4");
    }
}