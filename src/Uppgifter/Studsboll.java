package Uppgifter;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Studsboll extends Application{

	public static final double WINDOW_WIDTH = 800;
	public static final double WINDOW_HEIGHT = 600;
	static final int circleAmount = 13;

	public static void main(String[] args) {
		launch();
	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		Group root = new Group();

		Scene scene = new Scene(root, WINDOW_WIDTH, WINDOW_HEIGHT);

		for (int i = 3; i < circleAmount; i++) {

			Circle cir = new Circle(i*3);

			cir.setTranslateX(WINDOW_WIDTH * Math.random());
			cir.setTranslateY(WINDOW_HEIGHT * Math.random());
			cir.setFill(Color.color(Math.random(), Math.random(), Math.random(),0.8));
			root.getChildren().add(cir);
		}

		primaryStage.setScene(scene);
		primaryStage.show();

	}

}