package crm;

public class Fauna extends Card {
    private final String type = "     <Fauna>";
    // These are just the card text for the objectives split into three strings for printing purposes
    private String objective1;
    private String objective2;
    private String objective3;

    public Fauna() {
        name = "";
        objective1 = "";
        objective2 = "";
        objective3 = "";
    }

    public Fauna(String n, String o1, String o2, String o3) {
        name = n;
        objective1 = o1;
        objective2 = o2;
        objective3 = o3;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return name;
    }

    public void printFullCard(){
        System.out.println(name + "\n" + type + "\n" + objective1 + "\n" + objective2 + "\n" + objective3);
    }

    public String stringSecondLine(){
        return type;
    }

    public String stringThirdLine(){
        return objective1;
    }

    public String stringFourthLine(){
        return objective2;
    }

    public String stringFifthLine(){
        return objective3;
    }
}