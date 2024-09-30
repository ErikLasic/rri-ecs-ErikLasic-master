package com.mygdx.game.ecs.component;


import com.badlogic.ashley.core.Component;
import com.badlogic.gdx.utils.Pool;

public class FireballComponent implements Component, Pool.Poolable {

    public boolean hit;

    @Override
    public void reset() {
        hit = false;
    }
}
