package homework_week_8.carpet_cost_calculator;

public class Floor {
    double width;
    double length;

    public Floor(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {

        return length;
    }

    public double getWidth() {

        return width;
    }

    public Floor(Floor floor) {

    }

    public double getArea() {
        return length * width;
    }

    public String toString() {
        return "Dimensions of room: (length = " + length + ", width = " + width + ")";
    }

}
