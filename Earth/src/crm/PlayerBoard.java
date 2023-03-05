package crm;

public class PlayerBoard {
    private final int boardSize = 4;
    private String name;
    private String[][] playGrid = new String[boardSize][boardSize];

    public PlayerBoard() {
        this.name = "";
        for (int a = 0; a<boardSize; a++){
            for (int b = 0; b<boardSize; b++){
                playGrid[a][b] = "[      ]";
            }
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void playCard(int a, int b) {
        this.playGrid[a][b] = "[ CARD ]";
    }

    public void printGrid() {
        for (int a = 0; a<boardSize; a++){
            for (int b = 0; b<boardSize; b++){
                System.out.print(playGrid[a][b]);
            }
            System.out.println();
        }
    }
}