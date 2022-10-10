/** Random DryIce DestroyTick

 * created to get an own random count between
 * a range of 'timeMinVal' and #timeMaxVal'
 * for the BlockDestroying of the DryIce-Blocks

 * Date: 2022/09/06
 * Author: DancerVlt69
 * Credits: []
 * Copyright: CC BY-SA 4.0

 */

package net.dancervlt69.slabsnstairs.core;

public class RndTicks {

    public int DryIceDestroyTick() {

        int timeMinVal = 25;
        int timeMaxVal = 250;

        int DryIceDestroyTickValue = new RndTicks().DryIceDestroyTick(timeMinVal, timeMaxVal);

        return (DryIceDestroyTickValue);
    }
    public int DryIceDestroyTick(int timeMinVal, int timeMaxVal) {

        /** check for valid values */
        if (timeMinVal <= 20) {timeMinVal = 20;}
        if (timeMaxVal > 250) {timeMaxVal = 250;}

        int rndTickValue = (int) (Math.random() * (timeMaxVal - timeMinVal)) + timeMinVal;
        // int rndTickValue2 = (int) (Math.random() * (timeMaxVal - timeMinVal)) + timeMinVal;

            //  printOut(rndTickValue);
            System.out.println("> Debug: " + rndTickValue);

        return (rndTickValue);
    }



}
