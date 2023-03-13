package crm;

public class PlayerBoard {
    private final int boardSize = 4;
    private String name;
    private int points;
    private Card[][] playGrid = new Card[boardSize][boardSize];

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

    public void playCard(int a, int b, Card c) {
        this.playGrid[a][b] = c;
    }

    public void printGrid() {
        for (int a = 0; a<boardSize; a++){
            System.out.print(a+1 + " ");
            for (int b = 0; b<boardSize; b++){
                System.out.printf("%-20s", "| " + playGrid[a][b]);
                System.out.print(" |  ");
            }
            System.out.println();
            System.out.print("  ");
            for (int b = 0; b<boardSize; b++){
                System.out.printf("%-20s", "| " + playGrid[a][b].stringSecondLine());
                System.out.print(" |  ");
            }
            System.out.println();
            System.out.print("  ");
            for (int b = 0; b<boardSize; b++){
                System.out.printf("%-20s", "| " + playGrid[a][b].stringThirdLine());
                System.out.print(" |  ");
            }
            System.out.println();
            System.out.print("  ");
            for (int b = 0; b<boardSize; b++){
                System.out.printf("%-20s", "| " + playGrid[a][b].stringFourthLine());
                System.out.print(" |  ");
            }
            System.out.println();
            System.out.print("  ");
            for (int b = 0; b<boardSize; b++){
                System.out.printf("%-20s", "| " + playGrid[a][b].stringFifthLine());
                System.out.print(" |  ");
            }
            System.out.println();
        }
        System.out.println("              1                       2                       3                       4");
    }
}