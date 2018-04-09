package csci305.javalab.element;

public class Rock extends Element {
    public Rock(String name){
        super(name);
    }

    @Override
    public Outcome compareTo(Element other){
        //Check outcome with respect to this meets the other element
        if (other instanceof Rock)
            return new Outcome("Tie", "Rock equals Rock");
        if (other instanceof Paper)
            return new Outcome("Lose", "Paper covers Rock");
        if (other instanceof Scissors)
            return new Outcome("Win", "Rock crushes Scissors");
        if (other instanceof Lizard)
            return new Outcome("Win", "Rock crushes Lizard");
        if (other instanceof Spock)
            return new Outcome("Lose", "Spock vaporizes Rock");

        //Shhhhh compiler
        return null;
    }
}
