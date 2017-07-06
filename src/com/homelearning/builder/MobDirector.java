package com.homelearning.builder;

import com.homelearning.builder.mob.Mob;
import com.homelearning.builder.mobbuilder.MobBuilder;

public class MobDirector {
    private MobBuilder builder;

    public MobDirector(MobBuilder builder) {
        this.builder = builder;
    }

    public Mob buildMob(){
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
