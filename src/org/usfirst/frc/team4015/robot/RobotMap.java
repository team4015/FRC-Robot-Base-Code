package org.usfirst.frc.team4015.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap
{
	// For example to map the left and right motors, you could define the
	// following variables to use with your drivetrain subsystem.
	// public static int leftMotor = 1;
	// public static int rightMotor = 2;

	// If you are using multiple modules, make sure to define both the port
	// number and the module. For example you with a rangefinder:
	// public static int rangefinderPort = 1;
	// public static int rangefinderModule = 1;
	
	// JOYSTICK / GAMEPAD CONTROLLER USB PORTS //
	
	public static final int leftStickPort = 0;
	public static final int rightStickPort = 1;
	public static final int gamepadPort = 2;
	
	// MECANUM CONFIG //
	
	public static final int frontLeftMotor = 0;
	public static final int backLeftMotor = 1;
	public static final int frontRightMotor = 2;
	public static final int backRightMotor = 3;
	
	// TANK CONFIG //
	
	public static final int leftMotors = 0;
	public static final int rightMotors = 1;
	
	// PNEUMATICS PISTON CHANNELS //
	
	// Add channels here
	
}
