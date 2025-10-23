package com.example.techno;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
// АБСТРАКТНЫЙ СУПЕРКЛАСС (из лабы п.2)
public abstract class AbstraktClass {
    // ПАРАМЕТРЫ ФИГУРЫ - ЗАЩИЩЕННЫЕ ПОЛЯ (из лабы)
    protected Color color;   // цвет фигуры
    protected double x, y;   // позиция фигуры на холсте

    // КОНСТРУКТОР (из лабы)
    public AbstraktClass(Color color, double x, double y) {
        this.color = color;  // устанавливаем цвет
        this.x = x;          // устанавливаем X координату
        this.y = y;          // устанавливаем Y координату
    }

    // АБСТРАКТНЫЕ МЕТОДЫ (из лабы) - должны быть реализованы в наследниках
    public abstract double area();  // вычисление площади
    public abstract void draw(GraphicsContext gc); // отрисовка фигуры

    // РЕАЛИЗАЦИЯ МЕТОДОВ (из лабы)
    public void setColor(Color color) {
        this.color = color; // изменение цвета фигуры
    }

    public Color getColor() {
        return color;      // получение текущего цвета
    }

    public void setPosition(double x, double y) {
        this.x = x;  // установка новой позиции X
        this.y = y;  // установка новой позиции Y
    }
}
