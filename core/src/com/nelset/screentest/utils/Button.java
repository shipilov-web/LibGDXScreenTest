package com.nelset.screentest.utils;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.Actor;

import com.nelset.screentest.ScreenTest;

public class Button extends Actor {

    ScreenTest game;

    private Texture texture;
    public float x, y;

    public Button(Texture texture, float x, float y) {
        this.texture = texture;
        this.x = x;
        this.y = y;
        setBounds(this.x,this.y,texture.getWidth(),texture.getHeight());

    }

    @Override
    public void draw(Batch batch, float parentAlpha )
    {
        batch.draw(texture, x, y);
        super.draw(batch, parentAlpha);


    }

    @Override
    public void act(float delta) {
        super.act(delta);
    }


}