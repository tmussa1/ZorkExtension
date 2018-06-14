public class SecretRoom extends Rooms {
    public String description(){
        return "Congratulations,you found GOLD, (you can (1) exit to west or press Q to quit";
    }
    public Rooms next(char description){
        switch(description) {
            case '1':
                return new VaultRoom();
        }
        return new SecretRoom();
    }
    public double Money(){
        return 8451;
    }
    public String items(){
        return "Gold";
    }
}
