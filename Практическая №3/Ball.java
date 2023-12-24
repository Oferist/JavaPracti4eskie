package pr3;

public class Ball {
    private double x = 0.0;
    private double y = 0.0;

    // Конструктор класса Ball
    public Ball(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public Ball() {
    	this.x = 1.0;
    	this.y = 1.0;
    }

    // Геттеры и сеттеры для полей x и y
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    // Метод для перемещения мяча на заданные координаты
    public void move(double xDisp, double yDisp) {
        x += xDisp;
        y += yDisp;
    }

    // Метод для одновременной установки полей x и y
    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    @Override
    public String toString() {
    	return "Ball @ (" + x + ", " + y + ")";
    }
}
