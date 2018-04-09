package csci305.javalab.element;

public class Scissors extends Element {
    public Scissors(String name){
        super(name);
    }

    @Override
    public Outcome compareTo(Element other){
        //Check outcome with respect to this meets the other element
        if (other instanceof Rock)
            return new Outcome("Lose", "Rock crushes Scissors");
        if (other instanceof Paper)
            return new Outcome("Win", "Scissors cut Paper");
        if (other instanceof Scissors)
            return new Outcome("Tie", "Scissors equals Scissors");
        if (other instanceof Lizard)
            return new Outcome("Win", "Scissors decapitate Lizard");
        if (other instanceof Spock)
            return new Outcome("Lose", "Spock smashes Scissors");

        return null;
    }
}
