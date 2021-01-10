import processing.core.PApplet;

public class TryProcessing extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 25;

    public static final int SPEED_BALL1 = 1;
    public static final int SPEED_BALL2 = 2;
    public static final int SPEED_BALL3 = 3;
    public static final int SPEED_BALL4 = 4;

    private int xPosition_Ball1 = 0;
    private int xPosition_Ball2 = 0;
    private int xPosition_Ball3 = 0;
    private int xPosition_Ball4 = 0;

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
        drawCircle(xPosition_Ball1 += SPEED_BALL1, HEIGHT * 0.2f);
        drawCircle(xPosition_Ball2 += SPEED_BALL2, HEIGHT * 0.4f);
        drawCircle(xPosition_Ball3 += SPEED_BALL3, HEIGHT * 0.6f);
        drawCircle(xPosition_Ball4 += SPEED_BALL4, HEIGHT * 0.8f);
    }

    private void drawCircle(float xPosition, float yPosition) {
        ellipse(xPosition, yPosition, DIAMETER, DIAMETER);
    }
}
