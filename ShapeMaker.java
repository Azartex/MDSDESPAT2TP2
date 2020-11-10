package fr.mds.javacourse.depatp2.launcher;

import java.util.Arrays;
import java.util.List;

import fr.mds.javacourse.depatp2.launcher.Circle;

public class ShapeMaker {
	
	private static List<Shape> listShape = Arrays.asList(new Circle(), new Rectangle(), new Square());

	public void drawCircle() {
		
		for(Shape shape: listShape) {
			if(listShape instanceof Circle) {
				listShape.draw();
			}
		}
	}

	public void drawRectangle() {
		
		for(Shape shape: listShape) {
			if(listShape instanceof Rectangle) {
				listShape.draw();
			}
		}
	}

	public void drawSquare() {
		
		for(Shape shape: listShape) {
			if(listShape instanceof Square) {
				listShape.draw();
			}
		}
	}
}