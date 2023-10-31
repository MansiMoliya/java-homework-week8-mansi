package homework_week_8;

public class Program16_Point {
    private int x;
    private int y;
    public static void main(String[] args){
        Program16_Point first = new Program16_Point(6, 5);
        Program16_Point second = new Program16_Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Program16_Point point = new Program16_Point();
        System.out.println("distance()= " + point.distance());
    }

    public Program16_Point() {
        this.x = 0;
        this.y = 0;
    }
    public Program16_Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    public  double distance(){
        return this.distance(0,0);
    }
    public double distance(int x, int y){
        return Math.sqrt(Math.pow((this.y - y) ,2) + Math.pow((this.x - x), 2));
    }
    public double distance(Program16_Point another){
        return this.distance(another.getX(), another.getY());
    }
}