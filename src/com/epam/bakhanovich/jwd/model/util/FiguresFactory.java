package com.epam.bakhanovich.jwd.model.util;

import com.epam.bakhanovich.jwd.model.pojos.Line;
import com.epam.bakhanovich.jwd.model.pojos.Point;
import com.epam.bakhanovich.jwd.model.pojos.Square;
import com.epam.bakhanovich.jwd.model.pojos.Triangle;

/**
 * Provides the creation of Figures.
 */
public class FiguresFactory {

    private FiguresFactory() {}

    /**
     * Builds a {@link Point}.
     *
     * @param coordinateX
     *        The X coordinate of the created {@link Point}.
     * @param coordinateY
     *        The Y coordinate of the created {@link Point}.
     * @return	An new {@link Point}.
     */
    public static Point buildPoint(double coordinateX, double coordinateY) {
        return new Point(coordinateX, coordinateY);
    }

    /**
     * Builds a {@link Line}.
     *
     * @param pointOne
     *        The first {@link Point} of the created {@link Line}.
     * @param pointTwo
     *        The second {@link Point} of the created {@link Line}.
     * @return	An new {@link Line}.
     */
    public static Line buildLine(Point pointOne, Point pointTwo) {
        return new Line(pointOne, pointTwo);
    }

    /**
     * Builds a {@link Triangle}.
     *
     * @param pointOne
     *        The first {@link Point} of the created {@link Triangle}.
     * @param pointTwo
     *        The second {@link Point} of the created {@link Triangle}.
     * @param pointThree
     *        The third {@link Point} one of the created {@link Triangle}.
     * @return	An new {@link Triangle}.
     */
    public static Triangle buildTriangle(Point pointOne, Point pointTwo, Point pointThree) {
        return new Triangle (pointOne, pointTwo, pointThree);
    }

    /**
     * Builds a {@link Square}.
     *
     * @return	An new {@link Square}.
     * @param pointOne
     *        The first {@link Point} of the created {@link Square}.
     * @param pointTwo
     *        The second {@link Point} of the created {@link Square}.
     * @param pointThree
     *        The third {@link Point} one of the created {@link Square}.
     * @param pointFour
     *        The fourth {@link Point} one of the created {@link Square}.
     */
    public static Square buildSquare(Point pointOne, Point pointTwo, Point pointThree, Point pointFour) {
        return new Square (pointOne, pointTwo, pointThree, pointFour);
    }

    /**
     * Builds an array of {@link Point}s.
     *
     * @param size
     *        The size of an array.
     * @return	An new array {@link Point}s.
     */
    public static Point[] buildArrayOfPoints(int size) {
        return new Point[size];
    }

    /**
     * Builds an array of {@link Line}s.
     *
     * @param size
     *        The size of an array.
     * @return	An new array {@link Line}s.
     */
    public static Line[] buildArrayOfLines(int size) {
        return new Line[size];
    }

    /**
     * Builds an array of {@link Triangle}s.
     *
     * @param size
     *        The size of an array.
     * @return	An new array {@link Triangle}s.
     */
    public static Triangle[] buildArrayOfTriangles(int size) {
        return new Triangle[size];
    }

    /**
     * Builds an array of {@link Square}s.
     *
     * @param size
     *        The size of an array.
     * @return	An new array {@link Square}s.
     */
    public static Square[] buildArrayOfSquares(int size) {
        return new Square[size];
    }
}
