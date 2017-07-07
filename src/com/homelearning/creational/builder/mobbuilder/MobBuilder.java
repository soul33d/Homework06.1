package com.homelearning.creational.builder.mobbuilder;

import com.homelearning.creational.builder.mob.Mob;

public interface MobBuilder {
    void newMob();
    void buildRace();
    void buildName();
    void buildLevel();
    void buildBehaviour();
    void buildHealth();
    void setLevel(int level);
    Mob getMob();
}
