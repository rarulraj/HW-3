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
        System.out.println(name);
    }

    public String stringSecondLine(){
        return "";
    }

    public String stringThirdLine(){
        return "";
    }

    public String stringFourthLine(){
        return "";
    }

    public String stringFifthLine(){
        return "";
    }

    public void cardEffect(){
        // This function is for the individual cards' effects.
        // For each card subclass, create this function and fill out the effect as necessary.
    }
}