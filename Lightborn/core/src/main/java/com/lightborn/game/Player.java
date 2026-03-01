package main.java.com.lightborn.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;

public class Player {
    private float x;
    private float y;

    private float x_velocity;
    private float y_velocity;
    private float gravity = -8;

    public void move(float delta) {
        if (Gdx.input.isKeyPressed(com.badlogic.gdx.Input.Keys.A) && !Gdx.input.isKeyPressed(com.badlogic.gdx.Input.Keys.D)) {
            x_velocity = -5;
        } else if (Gdx.input.isKeyPressed(com.badlogic.gdx.Input.Keys.D)) {
            x_velocity = 5;
        } else {
            x_velocity = 0;
        } // else (maybe)

        if (Gdx.input.isKeyJustPressed(com.badlogic.gdx.Input.Keys.W)) {
            y_velocity += 5;
        } // if

        y_velocity += gravity * delta;

        y += y_velocity;
        x += x_velocity;
    } // move


}
