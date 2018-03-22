package Uppgifter;

import java.util.ArrayList;

import javafx.animation.AnimationTimer;
import javafx.scene.shape.Circle;

public class studsboll extends Circle{

		private static ArrayList<studsboll> bollar = new ArrayList<studsboll>();
		private static AnimationTimer gravity;
		private static double g = 0.982/3;
		
		private double speedY;
		private double speedX;
		
		public studsboll() {
			
			this.setRadius(Math.random()* 10 + 15);
			this.speedY = 0;
			this.speedX = Math.random() * 5;
			
			bollar.add(this);
		}
		
		public static void startGravity() {
			
			if (gravity == null) {
				gravity = new AnimationTimer(){

					@Override
					public void handle(long now) {
						
					for (studsboll studsboll : bollar) {
						studsboll.fall();
						
					}
				}		
			};
		}
			gravity.start();
	}

		public void fall() {
			
			this.speedY += g;
			
			if (this.getTranslateY() + speedY > launch.WINDOW_HEIGHT - this.getRadius()) {
				speedY *= -1;
			} else {
				this.setTranslateY(this.getTranslateY() + speedY);
			}
			
			if (this.getTranslateX() + speedX > launch.WINDOW_WIDTH - this.getRadius()) {
				speedX *= -1;
			} else if (this.getTranslateX() + speedX < 0 + this.getRadius()) {
				speedX *= -1;
			} else {
				this.setTranslateX(this.getTranslateX() + speedX );
			}
		}
		
		
		
}




