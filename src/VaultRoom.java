import java.util.Random;

public class VaultRoom extends Rooms {
    public String description(){
        return "You are in a vault. You see 3 walking skeletons, (you can (1) exit to east or press Q to quit";
    }

    public Rooms next(char description){
        Random rand = new Random();
        switch(description) {
            case '1':
                int random = rand.nextInt(4);
                switch(random) {
                    case 1:
                        return new SecretRoom();
                    default:
                        return new ParlorRoom();
                }
        }
        return new VaultRoom();
    }
}
