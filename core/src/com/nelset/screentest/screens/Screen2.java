package com.nelset.screentest.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.StretchViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.nelset.screentest.ScreenTest;
import com.nelset.screentest.utils.Button;

/**
 * Created by Николай on 21.06.2016.
 */
public class Screen2 implements Screen {
    ScreenTest game;

    Texture img;
    SpriteBatch batch;

    Stage gameStage;
    Button button1;

    private OrthographicCamera gamecam;
    private Viewport gameport;



    public Screen2(ScreenTest game){
    batch = new SpriteBatch();
    img = new Texture("badlogic.jpg");
    gamecam = new OrthographicCamera();
    gameport = new StretchViewport(ScreenTest.V_HEIGHT, ScreenTest.V_WIDTH, gamecam);
    gameStage = new Stage(new StretchViewport(ScreenTest.V_HEIGHT,ScreenTest.V_WIDTH ));

    button1 = new Button(img,0,0);
    button1.addListener(new InputListener(){

        public boolean touchDown (InputEvent event, float x, float y, int pointer, int button) {
            Gdx.app.log("My logs", "press button");
            game.setScreen(game.screen1);
          //  button1.setTouchable(Touchable.enabled);

            return false;
        }


    });
    gameStage.addActor(button1);
    }

    @Override
    public void render(float delta) {
        Gdx.app.log("Locate", "Screen2");

        Gdx.gl.glClearColor(0,0,0,0);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        gameStage.act(Gdx.graphics.getDeltaTime());
        gameStage.draw();

       // batch.begin();
       // batch.draw(img, 0, 0);
        //batch.end();
    }

    @Override
    public void resize(int width, int height) {
    }


    @Override
    public void show() {
        Gdx.input.setInputProcessor(gameStage);
    }


    @Override
    public void hide() {

        // тут будет происходить действия когда ты спрячешь этот экран
    }

    @Override
    public void pause() {
    }


    @Override
    public void resume() {
    }


    @Override
    public void dispose() {
        // never called automatically
    }
}
