package org.usfirst.frc.team4015.robot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team4015.robot.OI;
import org.usfirst.frc.team4015.robot.Robot;

/* ===================================================
 * This command drives the robot with one or two 
 * joysticks on a tank drive chassis.  Mecanum to 
 * come soon.....
 * =================================================*/

public class Drive extends Command
{
	public Drive()
	{
		// Use requires() here to declare subsystem dependencies
		requires(Robot.drivetrain);
	}

	// Called just before this Command runs the first time
	@Override
	protected void initialize()
	{
		
	}

	// Called repeatedly when this Command is scheduled to run
	@Override
	protected void execute()
	{
		// DUAL STICK (left stick ---> throttle, right stick ---> turning) //
		Robot.drivetrain.tankDrive(OI.leftStick.getY(), OI.rightStick.getX());
		
		// SINGLE STICK (left stick) //
		// Robot.drivetrain.tankDrive(OI.leftStick.getY(), OI.leftStick.getX());
		
		// for mecanum drive, invoke mecanum drive methods here
		
		Timer.delay(0.05);  // motor update time
		
		// If throttle or steering is inverted, multiply X and Y values by -1
	}

	// Make this return true when this Command no longer needs to run execute()
	@Override
	protected boolean isFinished()
	{
		return false;
	}

	// Called once after isFinished returns true
	@Override
	protected void end()
	{
		Robot.drivetrain.stop();
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	@Override
	protected void interrupted()
	{
		Robot.drivetrain.stop();
	}
}
