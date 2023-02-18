/* ==================================================
 * Authors:
 * FIRST
 * --------------------------------------------------
 * Description:
 * This is the main class that runs the robot code.
 * DO NOT MODIFY THIS FILE!
 * ================================================== */

package frc.robot;

import edu.wpi.first.wpilibj.RobotBase;

public final class Main
{
  private Main() {}

  public static void main(String... args)
  {
    RobotBase.startRobot(Match::new);
  }
}
