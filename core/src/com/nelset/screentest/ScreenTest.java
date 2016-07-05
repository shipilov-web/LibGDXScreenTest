package com.nelset.screentest;

import com.badlogic.gdx.Game;
import com.nelset.screentest.screens.Screen1;
import com.nelset.screentest.screens.Screen2;

public class ScreenTest extends Game {


	public Screen1 screen1;
	public Screen2 screen2;
	// Инициализация разрешения экрана
	public static final int V_WIDTH = 480;
	public static final int V_HEIGHT = 800;
	
	@Override
	public void create () {
		screen1 = new Screen1(this);
		screen2 = new Screen2(this);

		setScreen(screen1);
	}

	@Override
	public void render () {
	super.render();
	}
}
