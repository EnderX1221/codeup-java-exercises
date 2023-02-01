package shapes;

public class Square extends Quadrilateral{
    public Square(int side) {
        super(side,side);
        this.side = side;
    }

    @Override
    public double setWidth() {
        return side;
    }

    @Override
    public double setLength() {
        return side;
    }
}

public class Square extends Rectangle {

    public Square(int side) {
        super(side, side);
        this.side = side;
    }

    @Override
    public int getArea() {
        return side * side;
    }
    @Override
    public int getPerimeter() {
        return 4 * side;
    }

}