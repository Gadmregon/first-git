package oop.main.practic1;
public class Vector {

    private double x;
    private double y;
    private double z;

    public Vector (double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public double sumV(){
        return Math.sqrt(this.x * this.x + this.y * this.y + this.z * this.z);
    }
}
