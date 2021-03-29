package com.epam.bakhanovich.jwd.app;

import com.epam.bakhanovich.jwd.model.pojos.Line;
import com.epam.bakhanovich.jwd.model.pojos.Point;
import com.epam.bakhanovich.jwd.model.pojos.Square;
import com.epam.bakhanovich.jwd.model.pojos.Triangle;
import com.epam.bakhanovich.jwd.model.service.CheckFigures;
import com.epam.bakhanovich.jwd.model.util.FiguresFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * executes the homework1
 *
 * @author Ihar Bakhanovich
 */
public class Main {

    private static final Logger log = LogManager.getLogger(Main.class);

    /**
     * runs the homework1
     */
    public static void main(String[] args) {
//        List<Point> points = new ArrayList<>();
//        final Point point1 = new Point(1,1);
//        final Point point2 = new Point(2,2);
//        final Point point3 = new Point(3,3);
//        final Point point4 = new Point(4,4);
//        points.add(point1);
//        points.add(point2);
//        points.add(point3);
//        points.add(point4);
//
//        for (Point point: points
//             ) {
//            log.info("Point " + point.toString() + " exists in this collection");
//        }
        // Создание массива из 4-х объектов {@link Point}
        Point point1 = FiguresFactory.buildPoint(0,0);
        Point point2 = FiguresFactory.buildPoint(0,1);
        Point point3 = FiguresFactory.buildPoint(1,1);
        Point point4 = FiguresFactory.buildPoint(1,0);
        Point[] points = FiguresFactory.buildArrayOfPoints(4);
        points[0] = point1;
        points[1] = point2;
        points[2] = point3;
        points[3] = point4;

        /*
         * используя do/while вывести информацию об элементах (toString)
         * массива {@link Point} (используя INFO log level)
         */
        int i = 0;
        do {
            if (points[i] != null) {
                log.info("Point {} is in array 'points'", points[i].toString());
            }
            i++;
        } while (i < points.length);

        // Создание массива из 2-х объектов {@link Line}
        Line line1 = FiguresFactory.buildLine(point1, point2);
        Line line2 = FiguresFactory.buildLine(point3, point4);
        Line[] lines = FiguresFactory.buildArrayOfLines(2);
        lines[0] = line1;
        lines[1] = line2;

        /*
         * Используя for вывести информацию об элементах (toString)
         * массива {@link Line} (используя INFO log level)
         */
        for (Line line : lines) {
            if (line != null) {
                if (CheckFigures.isLine(line)) {
                    log.info("Line {} is in array 'lines'", line.toString());
                }
            }
        }

        // Создание массива из 2-х объектов {@link Triangle}
        Triangle triangle1 = FiguresFactory.buildTriangle(point1, point2, point3);
        Triangle triangle2 = FiguresFactory.buildTriangle(point2, point3, point4);
        Triangle[] triangles = FiguresFactory.buildArrayOfTriangles(2);
        triangles[0] = triangle1;
        triangles[1] = triangle2;

        /*
         * Используя for вывести информацию об элементах (toString)
         * массива {@link Triangle} (используя INFO log level)
         */
        for (Triangle triangle : triangles) {
            if (triangle != null) {
                if (CheckFigures.isTriangle(triangle)) {
                    log.info("Triangle {} is in array 'triangles'", triangle.toString());
                }
            }
        }

        // Создание массива из 1-го объекта {@link Square}
        Square square1 = FiguresFactory.buildSquare(point1, point2, point3, point4);
        Square[] squares = FiguresFactory.buildArrayOfSquares(1);
        squares[0] = square1;

        /*
         * Используя for вывести информацию об элементах (toString)
         * массива {@link Square} (используя INFO log level)
         */
        for (Square square : squares) {
            if (square != null) {
                if (CheckFigures.isSquare(square)) {
                    log.info("Square {} is in array 'squares'", square.toString());
                }
            }
        }
    }
}
