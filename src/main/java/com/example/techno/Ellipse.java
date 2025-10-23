package com.example.techno;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Ellipse extends AbstraktClass {
    private double radiusX;  // радиус по X
    private double radiusY;  // радиус по Y

    public Ellipse(Color color, double x, double y, double radiusX, double radiusY) {
        super(color, x, y);
        this.radiusX = radiusX;
        this.radiusY = radiusY;
    }

    @Override
    public double area() {
        return Math.PI * radiusX * radiusY;  // площадь эллипса = пи * a * b
    }

    @Override
    public void draw(GraphicsContext gc) {
        // ЗАЛИВКА (дополнительный функционал п.5.1)
        gc.setFill(color);
        gc.fillOval(x, y, radiusX * 2, radiusY * 2);

        // КОНТУР (дополнительный функционал п.5.1)
        gc.setStroke(Color.BLACK);
        gc.strokeOval(x, y, radiusX * 2, radiusY * 2);
    }

    @Override
    public String toString() {
        return String.format("Эллипс: цвет=%s, площадь=%.2f, позиция=(%.1f,%.1f)",
                color, area(), x, y);
    }
}