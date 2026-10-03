package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp()
public class GamepadOpMode extends OpMode {
    @Override
    public  void init(){

    }

    @Override
    public void loop(){
        telemetry.addData("Left stick x", gamepad1.left_stick_x);
        telemetry.addData("Left stick y", gamepad1.left_stick_y);
        telemetry.addData("A button", gamepad1.a);

        double speedForward = -gamepad1.left_stick_y / 2.0;
        telemetry.addData("Left stick y", gamepad1.left_stick_y);
        telemetry.addData("Speed Forward", speedForward);

        ///project exercises
        telemetry.addData("Right stick x", gamepad1.left_stick_x);
        telemetry.addData("B button", gamepad1.b);

        double differenceDirectionY = gamepad1.left_stick_y - gamepad1.right_stick_y;
        telemetry.addData("Difference between left and right y", differenceDirectionY);

        double sumTriggers = gamepad1.right_trigger + gamepad1.left_trigger;
        telemetry.addData("The sum of the triggers", sumTriggers);
    }
}
