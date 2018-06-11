public class ParlorRoom extends Rooms {
    public String description(){
        return "You are in parlor. You see a treasure chest.(you can (1) exit to east (2) exit to south or press Q to quit";
    }

    public Rooms next(char description){
        switch(description) {
            case '1':
                return new VaultRoom();
            case '2':
                return new KitchenRoom();
        }
        return new ParlorRoom();
    }
}
