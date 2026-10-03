package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;

@TeleOp
public class UseRobotLocationOpMode extends OpMode{
    RobotLocation robotLocation = new RobotLocation(0,1);

    public void init(){
        robotLocation.setAngle(0);
    }


    public void loop(){
        if(gamepad1.a){
            robotLocation.turn(0.1);
        }
        else if(gamepad1.b){
            robotLocation.turn(-0.1);
        }
        telemetry.addData("Location", robotLocation);
        telemetry.addData("Heading", robotLocation.getHeading());
        telemetry.addData("Angle", robotLocation.getAngle());

        if(gamepad1.dpad_left){
            robotLocation.changeX(-0.1);
        }
        else if(gamepad1.dpad_right) {
            robotLocation.changeX(0.1);
        }

        if(gamepad1.dpad_up){
            robotLocation.changeY(0.1);
        }
        else if(gamepad1.dpad_down) {
            robotLocation.changeY(-0.1);
        }
    }
}
