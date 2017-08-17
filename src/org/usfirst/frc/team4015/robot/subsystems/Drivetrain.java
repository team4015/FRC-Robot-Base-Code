package org.usfirst.frc.team4015.robot.subsystems;

import org.usfirst.frc.team4015.robot.RobotMap;
import org.usfirst.frc.team4015.robot.commands.Drive;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Drivetrain extends Subsystem
{	
	public Talon frontLeft;
	public Talon frontRight;
	public Talon backLeft;
	public Talon backRight;
	
	public RobotDrive chassis;
	
	// DEFAULT CONSTRUCTOR //
	
	public Drivetrain()
	{
		
	}
	
	// CREATE TANK DRIVE CHASSIS //
	
	public void newTankDrive()
	{
		frontLeft = new Talon(RobotMap.leftMotors);
		frontRight = new Talon(RobotMap.rightMotors);	
		chassis = new RobotDrive(frontLeft, frontRight);
	}
	
	// CREATE MECANUM DRIVE CHASSIS //
	
	public void newMecanumDrive()
	{
		frontLeft = new Talon(RobotMap.frontLeftMotor);
		frontRight = new Talon(RobotMap.frontRightMotor);
		backLeft = new Talon(RobotMap.backLeftMotor);
		backRight = new Talon(RobotMap.backRightMotor);
		chassis = new RobotDrive(frontLeft, backLeft, frontRight, backRight);
	}
	
	/* =========== TANK DRIVE ===========
	 * throttle ---> move value (Y value)
	 * yaw ---> turn value (X value)
	 * ================================*/
	
	public void tankDrive(double throttle, double yaw)
	{
		chassis.arcadeDrive(throttle, yaw);
	}
	
	// TODO Mecanum Drive //
	
	// STOP //
	
	public void stop()
	{
		tankDrive(0, 0);
	}

	public void initDefaultCommand()
	{
		// Set the default command for a subsystem here.
		 setDefaultCommand(new Drive());
	}
}
