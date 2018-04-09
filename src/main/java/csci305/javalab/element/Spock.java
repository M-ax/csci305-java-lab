package csci305.javalab.element;

public class Spock extends Element{
    public Spock(String name){
        super(name);
    }

    @Override
    public Outcome compareTo(Element other){
        //Check outcome with respect to this meets the other element
        if (other instanceof Rock)
            return new Outcome("Win", "Spock vaporizes Rock");
        if (other instanceof Paper)
            return new Outcome("Lose", "Paper disproves Spock");
        if (other instanceof Scissors)
            return new Outcome("Win", "Spock smashes Scissors");
        if (other instanceof Lizard)
            return new Outcome("Lose", "Lizard poisons Spock");
        if (other instanceof Spock)
            return new Outcome("Tie", "Spock equals Spock");

        return null;
    }
}
