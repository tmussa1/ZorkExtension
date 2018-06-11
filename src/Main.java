import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Rooms fyr = new FoyerRoom();
        System.out.println(fyr.description());
        Rooms room = new Rooms();
        room=fyr;
        while(true){
            char keyboard = input.next().charAt(0);

            if(keyboard == 'Q'){
                break;
            }

            room = room.next(keyboard);
            System.out.println(room.description());

        }
        System.out.println(room.ghostfollow());
    }
}
