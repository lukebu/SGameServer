package com.lukebu.test;

import com.lukebu.ability.Ability;
import com.lukebu.ability.AbilityLevel;
import com.lukebu.ability.AbilityType;
import com.lukebu.account.Account;
import com.lukebu.character.Character;
import com.lukebu.connection.Ability.ProcessAbility;

public class Tests {

    private Ability ability;
    private Character character;
    private Account account;
    private ProcessAbility processAbility = new ProcessAbility();

    private Character createCharacter() {
        return character = Character.builder()
                .characterId(1)
                .characterName("Buba")
                .buildCharacter();
    }

    private Ability learnAbility() {
        return ability = Ability.builder()
                .abilityExperience(1)
                .abilityLevel(AbilityLevel.BEGINNER)
                .abilityType(AbilityType.ALCHEMY)
                .buildAbility();
    }



    public static void main(String[] args) {

        Tests tests = new Tests();
        tests.learnAbility();
        tests.createCharacter();
        tests.processAbility.learnAbility( tests.ability, tests.character);

    }

}
