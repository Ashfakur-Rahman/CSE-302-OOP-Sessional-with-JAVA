package JavaAssignment02;

public interface Area {

    final static float pi = 3.14f;

    float compute(float x, float y);
}

class Rectangle implements Area {

    @Override
    public float compute(float x, float y) {

        return (x * y);

    }
}

class Circle implements Area {

    @Override
    public float compute(float x, float y) {

        return (pi * x * x);
    }
}

class InterfaceTest {

    public static void main(String[] args) {

        Rectangle rect = new Rectangle();

        Circle cir = new Circle();

        Area area;

        area = rect;

        System.out.println("Area of Rectangle = " + area.compute(10, 20));

        area = cir;

        System.out.println("Area of circle = " + area.compute(10, 0));

    }
}
