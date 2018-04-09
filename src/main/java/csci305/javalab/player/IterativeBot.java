package csci305.javalab.player;

import csci305.javalab.element.Element;

public class IterativeBot extends Player {
    private int curElem = 0;

    public IterativeBot(String name){
        super(name);
    }

    @Override
    public Element play(Player opponent){
        return lastPlayInternal = Element.ELEMENTS[curElem++ % Element.ELEMENTS.length];
    }
}
