import java.util.Random;

public class TestBall {
    public static void main(String[] args) {
        float x, y, xDelta, yDelta;
        int radius;
        Random random = new Random();
        x = random.nextFloat();
        y = random.nextFloat();
        xDelta = random.nextFloat();
        yDelta = random.nextFloat();
        radius = random.nextInt();
        Ball ball = new Ball(x, y, radius, xDelta, yDelta);
        System.out.println(ball);
        ball.reflectHorizontal();
        ball.move();
        System.out.println(ball);
        System.out.println("At the moment X is: "+ball.getX());
        System.out.println("And Y is: "+ball.getY());
        ball.setX(random.nextFloat());
        ball.setY(random.nextFloat());
        ball.setxDelta(random.nextFloat());
        ball.setyDelta(random.nextFloat());
        ball.setRadius(random.nextInt());
        System.out.println(ball);
        ball.reflectVertical();
        System.out.println(ball);
    }
}
