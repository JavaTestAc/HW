package basictypes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by AG on 24.09.2016.
 */
public class Circle {

    public static void main(String[] args) {

        try{

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            final double p = Math.PI;
            System.out.print("Enter outer radius of circle: ");
            double outerradius = Double.parseDouble(reader.readLine());
            System.out.print("Enter internal radius of circle: ");
            double internalradius = Double.parseDouble(reader.readLine());

            if (outerradius <= 0.0 || internalradius <= 0.0 || internalradius > outerradius){

                System.out.println("Number must be positive!");

                System.exit(1);
            }

            double lenght = 2 * p * outerradius;
            double  squareofcircle = p * outerradius * outerradius;
            double squareofring = p * ((outerradius * outerradius) - (internalradius * internalradius));
            System.out.println("Lenght of circle: " + lenght);
            System.out.println("Square of circle: " + squareofcircle);
            System.out.println("Square of ring: " + squareofring);

        } catch (IOException e){

            System.out.print(e.getMessage());
        } catch (NumberFormatException e) {

            System.out.print("Please, enter a number");
        }

    }

}
