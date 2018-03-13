package Uppgifter;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class JavaFX extends Application {

	Scene scene;
	final double WIDTH = 600;
	final double HEIGHT = 600;

	@Override
	public void start(Stage primaryStage) throws Exception {

		scene = upg6();

		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public Scene upg0() {

		Group root1 = new Group();

		Scene scene = new Scene(root1, WIDTH, HEIGHT);

		Rectangle rect = new Rectangle(300, 200);
		rect.setTranslateX(WIDTH / 2 - rect.getWidth() / 2);
		rect.setTranslateY(HEIGHT / 2 - rect.getHeight() / 2);
		rect.setFill(Color.RED);

		root1.getChildren().add(rect);

		return scene;
	}

	public Scene upg1() {

		Group root2 = new Group();
		Scene scene = new Scene(root2, WIDTH, HEIGHT);

		for (int i = 0; i < 50; i++) {

			Circle cir = new Circle(50);

			root2.getChildren().add(cir);

			cir.setTranslateX(WIDTH / 2);
			cir.setTranslateY(HEIGHT / 2);
			cir.setFill(Color.RED);
		}

		return scene;
	}

	public Scene upg2() {

		Group root3 = new Group();
		Scene scene = new Scene(root3, WIDTH, HEIGHT);

		for (int i = 0; i < 50; i++) {

			Circle cir = new Circle(50);

			root3.getChildren().add(cir);

			cir.setTranslateX(WIDTH * Math.random());
			cir.setTranslateY(HEIGHT * Math.random());
			cir.setFill(Color.RED);

		}
		return scene;
	}

	public Scene upg3() {

		Group root4 = new Group();
		Scene scene = new Scene(root4, WIDTH, HEIGHT);

		int size1 = 150;
		int size2 = 100;

		Rectangle rect1 = new Rectangle(0, 0, size1, size2);
		Rectangle rect2 = new Rectangle(0, scene.getHeight() - size2, size1, size2);
		Rectangle rect3 = new Rectangle(scene.getWidth() - size1, 0, size1, size2);
		Rectangle rect4 = new Rectangle(scene.getWidth() - size1, scene.getHeight() - size2, size1, size2);

		rect1.setFill(Color.BLUE);
		rect2.setFill(Color.RED);
		rect3.setFill(Color.GREEN);
		rect4.setFill(Color.PURPLE);

		root4.getChildren().addAll(rect1, rect2, rect3, rect4);

		return scene;

	}

	public Scene upg4() {

		Group root5 = new Group();

		Scene scene = new Scene(root5, 1600, 1000, Color.YELLOW);

		Rectangle rect1 = new Rectangle(0, 0, 500, 400);
		Rectangle rect2 = new Rectangle(0, scene.getHeight() - 400, 500, 400);
		Rectangle rect3 = new Rectangle(scene.getWidth() - 900, 0, 900, 400);
		Rectangle rect4 = new Rectangle(scene.getWidth() - 900, scene.getHeight() - 400, 900, 400);

		rect1.setFill(Color.BLUE);
		rect2.setFill(Color.BLUE);
		rect3.setFill(Color.BLUE);
		rect4.setFill(Color.BLUE);

		root5.getChildren().addAll(rect1, rect2, rect3, rect4);

		return scene;

	}

	public Scene upg5() {

		Group root6 = new Group();

		Scene scene = new Scene(root6, 1600, 1000);

		Rectangle rect1 = new Rectangle(100, 50);

		scene.setOnKeyPressed(event -> {

			if (event.getCode() == KeyCode.UP) {
				rect1.setTranslateY(rect1.getTranslateY() - 15);
			}
			if (event.getCode() == KeyCode.RIGHT) {
				rect1.setTranslateX(rect1.getTranslateX() + 15);
			}
			if (event.getCode() == KeyCode.LEFT) {
				rect1.setTranslateX(rect1.getTranslateX() - 15);
			}
			if (event.getCode() == KeyCode.DOWN) {
				rect1.setTranslateY(rect1.getTranslateY() + 15);
			}

		});

		root6.getChildren().addAll(rect1);

		return scene;

	}

	public Scene upg6() {

		Group root7 = new Group();

		Scene scene = new Scene(root7, 1600, 1000);

		Circle cir = new Circle(50);
		

		scene.setOnKeyPressed(event -> {

			boolean WASD = true;
			
			if (event.getCode() == KeyCode.W && !(cir.getTranslateY() <= 50)) {
				cir.setTranslateY(cir.getTranslateY() - 25);
			}
			else if (event.getCode() == KeyCode.D && !(cir.getTranslateX() >= scene.getWidth()-50)){
				cir.setTranslateX(cir.getTranslateX() + 25);
			}
			else if (event.getCode() == KeyCode.A && !(cir.getTranslateX() <= 50)){
				cir.setTranslateX(cir.getTranslateX() - 25);
			}
			else if (event.getCode() == KeyCode.S && !(cir.getTranslateY() >= scene.getHeight()-50)){
				cir.setTranslateY(cir.getTranslateY() + 25);
			}
			else{
				WASD = false;
			}
			
			if(WASD){
				cir.setFill(new Color(Math.random(),Math.random(),Math.random(),1));
			}

		});

		root7.getChildren().addAll(cir);

		return scene;

	}

	
	public static void main(String[] args) {
		launch();
	}

}
