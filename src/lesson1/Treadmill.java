package lesson1;

public class Treadmill implements Obstacle {
    private int distance;

    public Treadmill(int distance) {
        this.distance = distance;
    }

    public int getDistance() {
        return distance;
    }

    @Override
    public boolean overcome(Entity entity) {
        return entity.run(getDistance());
    }
}
