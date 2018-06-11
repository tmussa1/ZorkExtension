import java.util.Random;

public  class Rooms {
    public String description(){
        return "";
    }
    public Rooms next(char description){
        return new Rooms();
    }
    public String ghostfollow(){
        Random rand = new Random();
        int random = rand.nextInt(4);
        if(random == 1) {
            return "You are being followed by a ghost";
        }
        return "Be carefull";
    }
}
