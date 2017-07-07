package com.homelearning.creational.builder.mob;

public class Mob {

    private MobRace race;
    private String name;
    private int level;
    private boolean aggressive;
    private int health;

    public Mob() {

    }

    public void setRace(MobRace race) {
        this.race = race;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setAggressive(boolean aggressive) {
        this.aggressive = aggressive;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public String toString() {
        return "Mob{" +
                "race=" + race +
                ", name='" + name + '\'' +
                ", level=" + level +
                ", aggressive=" + aggressive +
                ", health=" + health +
                '}';
    }

    public enum MobRace {
        HUMAN, OGR, ELF, DWARF
    }
}
