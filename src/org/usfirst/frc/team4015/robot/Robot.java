package org.usfirst.frc.team4015.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import org.usfirst.frc.team4015.robot.commands.ExampleCommand;

// SUBSYSTEM IMPORTS //

import org.usfirst.frc.team4015.robot.subsystems.Drivetrain;
import org.usfirst.frc.team4015.robot.subsystems.Pneumatics;

// ROBOT MODES (COMMAND GROUP) IMPORTS //

import org.usfirst.frc.team4015.robot.robotModes.Teleop;
import org.usfirst.frc.team4015.robot.robotModes.Auto;

/* =============================================================================
 * The RoboRIO will automatically run the methods in this class depending on
 * which part of the match is being played.
 * ============================================================================*/

public class Robot extends IterativeRobot
{
	// SUBSYSTEM DECLARATION //
	
	public static Drivetrain drivetrain;
	public static Pneumatics pneumatics;
	
	// DECLARE ROBOT MODES (COMMAND GROUPS) //
	
	Command teleop;
	Command auto;
	
	SendableChooser<Command> chooser = new SendableChooser<>();

	/* ===================================
	 * This function is run when the robot 
	 * is first started up and should be
	 * used for any initialization code.
	 * ==================================*/
	
	@Override
	public void robotInit()
	{
		// SUBSYSTEM INSTANTIATION //
		
		// Create tank Drivetrain
		
		drivetrain = new Drivetrain();
		drivetrain.newTankDrive();
		
		// Create Pnuematics
		
		pneumatics = new Pneumatics();
		
		// INSTANTIATE ROBOT MODES (COMMAND GROUPS) //
		
		teleop = new Teleop();
		auto = new Auto();
		
		/*
		chooser.addDefault("Default Auto", new ExampleCommand());
		chooser.addObject("My Auto", new MyAutoCommand());
		SmartDashboard.putData("Auto mode", chooser);
		*/
	}

	/* =================================================
	 * This function is called once each time the robot 
	 * enters Disabled mode. You can use it to reset any 
	 * subsystem information you want to clear when the 
	 * robot is disabled.
	 * ================================================*/
	
	@Override
	public void disabledInit()
	{

	}

	@Override
	public void disabledPeriodic()
	{
		// Run Scheduler to manage Commands / CommandGroups
		Scheduler.getInstance().run();
	}

	/* =========================================================================
	 * This autonomous (along with the chooser code above) shows how to select
	 * between different autonomous modes using the dashboard. The sendable
	 * chooser code works with the Java SmartDashboard. If you prefer the
	 * LabVIEW Dashboard, remove all of the chooser code and uncomment the
	 * getString code to get the auto name from the text box below the Gyro
	 *
	 * You can add additional auto modes by adding additional commands to the
	 * chooser code above (like the commented example) or additional comparisons
	 * to the switch structure below with additional strings & commands.
	 * ========================================================================*/
	
	@Override
	public void autonomousInit()
	{
		/*
		autonomousCommand = chooser.getSelected();
		
		String autoSelected = SmartDashboard.getString("Auto Selector", "Default");
		 
		 switch (autoSelected)
		 {
		 	case "My Auto":
		 		autonomousCommand = new MyAutoCommand();
		 		break;
		 		
		 	case "Default Auto":
		 		
		 	default:
		 		autonomousCommand = new ExampleCommand();
		 		break;
		 }
		 */

		// START AUTONOMOUS COMMAND GROUP //
		
		if (auto != null)
		{
			auto.start();
		}
	}

	/* ======================================================
	 * This function is called periodically during autonomous
	 * =====================================================*/
	
	@Override
	public void autonomousPeriodic()
	{
		// Run Scheduler to manage Commands / CommandGroups
		Scheduler.getInstance().run();
	}

	@Override
	public void teleopInit()
	{
		/* This makes sure that the autonomous stops
		 * running when teleop starts running. If you
		 * want the autonomous to continue until 
		 * interrupted by another command, remove 
		 * this line or comment it out.
		 */
		
		// STOP AUTONOMOUS COMMAND GROUP //
		
		if (auto != null)
		{
			auto.cancel();
		}
		
		// START TELEOP COMMAND GROUP //
		
		if (teleop != null)
		{
			teleop.start();
		}
	}

	/* ===================================================
	 * This function is called periodically during teleop
	 * ==================================================*/
	
	@Override
	public void teleopPeriodic()
	{
		// Run Scheduler to manage Commands / CommandGroups
		Scheduler.getInstance().run();
	}

	/* =====================================================
	 * This function is called periodically during test mode
	 * ====================================================*/
	@Override
	public void testPeriodic()
	{
		LiveWindow.run();
	}
}
