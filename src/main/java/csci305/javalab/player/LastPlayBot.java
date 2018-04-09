package csci305.javalab.player;

import csci305.javalab.element.Element;

public class LastPlayBot extends Player {
    public LastPlayBot(String name){
        super(name);
    }

    @Override
    public Element play(Player opponent){
        if (opponent.getLastPlay() != null)
            return lastPlayInternal = opponent.getLastPlay();

        return lastPlayInternal = Element.ROCK;
    }
}
