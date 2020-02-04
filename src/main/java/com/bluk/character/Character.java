package com.bluk.character;
import com.bluk.skill.Skill;
import java.util.LinkedList;

public class Character {

    /* standard parameters*/
    private long characterId;
    private String characterName;

    private long characterExperience;
    private Sex sex;
    private Race race;

    private int characterLvl;
    private int characterHealthPoints;
    private int characterManaPoints;
    private int characterStaminaPoints;
    private int characterEnergy;

    private String characterRealm;
    private String characterClass;

    /*Statistics*/
    private double characterStrength;
    private double characterDexterity;
    private double characterIntelligence;
    private double characterSpeed;
    private double characterCharisma;



    /*depend on the class parameters*/
    LinkedList<Skill> skills;



}
