package com.epam.bakhanovich.jwd.model.service;

import com.epam.bakhanovich.jwd.model.pojos.Line;
import com.epam.bakhanovich.jwd.model.pojos.Point;
import com.epam.bakhanovich.jwd.model.pojos.Square;
import com.epam.bakhanovich.jwd.model.pojos.Triangle;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Checks figures.
 *
 * @author Ihar Bakhanovich
 */
public class CheckFigures {

    private static final Logger log = LogManager.getLogger(CheckFigures.class);

    // the constant to compare doubles
    private static final double EPSILON = 0.001;

    /**
     * Checks whether the {@link Line} is a geometrical line.
     *
     * @param line
     *        is the {@link Line} to check.
     * @return	true if the {@link Line} is a geometrical line.
     */
    public static boolean isLine(Line line) {
        if(line.getPointOne() == line.getPointTwo()) {
            log.error("the lane {} is not a line", line.toString());
            return false;
        }
        return true;
    }

    /**
     * Checks whether the {@link Triangle} is a geometrical triangle.
     *
     * @param triangle
     *        is the {@link Triangle} to check.
     * @return	true if the {@link Triangle} is a geometrical triangle.
     */
    public static boolean isTriangle(Triangle triangle) {
        double x1 = triangle.getPointOne().getCoordinateX();
        double x2 = triangle.getPointTwo().getCoordinateX();
        double x3 = triangle.getPointThree().getCoordinateX();
        double y1 = triangle.getPointOne().getCoordinateY();
        double y2 = triangle.getPointTwo().getCoordinateY();
        double y3 = triangle.getPointThree().getCoordinateY();
        if(((y1 - y2) * (x1 - x3) - (y1 - y3) * (x1 - x2)) < EPSILON) {
            log.error("the figure {} is not a triangle", triangle.toString());
            return false;
        }
        return true;
    }

    /**
     * Calculates the length of the line.
     *
     * @param pointOne
     *        is the first {@link Point} of the line.
     * @param pointTwo
     *        is the second {@link Point} of the line.
     * @return	the double, that is the value of the length.
     */
    public static double lendthOfTheLine(Point pointOne, Point pointTwo){
        double length;

        return Math.sqrt(Math.pow((pointTwo.getCoordinateX() - pointOne.getCoordinateX()),2)
                + Math.pow((pointTwo.getCoordinateY() - pointOne.getCoordinateY()),2));
    }

    /**
     * Checks whether a {@link Square} is an geometrical square.
     *
     * @param square
     *        is the {@link Square} to check.
     * @return	true if {@link Square} is an geometrical square.
     */
    public static boolean isSquare(Square square){

        double[] lengths = new double[6];
        lengths[0] = lendthOfTheLine(square.getPointOne(), square.getPointTwo());
        lengths[1] = lendthOfTheLine(square.getPointTwo(), square.getPointThree());
        lengths[2] = lendthOfTheLine(square.getPointThree(), square.getPointFour());
        lengths[3] = lendthOfTheLine(square.getPointFour(), square.getPointOne());
        lengths[4] = lendthOfTheLine(square.getPointOne(), square.getPointThree());
        lengths[5] = lendthOfTheLine(square.getPointTwo(), square.getPointFour());

        insertionSort(lengths);
        if ((lengths[0] - lengths[3]) < EPSILON
                && (lengths[4] - lengths[5]) < EPSILON
                && square.getPointOne() != square.getPointTwo()
                && square.getPointOne() != square.getPointThree()
                && square.getPointOne() != square.getPointFour()
                && square.getPointTwo() != square.getPointThree()
                && square.getPointTwo() != square.getPointFour()
                && square.getPointThree() != square.getPointFour()
        ) {
            return true;
        }
        log.error("The object {} of Square format is not a geometric square", square.toString());
        return false;
    }

    /**
     * Sorts an array of doubles by InsertionSort algorithm.
     *
     * @param array
     *        is the array to sort.
     */
    public static void insertionSort(double[] array){
        for (int i = 1; i < array.length; i++){
            int j = i - 1;
            double key = array[i];
            while(j > -1 && array[j] >  key){
                array[j+1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }

}
