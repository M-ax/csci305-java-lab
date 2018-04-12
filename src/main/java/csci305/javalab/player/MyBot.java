package csci305.javalab.player;

import csci305.javalab.element.*;

public class MyBot extends Player {
    public MyBot(String name){
        super(name);
    }

    @Override
    public Element play(Player opponent){
        Element opLastPlay = opponent.getLastPlay();

        if (opLastPlay != null){
            //Chose a move that will beat the opponents last move
            if (opLastPlay instanceof Rock)
                return lastPlayInternal = Element.SPOCK;
            if (opLastPlay instanceof Paper)
                return lastPlayInternal = Element.LIZARD;
            if (opLastPlay instanceof Scissors)
                return lastPlayInternal = Element.ROCK;
            if (opLastPlay instanceof Lizard)
                return lastPlayInternal = Element.SCISSORS;
            if (opLastPlay instanceof Spock)
                return lastPlayInternal = Element.PAPER;
        }

        //Default to rock as first move if opponent has no lastPlay
        return lastPlayInternal = Element.ROCK;
    }
}
