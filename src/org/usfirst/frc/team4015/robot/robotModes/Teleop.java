package org.usfirst.frc.team4015.robot.robotModes;

import org.usfirst.frc.team4015.robot.commands.Drive;
import org.usfirst.frc.team4015.robot.commands.MovePiston;
import org.usfirst.frc.team4015.robot.commands.ToggleCompressor;
// import other teleop commands here (pneumatics stuff, etc)

import edu.wpi.first.wpilibj.command.CommandGroup;

public class Teleop extends CommandGroup
{
	// CONSTRUCTOR //
	
	public  Teleop()
	{
        // Add Commands here:
        // e.g. addSequential(new Command1());
        //      addSequential(new Command2());
        // these will run in order.

        // To run multiple commands at the same time,
        // use addParallel()
        // e.g. addParallel(new Command1());
        //      addSequential(new Command2());
        // Command1 and Command2 will run in parallel.

        // A command group will require all of the subsystems that each member
        // would require.
        // e.g. if Command1 requires chassis, and Command2 requires arm,
        // a CommandGroup containing them would require both the chassis and the
        // arm.
    	
    	addParallel(new Drive());
    	addParallel(new MovePiston());
    	
    	// Uncomment for manual compressor control
    	// addParallel(new ToggleCompressor());
    	
    	// Add Pneumatics and other commands here, e.g. "ramp" from steamworks robot
    }
	
}
