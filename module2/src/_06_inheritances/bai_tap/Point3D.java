package _06_inheritances.bai_tap;

public class Point3D extends Point2D {
    protected float z = 0.0f;
    public Point3D(){
    }
    /*public Point3D(float x, float y, float z){
        super(x,y);
    }
*/
    public Point3D(float z) {
        this.z = z;
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x, float y, float z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public float[] getXYZ(){
//        float[] arrXYZ = {this.x,this.y,this.z};
//        return arrXYZ;
        return new float[]{this.x,this.y,this.z};
    }

    @Override
    public String toString() {
        return "Phan tu x la: " + getX() + ", phan tu y la: " + getY() + " va phan tu z la: " + getZ();
    }

    public static void main(String[] args) {
        Point3D point3D = new Point3D(7,8,6);
        point3D.setX(5);
        System.out.println(point3D);
    }
}
