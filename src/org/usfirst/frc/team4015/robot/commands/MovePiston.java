package org.usfirst.frc.team4015.robot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team4015.robot.OI;
import org.usfirst.frc.team4015.robot.Robot;

/* ===================================================
 * This command moves the piston up and down when button
 * 4 on the Attack 3 stick is pressed.
 * =================================================*/

public class MovePiston extends Command
{
	public MovePiston()
	{
		// Use requires() here to declare subsystem dependencies
		requires(Robot.pistonMechanism);
	}

	// Called just before this Command runs the first time
	@Override
	protected void initialize()
	{
		// Default / starting position
		Robot.pistonMechanism.piston.retract();
	}

	// Called repeatedly when this Command is scheduled to run
	@Override
	protected void execute()
	{
		if (OI.leftStick.getRawButton(4) == true)
		{
			Robot.pistonMechanism.piston.toggle();
			Timer.delay(1);
		}
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
		
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	@Override
	protected void interrupted()
	{
		
	}
}
