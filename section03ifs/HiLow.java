package org.teachingkidsprogramming.section03ifs;

import org.teachingextensions.approvals.lite.util.NumberUtils;
import org.teachingextensions.logo.Sound;
import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class HiLow
{
  public static void main(String[] args)
  {
    //    Choose a random number between 1 and 100 --#4.1 (fake!) & --#13
    int randomInt = NumberUtils.getRandomInt(1, 100);
    //    Do the following 8 times --#9.1
    MessageBox.askForNumericalInput("take a guess");
    //         If the guess is correct --#4
    if()
    {
      
    }
    Sound.playBeep();
    MessageBox.showMessage("You have won");
    //               and exit --#10
    //         Otherwise, if the guess is too high --#6
    //               Tell the end user that it is too high --#5
    MessageBox.showMessage("Too high :)");
    //         Otherwise, if the guess is too low --#8
    //               Tell the end user that it is too low --#7
    //    Repeat --#9.2
    //    After 8 incorrect guesses tell the user they've lost --#11
  }
}
