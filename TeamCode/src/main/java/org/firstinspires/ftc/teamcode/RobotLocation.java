package org.firstinspires.ftc.teamcode;

public class RobotLocation {
    double angle;
    double x,y;
    public RobotLocation(double angle,double x){
        this.angle = angle;
        this.x = x;
    }


    ///This is a public class method that returns the heading (so it needs to be
    /// within -180 and 180)
    public double getHeading(){
        double angle = this.angle;
        while (angle > 180){
            angle -= 360;
        }
        while (angle < - 180){
            angle += 360;
        }
        return angle;
    }

    @Override
    public String toString(){
        return "RobotLocation: angle (" + angle + ")";
    }

    public double getAngle() {
        return angle;
    }

    public void turn(double angleChange){
        angle += angleChange;
    }
    public void setAngle(double angle){
        this.angle = angle;
    }

    public double getX() {
        return x;
    }
    public void setX(double x){
        this.x = x;
    }

    void changeX(double change){
        x += change;
    }
    public double getY() {
        return y;
    }
    void changeY(double change){
        this.y += change;
    }

    public void setY(double y) {
        this.y = y;
    }
}
