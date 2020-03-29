public class circle {
    private double radius;
    private String color;
    private boolean filled;
    public circle(){
    }
    public circle(double radius, String color, boolean filled){
        this.radius =radius;
        this.color = color;
        this.filled = filled;
    }

    public circle(double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public double getRadius() {
        return radius;
    }

    public boolean isFilled() {
        return filled;
    }
}
