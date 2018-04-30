package org.usfirst.frc.team4015.robot.subsystems;

import org.usfirst.frc.team4015.robot.RobotMap;
import org.usfirst.frc.team4015.robot.subsystems.pneumaticsControl.Piston;

import edu.wpi.first.wpilibj.command.Subsystem;

/* ===================================================
 * This is a template class for creating new subsystems.
 * =================================================*/

public class PistonMechanism extends Subsystem
{
	// Add pistons here
	// Piston "piston name";
	
	public Piston piston;
	
	// CONSTRUCTOR //
	
	public PistonMechanism()
	{
		// Add pistons here
		// "piston name" = new Piston(leftChannel, rightChannel)
		
		piston = new Piston(RobotMap.pistonLeftChannel, RobotMap.pistonRightChannel);
	}
	
	// EXTEND //
	
	public void extend()
	{
		piston.extend();
	}
	
	// RETRACT //
	
	public void retract()
	{
		piston.retract();
	}
	
	// TOGGLE //
	
	public void toggle()
	{
		piston.toggle();
	}

	public void initDefaultCommand()
	{
		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());
	}
}
