package org.usfirst.frc.team4015.robot;

import edu.wpi.first.wpilibj.Joystick;
import org.usfirst.frc.team4015.robot.RobotMap;

/* =============================================================================
 * This class stores the objects that are used to interface with the joysticks
 * and controllers used for controlling the robot.
 * ============================================================================*/
public class OI
{
	// CREATING BUTTONS //
	// One type of button is a joystick button which is any button on a
	// joystick.
	// You create one by telling it which joystick it's on and which button
	// number it is.
	// Joystick stick = new Joystick(port);
	// Button button = new JoystickButton(stick, buttonNumber);

	// There are a few additional built in buttons you can use. Additionally,
	// by subclassing Button you can create custom triggers and bind those to
	// commands the same as any other Button.

	// TRIGGERING COMMANDS WITH BUTTONS
	// Once you have a button, it's trivial to bind it to a button in one of
	// three ways:

	// Start the command when the button is pressed and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenPressed(new ExampleCommand());

	// Run the command while the button is being held down and interrupt it once
	// the button is released.
	// button.whileHeld(new ExampleCommand());

	// Start the command when the button isJoy released and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenReleased(new ExampleCommand());
	
	public static Joystick leftStick = new Joystick(RobotMap.leftStickPort);
	public static Joystick rightStick = new Joystick(RobotMap.rightStickPort);
	public static Joystick gamepad = new Joystick(RobotMap.gamepadPort);
}
