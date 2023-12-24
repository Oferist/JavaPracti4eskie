package z4_and_z5;

public class Main {
    public static void main(String[] args) {
        MovablePoint point = new MovablePoint(1, 2, 2, 3);
        System.out.println("MovablePoint before moving: " + point);
        point.moveUp();
        System.out.println("MovablePoint after moving up: " + point + "\n");

        MovableCircle circle = new MovableCircle(0, 0, 2, 1, 5);
        System.out.println("MovableCircle before moving: " + circle);
        circle.moveRight();
        System.out.println("MovableCircle after moving right: " + circle + "\n");

        MovableRectangle rectangle = new MovableRectangle(1, 2, 5, 7, 2, 2);
        System.out.println("MovableRectangle before moving: " + rectangle);
        rectangle.moveDown();
        System.out.println("MovableRectangle after moving down: " + rectangle);
        System.out.println("Do points of the rectangle have the same speed? " + rectangle.checkSpeed());
    }
}
