package com.team9889.lib.control.MotionProfiling;

/**
 * @author joshua9889
 * @version 6.28.18
 *
 * Interface for motion profiles. Allows for the use of different types easily.
 */

public interface MotionProfile {

    /**
     * @param setpoint in units
     * @param max_v in units/sec
     * @param max_a in units/sec^2
     */
    void calculate(double setpoint, double max_v, double max_a);


    /**
     * @param t Current Time
     * @return  [position, velocity, acceleration]
     */
    double[] getOutput(double t);

    double getTotalTime();
}
