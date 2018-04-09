package csci305.javalab.player;

import csci305.javalab.element.Element;

import java.util.Scanner;

public class Human extends Player {
    private Scanner inScan = new Scanner(System.in);

    public Human(String name){
        super(name);
    }

    @Override
    public Element play(Player opponent){
        for (int i = 0; i < Element.ELEMENTS.length; i++){
            System.out.printf("%d : %s", i, Element.ELEMENTS[i].getName());
        }

        int move = -1;
        while (move < 0 || move >= Element.ELEMENTS.length){
            System.out.print("Enter your move: ");
            move = inScan.nextInt();
        }

        return lastPlayInternal = Element.ELEMENTS[move];
    }
}
