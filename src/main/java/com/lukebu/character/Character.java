package com.lukebu.character;
import com.lukebu.character.statistics.CharacterAdditionalStatistics;
import com.lukebu.character.statistics.CharacterBasicStatistics;
import com.lukebu.character.statistics.CharacterResistance;
import com.lukebu.character.types.CharacterRaces;
import com.lukebu.character.types.CharacterSex;
import com.lukebu.inventory.CharacterInventory;
import com.lukebu.skill.Skill;
import com.lukebu.titles.Title;

import java.util.LinkedList;

public class Character {

    /* standard parameters*/
    private long characterId;
    private String characterName;
    private long characterExperience;
    private CharacterSex characterSex;
    private CharacterRaces characterRaces;
    private int characterLvl;
    private int characterHealthPoints;
    private int characterManaPoints;
    private int characterStaminaPoints;
    private int characterEnergy;
    private int characterAttack;
    private int characterMagicAttack;
    private int characterDefense;
    private int characterSpeed;

    private int characterCapacity;

    private CharacterBasicStatistics characterBasicStatistics;
    private CharacterAdditionalStatistics characterAdditionalStatistics;
    private CharacterResistance characterResistance;

    private String characterRealm;
    private String characterClass;

    LinkedList<Skill> skills;
    LinkedList<Title> titles;

    private int characterArenaRanking;
    LinkedList<CharacterInventory> characterInventories;

}
