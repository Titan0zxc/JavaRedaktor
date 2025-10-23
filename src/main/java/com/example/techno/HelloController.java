package com.example.techno;

import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;

public class HelloController {
    // СВЯЗЫВАЕМ FXML ЭЛЕМЕНТЫ С КОДОМ (аннотация @FXML)
    @FXML
    private Label statusLabel;   // метка для вывода информации

    @FXML
    private Canvas canvas;      // холст для рисования

    @FXML
    private ColorPicker colorPicker;    // выбор цвета

    private GraphicsContext gc;     // графический контекст (из лабы)

    // МЕТОД ИНИЦИАЛИЗАЦИИ - вызывается после загрузки FXML
    @FXML
    public void initialize() {
        gc = canvas.getGraphicsContext2D();
        // УСТАНАВЛИВАЕМ НАЧАЛЬНЫЙ ЦВЕТ
        colorPicker.setValue(Color.BLUE);
        // ОЧИЩАЕМ ХОЛСТ
        clearCanvas();
    }

    // ОБРАБОТЧИК ДЛЯ КНОПКИ "ПРЯМОУГОЛЬНИК" (из лабы п.4)
    @FXML
    protected void drawRectangle() {
        clearCanvas(); // очищаем холст перед рисованием
        // СОЗДАЕМ ПРЯМОУГОЛЬНИК (из лабы п.4)
        Rectangle rectangle = new Rectangle(colorPicker.getValue(), 50, 50, 100, 60);
        // РИСУЕМ ПРЯМОУГОЛЬНИК (из лабы п.4)
        rectangle.draw(gc);
        // ВЫВОДИМ ИНФОРМАЦИЮ О ФИГУРЕ (из лабы п.5.5)
        statusLabel.setText(rectangle.toString());
    }

    // ОБРАБОТЧИК ДЛЯ КНОПКИ "КРУГ"
    @FXML
    protected void drawCircle() {
        clearCanvas();
        Circle circle = new Circle(colorPicker.getValue(), 150, 80, 40);
        circle.draw(gc);
        statusLabel.setText(circle.toString());
    }

    // ОБРАБОТЧИК ДЛЯ КНОПКИ "ЭЛЛИПС"
    @FXML
    protected void drawEllipse() {
        clearCanvas();
        Ellipse ellipse = new Ellipse(colorPicker.getValue(), 80, 120, 60, 30);
        ellipse.draw(gc);
        statusLabel.setText(ellipse.toString());
    }

    // ОБРАБОТЧИК ДЛЯ КНОПКИ "ОЧИСТИТЬ"
    @FXML
    protected void clearCanvas() {
        gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
        // ЗАЛИВКА БЕЛЫМ ФОНОМ
        gc.setFill(Color.WHITE);
        gc.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());
        statusLabel.setText("Холст очищен");
    }
}