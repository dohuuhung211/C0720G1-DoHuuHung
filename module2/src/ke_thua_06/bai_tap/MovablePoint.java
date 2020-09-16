package ke_thua_06.bai_tap;

public class MovablePoint extends Point {
    protected float xSpeed = 0.0f;
    protected float ySpeed = 0.0f;
    public MovablePoint(){};

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed(){
        return new float[]{this.x,this.ySpeed};
    }
    public MovablePoint move(){
        x += xSpeed;
        y += ySpeed;
        return this;

    }
    @Override
    public String toString() {
        return super.toString() + ", " + " xSpeed: " +
               getxSpeed() + ", ySpeed: " + getySpeed();
    }
//    @Override
//    public String toString() {
//        return "MovablePoint{" +
//                "xSpeed=" + xSpeed +
//                ", ySpeed=" + ySpeed +
//                '}';
    public static void main(String[] args) {
        MovablePoint movable = new MovablePoint(5,6,7,8);
        System.out.println(movable);
    }
}
