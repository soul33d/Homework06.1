package com.homelearning.builder.mobbuilder;

import com.homelearning.builder.mob.Mob;

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
