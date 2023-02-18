/* ==================================================
 * Authors:
 *
 * --------------------------------------------------
 * Description:
 *
 * Use this class as a template for command code.
 * ================================================== */

package frc.robot.commands;

import static frc.robot.Match.robot;
import static frc.robot.Match.driver;
import static frc.robot.Match.operator;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class ExampleCommand extends CommandBase
{
  @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})

  // CONSTANTS //

  // Declare all constant variables here.

  // VARIABLES //

  // Declare all non-constant variables here.

  // CONSTRUCTOR //

  public ExampleCommand()
  {
    // Use addRequirements(robot.subsystem) here to declare subsystem dependencies:
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {}

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished()
  {
    /* Default commands must return false since they are always running.
     * All other commands should eventually return true when they are finished running.
     * When a non-default command is scheduled, the robot will interrupt the default command,
     * run the new command code, and then continue running the default command. */

    return false;
  }
}
