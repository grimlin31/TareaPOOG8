public class State {
    private double positionX;
    private double positionY;
    private double direction;

    State(double x, double y, double theta) {
        this.positionX = x;
        this.positionY = y;
        this.direction = theta;
    }
}