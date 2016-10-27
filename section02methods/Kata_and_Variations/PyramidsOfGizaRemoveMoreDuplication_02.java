package org.teachingkidsprogramming.section02methods.Kata_and_Variations;

import org.teachingextensions.logo.Tortoise;

//-----------Kata Questions----------//
// Where do you see duplicates line of code?
//   and how can you refactor to make this code more readable?
// write out the steps in English
// then translate the steps into code
// make sure to run after each line
//

import org.teachingextensions.logo.utils.ColorUtils.PenColors;

public class PyramidsOfGizaRemoveMoreDuplication_02
{
  public static void main(String[] args) throws Exception
  {
    setUpPyramidLand();
    Tortoise.turn(-90);
    Tortoise.move(220);
    Tortoise.turn(135);//!!!
    Tortoise.move(100);//!!!
    MoveUp();
    moveDown();
    MoveUp();
    moveDown();
    MoveUp();
    Tortoise.turn(135);
    Tortoise.move(210);
  }
  private static void MoveUp()
  {
    //Look for lines of code
    //Refactor any Duplications of code
    Tortoise.turn(90);//!!!
    Tortoise.move(100);//!!!
  }
  private static void moveDown()
  {
    // move the tortoise down
    // extract a method and name it moveDown()
    Tortoise.turn(-90);//!!!
    Tortoise.move(100);//!!!
  }
  private static void setUpPyramidLand()
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    Tortoise.getBackgroundWindow().setBackground(PenColors.Blues.AliceBlue);
    Tortoise.setPenColor(PenColors.Yellows.DarkGoldenrod);
    Tortoise.setPenWidth(2);
    Tortoise.hide();
  }
}
