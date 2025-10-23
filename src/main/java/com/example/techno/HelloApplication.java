package com.example.techno;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        // ЗАГРУЗКА FXML ИНТЕРФЕЙСА (из лабы п.1)
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        // СОЗДАНИЕ СЦЕНЫ С РАЗМЕРОМ 600x400
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        // НАСТРОЙКА ОКНА
        stage.setTitle("Лабораторная работа - Графический редактор");
        stage.setScene(scene);
        // ПОКАЗ ОКНА
        stage.show();
    }
    // ГЛАВНЫЙ МЕТОД ПРИЛОЖЕНИЯ
    public static void main(String[] args) {
        launch();
    }
}