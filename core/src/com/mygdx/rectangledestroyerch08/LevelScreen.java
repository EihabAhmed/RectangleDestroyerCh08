package com.mygdx.rectangledestroyerch08;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.math.Vector3;

public class LevelScreen extends BaseScreen {
    Paddle paddle;

    @Override
    public void initialize() {
        camera.setToOrtho(false, 800, 600);
        BaseActor background = new BaseActor(0, 0, mainStage);
        background.loadTexture("space.png");
        BaseActor.setWorldBounds(background);
        paddle = new Paddle(320, 32, mainStage);

        new Wall(0, 0, 20, 600, mainStage); // left wall
        new Wall(780, 0, 20, 600, mainStage); // right wall
        new Wall(0, 550, 800, 50, mainStage); // top wall

        Brick tempBrick = new Brick(0, 0, mainStage);
        float brickWidth = tempBrick.getWidth();
        float brickHeight = tempBrick.getHeight();
        tempBrick.remove();

        int totalRows = 10;
        int totalCols = 10;
        float marginX = (800 - totalCols * brickWidth) / 2;
        float marginY = (600 - totalRows * brickHeight) - 120;

        for (int rowNum = 0; rowNum < totalRows; rowNum++) {
            for (int colNum = 0; colNum < totalCols; colNum++) {
                float x = marginX + brickWidth * colNum;
                float y = marginY + brickHeight * rowNum;
                new Brick(x, y, mainStage);
            }
        }
    }

    @Override
    public void update(float dt) {
        Vector3 touchPos = new Vector3();
        touchPos.set(Gdx.input.getX(), 0, 0);
        camera.unproject(touchPos);
        paddle.setX(touchPos.x - paddle.getWidth() / 2);
        paddle.boundToWorld();
    }
}