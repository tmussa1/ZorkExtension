import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Rooms fyr = new FoyerRoom();
        System.out.println(fyr.description());
        char keyboard = input.next().charAt(0);
        Rooms room = new Rooms();
        room=fyr;
        while(keyboard != 'Q'){
            room = room.next(input.next().charAt(0));
            System.out.println(room.description());
            System.out.println(room.ghostfollow());
        }

    }
}
