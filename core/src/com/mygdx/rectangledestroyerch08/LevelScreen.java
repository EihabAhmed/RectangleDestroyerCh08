package com.mygdx.rectangledestroyerch08;

import com.badlogic.gdx.Gdx;

public class LevelScreen extends BaseScreen {
    Paddle paddle;

    @Override
    public void initialize() {
        BaseActor background = new BaseActor(0, 0, mainStage);
        background.loadTexture("space.png");
        BaseActor.setWorldBounds(background);
        paddle = new Paddle(320, 32, mainStage);
    }

    @Override
    public void update(float dt) {
        float mouseX = Gdx.input.getX();
        paddle.setX(mouseX - paddle.getWidth() / 2);
        paddle.boundToWorld();
    }
}
