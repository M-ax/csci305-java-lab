package csci305.javalab.player;

import csci305.javalab.element.Element;

import java.util.Random;

public class StupidBot extends Player {
    public StupidBot(String name){
        super(name);
    }

    @Override
    public Element play(Player opponent){
        return lastPlayInternal = Element.ROCK;
    }
}
