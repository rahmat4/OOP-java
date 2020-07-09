package belajar3;

public abstract class Shape {
    String color;

    void setColor(String color){
        this.color = color;
    }
    String getColor(){
        return this.color;
    }

    abstract float getArea();
}

public class Triangle extends Shape {
    private float base;
    private float height;

    public Triangle(float base, float height){
        this.base = base;
        this.height = height;
    }

    @Override
    float getArea(){
        return (0.5f * base * height);
    }
}

public class Cricle extends Shape{
    private float radius;
    public Cricle(float radius){
        this.radius = radius;
    }

    @Override
    float getArea(){
        return (float) (Math.PI * radius * radius);
    }
}

public class Main {
    public static void main(String[] args) {
        Shape segitiga = new Triangle(4,6);
        Shape lingkaran = new Cricle(10);

        System.out.println("luas segitiga : " + segitiga.getArea());
        System.out.println("luas lingkaran : " + lingkaran.getArea());
        
    }
}