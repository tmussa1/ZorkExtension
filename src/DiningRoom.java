public class DiningRoom extends Rooms {
    public String description(){
        return "You are standing in the dining room. You see a dust empty box. (you can (1) exit to south or press Q to quit)";
    }

    public Rooms next(char description){
        switch(description) {
            case '1':
                return new LibraryRoom();
        }
        return new DiningRoom();
    }
    public double Money(){
        return 8467;
    }
    public String items(){
        return "Dusty empty box";
    }
}
