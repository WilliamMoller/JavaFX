package Uppgifter;

import java.util.ArrayList;

import javafx.animation.AnimationTimer;
import javafx.scene.shape.Circle;

public class studsboll extends Circle{

		private static ArrayList<studsboll> cir = new ArrayList<studsboll>();
		private static AnimationTimer gravity;
		private static double g = 0.982/3;
		
		private double speedY;
		
		public studsboll() {
			
			this.setRadius(Math.random()* 20 + 20);
			this.speedY = 0;
			
			cir.add(this);
		}
		
		public static void startGravity() {
			
			if (gravity == null) {
				gravity = new AnimationTimer(){

					@Override
					public void handle(long now) {
						
					for () {
						
					}
				}		
			};
		}
	}
}