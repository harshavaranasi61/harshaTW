import processing.core.PApplet;

public class circlesOOPS extends PApplet {

    public static final int D = 10;
    public static final int C = 10;
    public static final int HEIGHT = 800;
    public static final int WIDTH = 1000;

    Circle circle0;
    Circle circle1;
    Circle circle2;
    Circle circle3;


    public class Circle {

        private int xPosition;
        private final int yPosition;
        private final int speed;

        public Circle(int xPosition, int yPosition, int speed) {
            this.xPosition = xPosition;
            this.yPosition = yPosition;
            this.speed = speed;
        }

        void drawCircle() {
            ellipse(this.xPosition, this.yPosition, C, D);
            this.increaseSpeed();
        }

        void increaseSpeed() {
            this.xPosition += this.speed;
        }

    }

    public static void main(String[] args) {
        PApplet.main("circlesOOPS");
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        super.setup();
        circle0 = new Circle(0, HEIGHT / 5, 1);
        circle1 = new Circle(0, 2 * HEIGHT / 5, 2);
        circle2 = new Circle(0, 3 * HEIGHT / 5, 3);
        circle3 = new Circle(0, 4 * HEIGHT / 5, 4);
    }

    @Override
    public void draw() {
        circle0.drawCircle();
        circle1.drawCircle();
        circle2.drawCircle();
        circle3.drawCircle();
    }
}
