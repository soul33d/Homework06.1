package com.homelearning.builder;

import com.homelearning.builder.mobbuilder.AggressiveHumanMobBuilder;
import com.homelearning.builder.mobbuilder.CalmHumanMobBuilder;

public class MobBuilderDemo {
    public static void main(String[] args) {
        MobDirector mobDirector = new MobDirector(new CalmHumanMobBuilder(1));
        System.out.println(mobDirector.buildMob());
        System.out.println(mobDirector.buildMob());
        System.out.println(mobDirector.buildMob());

        mobDirector.getBuilder().setLevel(2);
        System.out.println(mobDirector.buildMob());
        System.out.println(mobDirector.buildMob());
        System.out.println(mobDirector.buildMob());

        System.out.println("\nYou walk along the forest path, around you see some peaceful forest inhabitants.\n");

        mobDirector.setBuilder(new AggressiveHumanMobBuilder(1));
        System.out.println(mobDirector.buildMob());
        System.out.println(mobDirector.buildMob());
        System.out.println(mobDirector.buildMob());

        mobDirector.getBuilder().setLevel(3);
        System.out.println(mobDirector.buildMob());
        System.out.println(mobDirector.buildMob());
        System.out.println(mobDirector.buildMob());

        System.out.println("\nYou were surrounded by aggressive mobs, it seems that you can only try to escape...\n");
    }
}
