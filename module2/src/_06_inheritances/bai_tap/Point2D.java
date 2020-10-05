package _06_inheritances.bai_tap;

public class Point2D {
    protected float x = 0.0f;
    protected float y = 0.0f;
    public Point2D(){
    }
    public Point2D(float x, float y){
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
        Point2D point2D = new Point2D(3.5f,3.0f);
        System.out.println(point2D);
    }
}
