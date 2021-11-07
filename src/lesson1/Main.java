package lesson1;

public class Main {
    public static void main(String[] args) {

        Obstacle[] barriers = {
                new Treadmill(200),
                new Wall(2),
                new Treadmill(100),
                new Wall(4),
                new Treadmill(500)
        };

        Entity[] participants = {
                new Human(1000, 4.5f),
                new Cat(400, 5f),
                new Robot(99999, 1.5f),
                new Human(280, 2.5f)
        };



        competition(barriers, participants);

    }
    public static void competition (Obstacle[] barriers, Entity[] participants){
        for (int i = 0; i < participants.length; i++) {
            for (int j = 0; j < barriers.length; j++) {
                if (barriers[j].overcome(participants[i]) == false) break;
            }
            System.out.println();
        }
    }
}
