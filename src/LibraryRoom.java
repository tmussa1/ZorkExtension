public class LibraryRoom extends Rooms {
    public String description(){
        return "You are in a library. You see spiders. (you can (1) exit to north (2) exit to east.";
    }

    public Rooms next(char description){
        switch(description) {
            case '1':
                return new DiningRoom();
            case '2':
                return new FrontRoom();
        }
        return new LibraryRoom();
    }
    public double Money(){
        return 3461;
    }
    public String items(){
        return "Spiders";
    }
}
