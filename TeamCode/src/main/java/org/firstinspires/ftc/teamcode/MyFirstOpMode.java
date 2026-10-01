package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

//@TeleOp()
@Autonomous()
public class MyFirstOpMode extends OpMode{
    @Override
    public void init() {
        telemetry.addData("Hello","Denis");
    }

    @Override
    public void loop() {

    }
}
