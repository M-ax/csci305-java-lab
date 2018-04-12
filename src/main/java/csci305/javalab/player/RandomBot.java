package csci305.javalab.player;

import csci305.javalab.element.Element;

import java.util.Random;

public class RandomBot extends Player {
    private static Random rand = new Random(System.nanoTime());


    public RandomBot(String name){
        super(name);
    }

    @Override
    public Element play(Player opponent){
        //Set lastPlay equal to the move, return
        return lastPlayInternal = Element.ELEMENTS[rand.nextInt(Element.ELEMENTS.length)];
    }
}
