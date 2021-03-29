package com.epam.bakhanovich.jwd.model.pojos;

import java.util.Objects;

/**
 * A {@link Triangle}
 *
 * @author Ihar Bakhanovich
 */
public class Triangle {
    private final Point pointOne;
    private final Point pointTwo;
    private final Point pointThree;

    /**
     * Constructs a new {@link Triangle} containing {@link Point}s
     *      pointOne, pointTwo and pointThree.
     */
    public Triangle(Point pointOne, Point pointTwo, Point pointThree) {
        this.pointOne = pointOne;
        this.pointTwo = pointTwo;
        this.pointThree = pointThree;
    }

    /**
     * Returns the pointOne of the {@link Triangle}
     *
     * @return pointOne of this {@link Triangle}
     */
    public Point getPointOne() {
        return pointOne;
    }

    /**
     * Returns the pointTwo of the {@link Triangle}
     *
     * @return pointTwo of this {@link Triangle}
     */
    public Point getPointTwo() {
        return pointTwo;
    }

    /**
     * Returns the pointThree of the {@link Triangle}
     *
     * @return pointThree of this {@link Triangle}
     */
    public Point getPointThree() {
        return pointThree;
    }

    /**
     * Prints text view of the {@link Triangle}. The {@link Triangle}
     * is represented in the following way: ((x1, y1), (x2, y2), (x3, y3))
     * where (x1, y1) is the first {@link Point}, of this {@link Triangle}
     * and (x2, y2) and (x3, y3) are the second and the third {@link Point}s
     * of this {@link Triangle} respectively.
     *
     * @return String, that represents tupel of the coordinates
     *         of this {@link Square}
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        Point pointOne = this.getPointOne();
        Point pointTwo = this.getPointTwo();
        Point pointThree = this.getPointThree();

        builder.append("(")
                .append(pointOne.toString())
                .append(", ")
                .append(pointTwo.toString())
                .append(", ")
                .append(pointThree.toString())
                .append(")");
        return builder.toString();
    }

    @Override
    public int hashCode() {
        return Objects.hash(pointOne, pointTwo, pointThree);
    }
}