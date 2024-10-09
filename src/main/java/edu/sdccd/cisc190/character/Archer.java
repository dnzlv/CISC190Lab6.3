package edu.sdccd.cisc190.character;

import edu.sdccd.cisc190.weapon.Bow;

public class Archer extends Character {
    private int numArrows;

    public Archer(String name, int healthPoints, int strengthPoints, int defensePoints, Bow bow) {
        super(name, healthPoints, strengthPoints, defensePoints, bow);
    }

    @Override
    public void attack(Character opponent) {
        // deal damage if arrow available

        // take no damage since this is a ranged attack
    }
}
