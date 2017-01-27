package com.ar9013.life05;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Life05 extends ApplicationAdapter {
	private String TAG = "Life05";
	SpriteBatch batch;
	Texture img;
	
	@Override
	public void create () {
		Gdx.app.log(TAG,"create");
		batch = new SpriteBatch();
		img = new Texture("badlogic.jpg");
	}

	@Override
	public void resize(int width, int height) {
		Gdx.app.log(TAG,"resize");
	}

	@Override
	public void render () {
		Gdx.app.log(TAG,"render");
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(img, 0, 0);
		batch.end();
	}

	@Override
	public void pause() {
		Gdx.app.log(TAG,"pause");
	}

	@Override
	public void resume() {
		Gdx.app.log(TAG,"resume");
	}

	@Override
	public void dispose () {
		Gdx.app.log(TAG,"dispose");
		batch.dispose();
		img.dispose();
	}
}
