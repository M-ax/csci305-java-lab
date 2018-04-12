package csci305.javalab.player;

import csci305.javalab.element.Element;

public abstract class Player {
    private String name;
    //Keep track of what move play() generated last.
    //lastPlay only assigned after endRound() is called.
    protected Element lastPlayInternal;
    protected Element lastPlay;

    public Player(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
    public Element getLastPlay(){
        return lastPlay;
    }

    public abstract Element play(Player opponent);
    public void endRound(){
        //Expose last play to other objects AFTER the comparison.
        //No peeking.
        lastPlay = lastPlayInternal;
    }
}
