package csci305.javalab.element;

public class Paper extends Element {
    public Paper(String name){
        super(name);
    }

    @Override
    public Outcome compareTo(Element other){
        //Check outcome with respect to this meets the other element
        if (other instanceof Rock)
            return new Outcome("Win", "Paper covers Rock");
        if (other instanceof Paper)
            return new Outcome("Tie", "Paper equals Paper");
        if (other instanceof Scissors)
            return new Outcome("Lose", "Scissors cut Paper");
        if (other instanceof Lizard)
            return new Outcome("Lose", "Lizard eats paper");
        if (other instanceof Spock)
            return new Outcome("Win", "Paper disproves Spock");

        return null;
    }
}
