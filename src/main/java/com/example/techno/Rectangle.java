package com.example.techno;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

// КОНКРЕТНЫЙ КЛАСС (из лабы п.3) - наследует от AbstraktClass
public class Rectangle extends AbstraktClass {
    // ДОПОЛНИТЕЛЬНЫЕ ХАРАКТЕРИСТИКИ (из лабы)
    private double width;      // ширина прямоугольника
    private double height;     // высота прямоугольника

    // КОНСТРУКТОР (из лабы)
    public Rectangle(Color color, double x, double y, double width, double height) {
        // ВЫЗОВ КОНСТРУКТОРА AbstraktClass (из лабы - "calling Shape constructor")
        super(color, x, y);  // передаём параметры в родительский класс
        this.width = width;   // устанавливаем ширину
        this.height = height; // устанавливаем высоту
    }
    // РЕАЛИЗАЦИЯ АБСТРАКТНОГО МЕТОДА area() (из лабы)
    @Override
    public double area() {
        return width * height;   // площадь прямоугольника = ширина × высота
    }

    // РЕАЛИЗАЦИЯ АБСТРАКТНОГО МЕТОДА draw() (из лабы п.4)
    @Override
    public void draw(GraphicsContext gc) {
        // ЗАЛИВКА ФИГУРЫ (из лабы - дополнительный функционал п.5.1)
        gc.setFill(color);    // устанавливаем цвет заливки
        gc.fillRect(x, y, width, height);  // рисуем залитый прямоугольник

        // КОНТУР ФИГУРЫ ЧЕРНЫМ ЦВЕТОМ (из лабы - дополнительный функционал п.5.1)
        gc.setStroke(Color.BLACK);  // устанавливаем цвет контура
        gc.strokeRect(x, y, width, height);  // рисуем контур прямоугольника
    }

    // ПЕРЕОПРЕДЕЛЕНИЕ toString() (из лабы)
    @Override
    public String toString() {
        return String.format("Прямоугольник: цвет=%s, площадь=%.2f, позиция=(%.1f,%.1f)",
                color, area(), x, y);
    }
}