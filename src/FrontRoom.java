public class FrontRoom extends Rooms{
    public String description(){
        return "You are in the front room. You see piano. (You can (1) exit to south (2) exit to west (3) exit to east. or press Q to quit)";
    }

    public Rooms next(char description){
        switch(description) {
            case '1':
                return new FoyerRoom();
            case '2':
                return new LibraryRoom();
            case '3':
                return new KitchenRoom();
        }
        return new FrontRoom();
    }
}
