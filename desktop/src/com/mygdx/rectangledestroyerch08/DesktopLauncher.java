package com.mygdx.rectangledestroyerch08;

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;
import com.mygdx.rectangledestroyerch08.RectangleDestroyerGame;

// Please note that on macOS your application needs to be started with the -XstartOnFirstThread JVM argument
public class DesktopLauncher {
	public static void main (String[] arg) {
		Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();
		config.setForegroundFPS(60);
		config.setTitle("Rectangle Destroyer Ch08");
		config.setWindowedMode(800, 600);
		new Lwjgl3Application(new RectangleDestroyerGame(), config);
	}
}
