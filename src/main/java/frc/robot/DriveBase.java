/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

import com.ctre.phoenix.motorcontrol.*;


/**
 * Add your docs here.
 */
public class Drivebase {
    TalonSRX RF;
    TalonSRX RB;
    TalonSRX LF;
    TalonSRX LB;
    DifferentialDrive Drive;
    double navXYaw;
    SpeedControllerGroup LeftControllerGroup;
    SpeedControllerGroup RightControllerGroup;
    
    public Drivebase(){
    
        RF = new TalonSRX(RobotMap.Right_Forward);
        LF = new TalonSRX(RobotMap.Left_Forward);
        RB = new TalonSRX(RobotMap.Right_Back);
        LB = new TalonSRX(RobotMap.Left_Back);




        LeftControllerGroup = new SpeedControllerGroup(RF, RB);








        drivebase = new RobotDrive(RF, LF, RB, LB);
        drivebase.setInvertedMotor(RobotDrive.MotorType.KFrontLeft, RobotMap.FRONT_LEFT_INV);          
        drivebase.setInvertedMotor(RobotDrive.MotorType.KFrontLeft, RobotMap.FRONT_RIGHT_INV);
        drivebase.setInvertedMotor(RobotDrive.MotorType.KFrontLeft, RobotMap._RIGHT_BACK_INV);
        drivebase.setInvertedMotor(RobotDrive.MotorType.KFrontLeft, RobotMap.BACK_LEFT_INV);
        drivebase.setSafetyEnabled(true);
        drivebase.setInvertedMotor(RobotDrive)
        
    }
    public void drive(double left, double right){
        drivebase.tankDrive(left, right);
    }
    public void zeroEncoders(){
        
    }


    
}

