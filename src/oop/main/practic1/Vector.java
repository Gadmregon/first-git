package oop.main.practic1;

public class Vector {

    private final double x;
    private final double y;
    private final double z;

    public Vector (double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public double sumV(){
        return Math.sqrt(x * x + y * y + z * z);
    }

    public double sSum(Vector v2){
        return x * v2.x + y * v2.y + z * v2.z;
    }

    public Vector crossProduct(Vector v2){
        return new Vector (y * v2.z - z * v2.y,
                z * v2.x - x * v2.z,
                x * v2.y - y * v2.x);
    }

    public double cos (Vector v2){
        return this.sSum(v2) / (this.sumV() * v2.sumV());
    }

    public Vector add(Vector v2){
        return new Vector(
                x + v2.x,
                y + v2.y,
                z + v2.z);
    }
    public Vector subtract(Vector v2){
        return new Vector(
                x - v2.x,
                y - v2.y,
                z - v2.z);
    }

    public static Vector[] mas(int n)
    {
        Vector[] v = new Vector[n];
        for (int i = 0; i < n; i++){
            v[i] = new Vector(Math.random(), Math.random(), Math.random());
        }
        return v;
    }
    public String toString() {
        return "Vector { " +
                "x = " + x +
                "; y = " + y +
                "; z = " + z +
                " }";

    }

}
