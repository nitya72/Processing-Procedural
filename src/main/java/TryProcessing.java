import processing.core.PApplet;

public class TryProcessing extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 25;
    public int xOfFirstBall = 0;
    public int xOfSecondBall = 0;
    public int xOfThirdBall = 0;
    public int xOfForthBall = 0;

    public static void main(String[] args) {
        PApplet.main("TryProcessing", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        super.setup();
    }

    @Override
    public void draw() {
        drawFirstBall();
        drawSecondBall();
        drawThirdBall();
        drawForthBall();
    }

    private void drawForthBall() {
        fillPurpleColor();
        ellipse(xOfForthBall, HEIGHT * 0.8f, DIAMETER, DIAMETER);
        xOfForthBall += 4;
    }

    private void drawThirdBall() {
        fillYellowColor();
        ellipse(xOfThirdBall, HEIGHT * 0.6f, DIAMETER, DIAMETER);
        xOfThirdBall += 3;
    }

    private void drawSecondBall() {
        fillRedColor();
        ellipse(xOfSecondBall, HEIGHT * 0.4f, DIAMETER, DIAMETER);
        xOfSecondBall += 2;
    }

    private void drawFirstBall() {
        fillBlueColor();
        ellipse(xOfFirstBall, HEIGHT * 0.2f, DIAMETER, DIAMETER);
        xOfFirstBall++;
    }

    private void fillRedColor() {
        fill(255, 0, 0);
    }

    private void fillYellowColor() {
        fill(255, 255, 0);
    }

    private void fillPurpleColor() {
        fill(128, 0, 128);
    }

    private void fillBlueColor() {
        fill(0, 0, 255);
    }
}
