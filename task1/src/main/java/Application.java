public class Application {
    public static void main(String args[]) {
        Christmastree tree = new Christmastree();
        Ball ball = new Ball();
        Bulb bulb = new Bulb();

        ball.setColor(Colors.BLUE);
        ball.setSize(Size.LARGE);

        bulb.setColor(Colors.GOLD);
        bulb.setSize(Size.SMALL);

        tree.setBall(ball);
        tree.setBulb(bulb);

        tree.run();
    }
}
