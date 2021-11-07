package lesson1;

public class Human implements Entity {

    private int stamina;
    private float jumpHeight;


    public Human(int stamina, float jumpHeight) {
        this.stamina = stamina;
        this.jumpHeight = jumpHeight;
    }

    public int getStamina() {
        return stamina;
    }

    public float getJumpHeight() {
        return jumpHeight;
    }


    @Override
    public boolean run(int distance) {
        if (getStamina() >= distance){
            System.out.println("Human ran successfully");
            decreaseStamina(distance);
            return true;
        }
        else {
            System.out.println("Human failed running");
            return false;
        }
    }

    @Override
    public boolean jump(float height) {
        if (getJumpHeight() >= height){
            System.out.println("Human jump over successfully");
            decreaseStamina((int) height*5);
            return true;
        }
        else {
            System.out.println("Human failed jumping");
            return false;
        }
    }

    public int decreaseStamina(int n){
        stamina -= n;
        System.out.println("Current stamina " + stamina);
        return stamina;
    }

}
