package org.usfirst.frc.team4015.robot.subsystems;

import org.usfirst.frc.team4015.robot.RobotMap;
import org.usfirst.frc.team4015.robot.subsystems.pneumaticsControl.Piston;

import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc.team4015.robot.RobotMap;
import org.usfirst.frc.team4015.robot.subsystems.pneumaticsControl.Piston;

/* ===================================================
 * This is an example of a subsystem that uses a piston
 * =================================================*/

public class PistonMechanism extends Subsystem
{
	// Add pistons here
	// Piston "piston name";
	
	public Piston piston;
	
	public PistonMechanism()
	{
		// Add pistons here
		// "piston name" = new Piston(leftChannel, rightChannel)
		
		piston = new Piston(RobotMap.pistonLeftChannel, RobotMap.pistonRightChannel);
	}
	
	
	
	public void initDefaultCommand()
	{
		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());
	}
}
