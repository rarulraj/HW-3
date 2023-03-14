package crm;

public class Card {
    protected String name;

    public Card() {
        name = "placeholder";
    }

    public Card(String n){
        name = n;
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

    public void printFullCard(){
        System.out.printf("%-20s", "| " + firstLine());
        System.out.print(" |  ");
        System.out.println();
        System.out.printf("%-20s", "| " + secondLine());
        System.out.print(" |  ");
        System.out.println();
        System.out.printf("%-20s", "| " + thirdLine());
        System.out.print(" |  ");
        System.out.println();
        System.out.printf("%-20s", "| " + fourthLine());
        System.out.print(" |  ");
        System.out.println();
        System.out.printf("%-20s", "| " + fifthLine());
        System.out.print(" |  ");
        System.out.println();
    }

    public String firstLine() {
        return name;
    }

    public String secondLine(){
        return "";
    }

    public String thirdLine(){
        return "";
    }

    public String fourthLine(){
        return "";
    }

    public String fifthLine(){
        return "";
    }

    public int cardEffect(PlayerBoard p){
        return 0;
        // This function is for the individual cards' effects.
        // For each card subclass, create this function and fill out the effect as necessary.
    }
}