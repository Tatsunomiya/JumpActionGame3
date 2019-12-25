package jp.techacademy.r.d.jumpactiongame

import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.g2d.Sprite

class Enemy(texture: Texture, srcX:Int, srcY:Int, srcWidth:Int, srcHeight:Int): Sprite(texture,srcX,srcY,srcWidth,srcHeight) {

    companion object {
        val UFO_WIDTH = 1.1f
        val UFO_HEIGHT= 1.1f
    }

    init {
        setSize(UFO_WIDTH, UFO_HEIGHT)
    }

}