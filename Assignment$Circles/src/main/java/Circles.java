
import processing.core.PApplet;

public class Circles extends PApplet{

    public static final int WIDTH = 1000;
    public static final int HEIGHT = 800;
    public static final int C = 10;
    public static final int D = 10;
    public static int xPosition0=0,xSpeed0=1;
    public static int xPosition1=0,xSpeed1=2;
    public static int xPosition2=0,xSpeed2=3;
    public static int xPosition3=0,xSpeed3=4;


    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {

        ellipse(xPosition0,height/5,C,D);
        xPosition0+=xSpeed0;

        ellipse(xPosition1,2*height/5,C,D);
        xPosition1+=xSpeed1;

        ellipse(xPosition2,3*height/5,C,D);
        xPosition2+=xSpeed2;

        ellipse(xPosition3,4*height/5,C,D);
        xPosition3+=xSpeed3;

    }

    public static void main(String[] args) {
        PApplet.main("Circles");
    }
}
