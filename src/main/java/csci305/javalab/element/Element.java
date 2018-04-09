package csci305.javalab.element;

public abstract class Element {
    private String name;

    public Element(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public abstract Outcome compareTo(Element other);
}
