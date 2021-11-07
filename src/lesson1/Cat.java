package lesson1;

public class Cat implements Entity{
    private int stamina;
    private float jumpHeight;


    public Cat (int stamina, float jumpHeight) {
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
            System.out.println("Cat ran successfully");
            decreaseStamina(distance);
            return true;
        }
        else {
            System.out.println("Cat failed running");
            return false;
        }
    }

    @Override
    public boolean jump(float height) {
        if (getJumpHeight() >= height){
            System.out.println("Cat jump over successfully");
            decreaseStamina((int) height*5);
            return true;
        }
        else {
            System.out.println("Cat failed jumping");
            return false;
        }
    }

    public int decreaseStamina(int n){
        stamina -= n;
        System.out.println("Current stamina " + stamina);
        return stamina;
    }
}