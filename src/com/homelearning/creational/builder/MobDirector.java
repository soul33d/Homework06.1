package com.homelearning.creational.builder;

import com.homelearning.creational.builder.mob.Mob;
import com.homelearning.creational.builder.mobbuilder.MobBuilder;

public class MobDirector {
    private MobBuilder builder;

    public MobDirector(MobBuilder builder) {
        this.builder = builder;
    }

    public Mob buildMob(){
        builder.newMob();
        builder.buildRace();
        builder.buildName();
        builder.buildLevel();
        builder.buildBehaviour();
        builder.buildHealth();
        return builder.getMob();
    }

    public MobBuilder getBuilder() {
        return builder;
    }

    public void setBuilder(MobBuilder builder) {
        this.builder = builder;
    }
}
