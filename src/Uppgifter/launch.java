package Uppgifter;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class launch extends Application{

	public static final double WINDOW_WIDTH = 800;
	public static final double WINDOW_HEIGHT = 600;
	

	public static void main(String[] args) {
		launch();
	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		Group root = new Group();

		Scene scene = new Scene(root, WINDOW_WIDTH, WINDOW_HEIGHT,Color.SKYBLUE);

		for (int i = 0; i < 10; i++) {

			studsboll boll = new studsboll();
			boll.setTranslateX(WINDOW_WIDTH * Math.random());
			boll.setTranslateY(WINDOW_HEIGHT * Math.random());
			boll.setFill(Color.color(Math.random(), Math.random(), Math.random(),0.8));
			root.getChildren().add(boll);
		}

		studsboll.startGravity();
		
		primaryStage.setScene(scene);
		primaryStage.show();

	}

}
