package org.teachingkidsprogramming.section01forloops;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;
import org.teachingextensions.virtualproctor.VirtualProctor;

public class SquareToIncreasingThickHexagonMultiColor
{
  //--Kara Question--
  //How would you make a equalteral hexagon...
  // With 20 pixle thick lines
  // And multi-colored lines
  //write out the steps in english
  //then translate it to code
  //Make a run after
  public static void main(String[] args) throws Exception
  {
    VirtualProctor.setClassName("Palm Digital");
    VirtualProctor.setName("Dominic and Isaiah");
    Tortoise.setPenWidth(20);
    Tortoise.show();
    Tortoise.setSpeed(10);
    int length = 25;
    int sides = 6;
    for (int i = 0; i < sides; i++)
    {
      Tortoise.setPenColor(PenColors.getRandomColor());
      Tortoise.move(length);
      length = length * 2
      Tortoise.turn(360 / sides);
    }
  }
}
