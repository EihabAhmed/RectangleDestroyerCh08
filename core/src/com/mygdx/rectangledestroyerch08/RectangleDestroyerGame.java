package com.mygdx.rectangledestroyerch08;

public class RectangleDestroyerGame extends BaseGame {
	public void create() {
		super.create();
		setActiveScreen(new LevelScreen());
	}
}
