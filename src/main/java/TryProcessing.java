import processing.core.PApplet;

public class TryProcessing extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 25;
    public int xFirstBall = 0;
    public int xSecondBall = 0;
    public int xThirdBall = 0;
    public int xForthBall = 0;

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
        ellipse(xForthBall, HEIGHT * 0.8f, DIAMETER, DIAMETER);
        xForthBall += 4;
    }

    private void drawThirdBall() {
        fillYellowColor();
        ellipse(xThirdBall, HEIGHT * 0.6f, DIAMETER, DIAMETER);
        xThirdBall += 3;
    }

    private void drawSecondBall() {
        fillRedColor();
        ellipse(xSecondBall, HEIGHT * 0.4f, DIAMETER, DIAMETER);
        xSecondBall += 2;
    }

    private void drawFirstBall() {
        fillBlueColor();
        ellipse(xFirstBall, HEIGHT * 0.2f, DIAMETER, DIAMETER);
        xFirstBall++;
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
