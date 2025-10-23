package com.example.techno;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
// КРУГ
public class Circle extends AbstraktClass {
    private double radius;  // радиус круга

    public Circle(Color color, double x, double y, double radius) {
        super(color, x, y);   // вызов конструктора AbstraktClass
        this.radius = radius;   // установка радиуса
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;  // площадь круга = пи * r^2
    }

    @Override
    public void draw(GraphicsContext gc) {
        // ЗАЛИВКА (дополнительный функционал п.5.1)
        gc.setFill(color);
        // oval с одинаковыми радиусами = круг
        gc.fillOval(x, y, radius * 2, radius * 2);

        // КОНТУР (дополнительный функционал п.5.1)
        gc.setStroke(Color.BLACK);
        gc.strokeOval(x, y, radius * 2, radius * 2);
    }

    @Override
    public String toString() {
        return String.format("Круг: цвет=%s, площадь=%.2f, позиция=(%.1f,%.1f)",
                color, area(), x, y);
    }
}