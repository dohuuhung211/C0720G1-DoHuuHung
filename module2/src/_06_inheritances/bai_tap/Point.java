package _06_inheritances.bai_tap;

public class Point {
    protected float x = 0.0f;
    protected float y = 0.0f;
    public Point(){
    }
    public Point(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }
    public float[] getXY(){
//        float[] arr = {this.x,this.y};
        return new float[]{this.x,this.y};
    }

    @Override
    public String toString() {
        return "phan tu x la: " + getX() + ", phan tu y la: " + getY();
    }

    public static void main(String[] args) {
        Point point = new Point(5, 6);
        System.out.println("Point " + point);

        MovablePoint moveablePoint = new MovablePoint(6, 8, 2, 1);
        System.out.println("Start: " + moveablePoint);
        System.out.println("End: " + moveablePoint.move());

        MovablePoint moveablePoint2 = new MovablePoint(5, 6);

    }
}
