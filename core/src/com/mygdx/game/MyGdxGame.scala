package com.mygdx.game

import com.badlogic.gdx.ApplicationAdapter
import com.badlogic.gdx.Gdx
import com.badlogic.gdx.graphics.GL20
import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.g2d.SpriteBatch

class MyGdxGame extends ApplicationAdapter {
  override def create() {
    batch = new SpriteBatch
    img = new Texture("Roi_Heenok.jpg")
  }

  override def render() {
    Gdx.gl.glClearColor(1, 1, 0, 1)
    Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT)
    batch.begin()
    batch.draw(img, 0, 0)
    batch.end()
  }

  private[game] var batch: SpriteBatch = null
  private[game] var img: Texture = null
}
