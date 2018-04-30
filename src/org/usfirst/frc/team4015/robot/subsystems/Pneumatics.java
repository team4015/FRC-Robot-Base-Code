package org.usfirst.frc.team4015.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc.team4015.robot.RobotMap;
import org.usfirst.frc.team4015.robot.subsystems.pneumaticsControl.Piston;
import edu.wpi.first.wpilibj.Compressor;

/* ===================================================
 * This class contains the methods/objects required to 
 * control the compressor and piston(s).
 * =================================================*/

public class Pneumatics extends Subsystem
{
	public Compressor compressor;
	
	// Add pistons here
	// Piston "piston name";
	
	public Piston piston;
	
	// CONSTRUCTOR //
	
	public Pneumatics()
	{
		compressor = new Compressor();
		
		// Add pistons here
		// "piston name" = new Piston(leftChannel, rightChannel)
		
		piston = new Piston(RobotMap.pistonLeftChannel, RobotMap.pistonRightChannel);
		
		// Compressor automatic refill
		// (when pressure is below switch threshold)
		compressor.setClosedLoopControl(true);
	}
	
	// TOGGLE COMPRESSOR //
	
	public void toggleCompressor()
    {
	    if (compressor.enabled() == false)
	    {
	    	compressor.setClosedLoopControl(true);
	    }
	    else
	    {
	    	compressor.setClosedLoopControl(false);
	    	compressor.stop();
	    }
    }
	
	// TOGGLE COMPRESSOR AUTO REFILL //
	
	public void toggleCompressorAutoRefill()
    {
    	if (compressor.getClosedLoopControl() == true)
    	{
    		compressor.setClosedLoopControl(false);
    	}
    	else
    	{
    		compressor.setClosedLoopControl(true);
    	}
    }

	public void initDefaultCommand()
	{
		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());
	}
}