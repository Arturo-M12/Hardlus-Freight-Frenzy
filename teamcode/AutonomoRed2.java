package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.ElapsedTime;
import com.qualcomm.robotcore.util.Range;
import org.firstinspires.ftc.teamcode.robot.FTCRobot;

@Autonomous(name = "Autónomo Rojo Estacionarse Cuadrado", group = "Red Alliance")

public class AutonomoRed2 extends LinearOpMode {
    private FTCRobot robot;

    @Override
    public void runOpMode() {
        robot = new FTCRobot(this);
        robot.initializeMechanisms();
        telemetry.update();
        waitForStart();
        robot.chasis.turnLeft(90);
        robot.chasis.lateralMove(50);
        robot.chasis.moveForward(62);
    }
}
