package com.homelearning.builder.mobbuilder;

import com.homelearning.builder.mob.Mob;

import java.util.Random;

public class CalmHumanMobBuilder implements MobBuilder {
    private Mob mob = new Mob();
    private String[] names = {"Maria", "Ivan", "Alla", "Vasiliy"};
    private Random random = new Random();
    private int level;

    public CalmHumanMobBuilder(int level) {
        this.level = level;
    }

    @Override
    public void buildRace() {
        mob.setRace(Mob.MobRace.HUMAN);
    }

    @Override
    public void buildName() {
        int randNameIndex = random.nextInt(names.length);
        mob.setName(names[randNameIndex]);
    }

    @Override
    public void buildLevel() {
        mob.setLevel(level);
    }

    @Override
    public void buildBehaviour() {
        mob.setAggressive(false);
    }

    @Override
    public void buildHealth() {
        mob.setHealth(level*100);
    }

    @Override
    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public Mob getMob() {
        return mob;
    }
}
