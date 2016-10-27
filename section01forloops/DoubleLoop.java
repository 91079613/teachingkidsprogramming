package org.teachingkidsprogramming.section01forloops;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.ColorWheel;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;

public class DoubleLoop
{
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.moveTo(225, 150);
    Tortoise.setSpeed(10);
    //  
    ColorWheel.addColor(PenColors.Reds.Crimson);
    ColorWheel.addColor(PenColors.Reds.DarkRed);
    ColorWheel.addColor(PenColors.Reds.FireBrick);
    for (int i = 0; i < 6; i++)
    {
      Tortoise.turn(360 / 6);
      Tortoise.move(i * 5);
      Tortoise.turn(360 / 5);
      Tortoise.setPenColor(ColorWheel.getNextColor());
    }
    // 
    for (int j = 0; j < 15; j++)
    {
      Tortoise.move(j * 8);
      Tortoise.setPenWidth(17);
    }
    //              Set the pen width of the line the tortoise draws to 17 --#9
    //  
    //    Hide the Tortoise --#10
    Tortoise.getBackgroundWindow().setBackground(PenColors.Yellows.PeachPuff);
    //    Set the tortoise x position to 300 --#15.1
    //    Set the tortoise y position to 200 --#15.2
    //    Do the following 5 times --#12.1
    //        Change the pen color of the line the tortoise draws to black --#14 
    //        Move the Tortoise 25 pixels --#11
    //        Turn the tortoise 1/5 of 360 degrees to the right --#13  
    //    Repeat --#12.2
    //  
  }
}
