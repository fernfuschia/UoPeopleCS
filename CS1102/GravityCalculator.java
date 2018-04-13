/*
 * CS1102 - UoPeople Assignment
 * 14/04/2018
 *
 * In this assignment, I created a program that computes the distance an object will fall in Earth's gravity.
 * The program was modified to calculate the final position of the object using the math formula: x(t) = 0.5at^2 + vit + xi
 * 
 */
package gravitycalculator;

/**
 *
 * @author fernfuschia
 */
  	import java.io.*;

public class GravityCalculator {

	public static void main(String[] arguments){

		double  gravity =-9.81; // Earth's gravity in m/s^2

		double  initialVelocity = 0.0; // starting velocity of the object

		double  fallingTime = 10.0; // time in seconds that the object falls

		double  initialPosition = 1000.0; // Starting position in meters, the calculation will determine the ending position in meters
		
                /* The final position as calculated using x(t) = 0.5at^2 + vit + xi.
                The system will calculate the final position using the values input.
                */
                double  finalPosition =  (0.5*gravity*(fallingTime*fallingTime)) + (initialVelocity*fallingTime) + initialPosition;
                

                

		System.out.println("The object's position after " + fallingTime +" seconds is ..."+finalPosition + " m.");

	}
}
