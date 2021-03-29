package com.epam.bakhanovich.jwd.model.pojos;

import java.util.Objects;

/**
 * A {@link Line}
 *
 * @author Ihar Bakhanovich
 */
public class Line {
    private final Point pointOne;
    private final Point pointTwo;

    /**
     * Constructs a new {@link Line} containing {@link Point}s
     * pointOne and pointTwo.
     */
    public Line(Point pointOne, Point pointTwo) {
        this.pointOne = pointOne;
        this.pointTwo = pointTwo;
    }

    /**
     * Returns the pointOne of the {@link Line}
     *
     * @return pointOne of this {@link Line}
     */
    public Point getPointOne() {
        return pointOne;
    }

    /**
     * Returns the pointTwo of the {@link Line}
     *
     * @return pointTwo of this {@link Line}
     */
    public Point getPointTwo() {
        return pointTwo;
    }

    /**
     * Prints text view of the {@link Line}. The {@link Line} is represented
     * in the following way: ((x1, y1), (x2, y2)) where (x1, y1) is the first {@link Point},
     * of this {@link Line} and (x2, y2) is the second {@link Point} of this {@link Line}
     * respectively.
     *
     * @return String, that represents tupel of the coordinates
     *         of this {@link Line}
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        Point pointOne = this.getPointOne();
        Point pointTwo = this.getPointTwo();
        builder.append("(")
                .append(pointOne.toString())
                .append(", ")
                .append(pointTwo.toString())
                .append(")");
        return builder.toString();
    }

    @Override
    public int hashCode() {
        return Objects.hash(pointOne, pointTwo);
    }
}
