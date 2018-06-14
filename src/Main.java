import java.util.*;

public class Main {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        Rooms fyr = new FoyerRoom();
        System.out.println(fyr.description());
        Rooms room;
        room=fyr;//Start from Foyer

        Vector<Double> moneyList = new Vector();//for money
        double money = 0;
        int index = 0;

        HashSet<String> visitedRooms = new HashSet<String>();//for visited rooms
        visitedRooms.add(fyr.items());//foyer always visited
        int visit = 1;//It starts with 1 since foyer is always visited

        Random rand = new Random();
        int random = rand.nextInt(8);
        Rooms character = null;
                                //Set the character in a random class
        switch(random){
            case 0:
                character = new FoyerRoom();
                break;
            case 1:
                character = new FrontRoom();
                break;
            case 2:
                character = new DiningRoom();
                break;
            case 3:
                character = new KitchenRoom();
                break;
            case 4:
                character = new ParlorRoom();
                break;
            case 5:
                character = new VaultRoom();
                break;
            case 6:
                character = new LibraryRoom();
                break;
            case 7:
                character = new SecretRoom();
                break;
        }
        while(true){
            char keyboard = input.next().charAt(0);

            if(keyboard == 'Q' || keyboard == 'q'){
                break;
            }

            room = room.next(keyboard);//move to the next room with a click of a choice

            if(moneyList.contains(room.Money()) == false){//Add money if it is not taken already

                System.out.println("Do you want money? 'y' for yes ");
                char keymoney = input.next().charAt(0);

                if(keymoney == 'y' || keymoney == 'Y') {
                    moneyList.add(room.Money());
                    money += moneyList.get(index);
                }
            index++;
            }

            if(room.getClass() == character.getClass()){//Set money to 0 if he finds the character
                money = 0;
            }

            if(visitedRooms.contains(room.items()) == false){//counts number of rooms visited and later used for printing items
                visitedRooms.add(room.items());
                visit += 1;
            }

            System.out.println(room.description());
            System.out.println("You have " + money);//Money on each move
        }
        System.out.println();
        System.out.println(room.ghostfollow());//ghost follows you sometimes
        System.out.println();
        System.out.println("Total rooms visited " + visit);
        System.out.println("Total money after exiting the game " + money);

        System.out.println();
        System.out.println("Items you have seen: ");

        for(String r: visitedRooms){
            System.out.println(r);
        }
    }
}
