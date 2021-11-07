package lesson1;

public class Wall implements Obstacle{
    private float height;

    public Wall(float height) {
        this.height = height;
    }

    public float getHeight() {
        return height;
    }

    @Override
    public boolean overcome(Entity entity) {
        return entity.jump(getHeight());
    }
}

