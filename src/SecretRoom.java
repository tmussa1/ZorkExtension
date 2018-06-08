public class SecretRoom extends Rooms {
    public String description(){
        return "Congratulations,you found GOLD, (you can (1) exit to west or press Q to quit";
    }
    public Rooms next(char description){
        switch(description) {
            case '1':
                return new VaultRoom();
            case 'Q':
                System.exit(0);
        }
        return new SecretRoom();
    }
}
