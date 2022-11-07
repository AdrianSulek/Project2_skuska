package Project2.models;

public class Levels {

    String levelN = "Head";
    int levelP = 1;
    Boolean levelC = true;

    public Levels(String levelName,int levelPart, Boolean levelClear) {
        this.levelN = levelName;
        this.levelP = levelPart;
        this.levelC = levelClear;
    }

   /* void level(){
        String levelName = levelN;
        Integer levelPart = levelP;
        Boolean levelClear = levelC;
    }*/
}
