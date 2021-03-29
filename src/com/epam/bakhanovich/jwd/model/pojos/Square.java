package com.epam.bakhanovich.jwd.model.pojos;

import java.util.Objects;

/**
 * A {@link Square}
 *
 * @author Ihar Bakhanovich
 */
public class Square {
    private final Point pointOne;
    private final Point pointTwo;
    private final Point pointThree;
    private final Point pointFour;

    /**
     * Constructs a new {@link Square} containing {@link Point}s
     *      pointOne, pointTwo, pointThree and pointFour.
     */
    public Square(Point pointOne, Point pointTwo, Point pointThree, Point pointFour) {
        this.pointOne = pointOne;
        this.pointTwo = pointTwo;
        this.pointThree = pointThree;
        this.pointFour = pointFour;
    }

    /**
     * Returns the pointOne of the {@link Square}
     *
     * @return pointOne of this {@link Square}
     */
    public Point getPointOne() {
        return pointOne;
    }

    /**
     * Returns the pointTwo of the {@link Square}
     *
     * @return pointTwo of this {@link Square}
     */
    public Point getPointTwo() {
        return pointTwo;
    }

    /**
     * Returns the pointThree of the {@link Square}
     *
     * @return pointThree of this {@link Square}
     */
    public Point getPointThree() {
        return pointThree;
    }

    /**
     * Returns the pointFour of the {@link Square}
     *
     * @return pointThree of this {@link Square}
     */
    public Point getPointFour() {
        return pointFour;
    }

    /**
     * Prints text view of the {@link Square}. The {@link Square}
     * is represented in the following way: ((x1, y1), (x2, y2), (x3, y3), (x4, y4))
     * where (x1, y1) is the first {@link Point}, of this {@link Square}
     * and (x2, y2), (x3, y3) and (x4, y4) are the second, the third and
     * the fourth {@link Point}s of this {@link Square} respectively.
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
        Point pointFour = this.getPointFour();

        builder.append("(")
                .append(pointOne.toString())
                .append(", ")
                .append(pointTwo.toString())
                .append(", ")
                .append(pointThree.toString())
                .append(", ")
                .append(pointFour.toString())
                .append(")");
        return builder.toString();
    }

    @Override
    public int hashCode() {
        return Objects.hash(pointOne, pointTwo, pointThree, pointFour);
    }
}
