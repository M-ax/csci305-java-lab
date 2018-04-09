package csci305.javalab.element;

public class Lizard extends Element {
    public Lizard(String name){
        super(name);
    }

    @Override
    public Outcome compareTo(Element other){
        //Check outcome with respect to this meets the other element
        if (other instanceof Rock)
            return new Outcome("Lose", "Rock crushes Lizard");
        if (other instanceof Paper)
            return new Outcome("Win", "Lizard eats Paper");
        if (other instanceof Scissors)
            return new Outcome("Lose", "Scissors decapitate Lizard");
        if (other instanceof Lizard)
            return new Outcome("Tie", "Lizard equals Lizard");
        if (other instanceof Spock)
            return new Outcome("Win", "Lizard poisons Spock");

        return null;
    }
}
