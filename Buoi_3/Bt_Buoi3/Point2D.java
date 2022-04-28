package Buoi_3.Bt_Buoi3;

public class Point2D {
    private float x, y;

    public Point2D() {
    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public void move(float dx, float dy) {
        x += dx;
        y += dy;
    }

    public float distance(Point2D p) {
        return (float) Math.sqrt(Math.pow((this.x - p.x), 2) + Math.pow(this.y - p.y, 2));
    }

    public void display() {
        System.out.println("(" + x + " ; " + y + ")");
    }
}
