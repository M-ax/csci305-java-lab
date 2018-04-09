package csci305.javalab.element;

public class Outcome {
    //Ex: Win/Tie/Lose
    private String result;
    //Ex: Paper covers Rock
    private String description;

    public Outcome(String result, String description){
        this.result = result;
        this.description = description;
    }

    public String getResult(){
        return result;
    }
    public String getDescription(){
        return description;
    }
}
