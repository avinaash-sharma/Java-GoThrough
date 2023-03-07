public class ClassesAndObjects {
    public static void main(String[] args) {
        Ball.spinAndBounce();
    }
}

class Ball {
    public  String state;


    public void bounce() {
        state = "bouncing";
        System.out.println("Ball is bouncing");
    }

    public void spin() {
        state = "spinning";
        System.out.println("Ball is spinning");
    }

    public static void spinAndBounce() {
        Ball ball=new Ball();
        ball.spin();
        ball.bounce();
    }
}