import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import java.util.Vector;

import javax.swing.Timer;


public class Animation implements Runnable
{
  private static Timer timer;
  public static int nextTimeStamp;
  private static long startTime;
  // private static int arrowcnt;

  private static int gridNum;
  private static int lastgridNum;
  private static String lastColor;
  private static String lastDir;

  private Random rand = new Random();
  public static Arrow arrow;

  public void run()
  {
    // While the timeStamp vector isnt empty
    arrow = new Arrow("", 0);
    ActionListener a = new ActionListener()
    {
      // arrow.randomGenerator();
      // arrowColor = arrow.getColor();
      // arrowSize = arrow.getSize();
      public void actionPerformed(ActionEvent evt)
      {
        gridNum = arrow.getgrid();
        // System.out.println(gridNum);
        if( lastDir == "right" )
        {
          if( lastColor == "green" )
          {
            if( lastgridNum == 0 )
            {
              Game.rightgreen1.setVisible(false);
            }
            else if( lastgridNum == 1 )
            {
              Game.rightgreen2.setVisible(false);
            }
            else if( lastgridNum == 2 )
            {
              Game.rightgreen3.setVisible(false);
            }
            else
            {
              Game.rightgreen4.setVisible(false);
            }
          }
          else if( lastColor == "red" )
          {
            if( lastgridNum == 0 )
            {
              Game.rightred1.setVisible(false);
            }
            else if( lastgridNum == 1 )
            {
              Game.rightred2.setVisible(false);
            }
            else if( lastgridNum == 2 )
            {
              Game.rightred3.setVisible(false);
            }
            else
            {
              Game.rightred4.setVisible(false);
            }
          }
          else
          {
            if( lastgridNum == 0 )
            {
              Game.rightyellow1.setVisible(false);
            }
            else if( lastgridNum == 1 )
            {
              Game.rightyellow2.setVisible(false);
            }
            else if( lastgridNum == 2 )
            {
              Game.rightyellow3.setVisible(false);
            }
            else
            {
              Game.rightyellow4.setVisible(false);
            }
          }
        }
        else
        {
          if( lastColor == "green" )
          {
            if( lastgridNum == 0 )
            {
              Game.leftgreen1.setVisible(false);
            }
            else if( lastgridNum == 1 )
            {
              Game.leftgreen2.setVisible(false);
            }
            else if( lastgridNum == 2 )
            {
              Game.leftgreen3.setVisible(false);
            }
            else
            {
              Game.leftgreen4.setVisible(false);
            }
          }
          else if( lastColor == "red" )
          {
            if( lastgridNum == 0 )
            {
              Game.leftred1.setVisible(false);
            }
            else if( lastgridNum == 1 )
            {
              Game.leftred2.setVisible(false);
            }
            else if( lastgridNum == 2 )
            {
              Game.leftred3.setVisible(false);
            }
            else
            {
              Game.leftred4.setVisible(false);
            }
          }
          else
          {
            if( lastgridNum == 0 )
            {
              Game.leftyellow1.setVisible(false);
            }
            else if( lastgridNum == 1 )
            {
              Game.leftyellow2.setVisible(false);
            }
            else if( lastgridNum == 2 )
            {
              Game.leftyellow3.setVisible(false);
            }
            else
            {
              Game.leftyellow4.setVisible(false);
            }
          }
        }

        if( arrow.getDir() == "right" )
        {
          if( arrow.getColor() == "green" )
          {
            if( gridNum == 0 )
            { // first grid
              Game.rightgreen1.setVisible(true);
            }
            else if( gridNum == 1 )
            { // second grid
              Game.rightgreen2.setVisible(true);
            }
            else if( gridNum == 2 )
            { // third grid
              Game.rightgreen3.setVisible(true);
            }
            else
            {
              Game.rightgreen4.setVisible(true);
            }
          }
          else if( arrow.getColor() == "red" )
          {
            if( gridNum == 0 )
            { // first grid
              Game.rightred1.setVisible(true);
            }
            else if( gridNum == 1 )
            { // second grid

              Game.rightred2.setVisible(true);

            }
            else if( gridNum == 2 )
            { // third grid

              Game.rightred3.setVisible(true);

            }
            else
            {

              Game.rightred4.setVisible(true);

            }
          }
          else
          {
            if( gridNum == 0 )
            { // first grid

              Game.rightyellow1.setVisible(true);

            }
            else if( gridNum == 1 )
            { // second grid

              Game.rightyellow2.setVisible(true);

            }
            else if( gridNum == 2 )
            { // third grid

              Game.rightyellow3.setVisible(true);

            }
            else
            {

              Game.rightyellow4.setVisible(true);
            }
          }
        }
        else
        { // Left Dir
          if( arrow.getColor() == "green" )
          {
            if( gridNum == 0 )
            { // first grid

              Game.leftgreen1.setVisible(true);

            }
            else if( gridNum == 1 )
            { // second grid

              Game.leftgreen2.setVisible(true);

            }
            else if( gridNum == 2 )
            { // third grid

              Game.leftgreen3.setVisible(true);

            }
            else
            {

              Game.leftgreen4.setVisible(true);

            }
          }
          else if( arrow.getColor() == "red" )
          {
            if( gridNum == 0 )
            { // first grid

              Game.leftred1.setVisible(true);

            }
            else if( gridNum == 1 )
            { // second grid

              Game.leftred2.setVisible(true);

            }
            else if( gridNum == 2 )
            { // third grid

              Game.leftred3.setVisible(true);

            }
            else
            {

              Game.leftred4.setVisible(true);

            }
          }
          else
          {
            if( gridNum == 0 )
            { // first grid

              Game.leftyellow1.setVisible(true);

            }
            else if( gridNum == 1 )
            { // second grid

              Game.leftyellow2.setVisible(true);

            }
            else if( gridNum == 2 )
            { // third grid

              Game.leftyellow3.setVisible(true);

            }
            else
            {

              Game.leftyellow4.setVisible(true);

            }
          }
        }

        timer.stop();
      }
    };


    startTime = System.currentTimeMillis();
    System.out.println("Animation Start!");
    int readCnt = 0; //avoid the first few beats;
    while( !Game.timeVector.isEmpty() )
    {
        lastColor = arrow.getColor();
        lastgridNum = arrow.getgrid();
        lastDir = arrow.getDir();
        arrow.randomGenerator();
        // System.out.println(arrow.getColor());
        nextTimeStamp = Game.timeVector.get(0); // get first element
        Game.timeVector.removeElementAt(0); // remove element off vector
      if(readCnt > 5)
      {
        // create a timer to execute an action at the next time
        int delay = (int) (long) (nextTimeStamp - (System.currentTimeMillis() - startTime)); // milliseconds
        timer = new Timer(delay, a);
        timer.start();
        while( timer.isRunning() )
        {
  
        }
      }
      readCnt++;
    }
  }
}
