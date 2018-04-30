package org.usfirst.frc.team4015.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Compressor;

/* ===================================================
 * This class contains the methods/objects required to 
 * control the compressor and piston(s).
 * =================================================*/

public class Pneumatics extends Subsystem
{
	public Compressor compressor;
	
	// CONSTRUCTOR //
	
	public Pneumatics()
	{
		compressor = new Compressor();
		
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