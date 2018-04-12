package csci305.javalab.element;

public abstract class Element {
    // ""singleton"" Elements, only one of each is needed in memory to get the job done.
    //Avoid crapping out unnecessary Element objects all over memory
    public static Element ROCK = new Rock("Rock");
    public static Element PAPER = new Paper("Paper");
    public static Element SCISSORS = new Scissors("Scissors");
    public static Element LIZARD = new Lizard("Lizard");
    public static Element SPOCK = new Spock("Spock");
    public static Element[] ELEMENTS =
            { Element.ROCK, Element.PAPER, Element.SCISSORS, Element.LIZARD, Element.SPOCK };


    private String name;

    public Element(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public abstract Outcome compareTo(Element other);
}
