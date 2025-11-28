package org.firstinspires.ftc.teamcode.pedroPathing;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp(name = "Test", group= "Linear OpMode")
public class Test extends LinearOpMode {
    DcMotor motor;
    Servo servo;
    @Override
    public void runOpMode(){
//        motor = hardwareMap.get(DcMotor.class, "test_motor");
//        servo = hardwareMap.get(Servo.class, "test_servo");
//        waitForStart();
//        while(opModeIsActive()) {
//            if (gamepad1.dpad_down) {
//                motor.setPower(0.5);
//                servo.setPosition(0.5);
//            } else if (gamepad1.dpad_up) {
//                motor.setPower(-0.5);
//                servo.setPosition(0);
//            } else{
//                motor.setPower(0);
//            }
//            // This makes the motor position show up on the screen (driver station)
//            telemetry.addLine(String.valueOf(motor.getCurrentPosition()));
//            telemetry.update();
//        }
    }
}