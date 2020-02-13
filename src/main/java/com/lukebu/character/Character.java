package com.lukebu.character;
import com.lukebu.character.statistics.CharacterAdditionalStatistics;
import com.lukebu.character.statistics.CharacterBasicStatistics;
import com.lukebu.character.statistics.CharacterResistance;
import com.lukebu.character.types.CharacterProfessions;
import com.lukebu.character.types.CharacterRaces;
import com.lukebu.character.types.CharacterRealms;
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

    private Character() {}

   /* private int characterCapacity;

    private CharacterBasicStatistics characterBasicStatistics;
    private CharacterAdditionalStatistics characterAdditionalStatistics;
    private CharacterResistance characterResistance;*/

    private String characterRealm;
    private String characterClass;

    /*LinkedList<Skill> skills;
    LinkedList<Title> titles;

    private int characterArenaRanking;
    LinkedList<CharacterInventory> characterInventories;*/

    public long getCharacterId() {
        return this.characterId;
    }

    public String getCharacterName() {
        return this.characterName;
    }

    public static CharacterBuilder builder() {
        return new CharacterBuilder();
    }

    public static final class CharacterBuilder {
        private long characterId;
        private String characterName;
        private long characterExperience;
        private CharacterSex characterSex;
        private CharacterRaces characterRace;
        private int characterLevel;
        private int characterHealthPoints;
        private int characterManaPoints;
        private int characterStaminaPoints;
        private int characterEnergy;
        private int characterAttack;
        private int characterMagicAttack;
        private int characterDefense;
        private int characterSpeed;

        /*private int characterCapacity;

        private CharacterBasicStatistics characterBasicStatistics;
        private CharacterAdditionalStatistics characterAdditionalStatistics;
        private CharacterResistance characterResistance;
*/
        private CharacterRealms characterRealm;
        private CharacterProfessions characterProfession;

        /*LinkedList<Skill> skills;
        LinkedList<Title> titles;

        private int characterArenaRanking;
        LinkedList<CharacterInventory> characterInventories;*/

        public CharacterBuilder characterId(long characterId) {
            this.characterId = characterId;
            return this;
        }

        public CharacterBuilder characterName(String characterName) {
            this.characterName = characterName;
            return this;
        }

        public CharacterBuilder characterExperience(long characterExperience) {
            this.characterExperience = characterExperience;
            return this;
        }

        public CharacterBuilder characterSex(CharacterSex characterSex) {
            this.characterSex = characterSex;
            return this;
        }

        public CharacterBuilder characterRaces(CharacterRaces characterRaces) {
            this.characterRace = characterRaces;
            return this;
        }

        public CharacterBuilder characterLvl(int characterLvl) {
            this.characterLevel = characterLvl;
            return this;
        }

        public CharacterBuilder characterHealthPoints(int characterHealthPoints) {
            this.characterHealthPoints = characterHealthPoints;
            return this;
        }

        public CharacterBuilder characterManaPoints(int characterManaPoints) {
            this.characterManaPoints = characterManaPoints;
            return this;
        }

        public CharacterBuilder characterStaminaPoints(int characterStaminaPoints) {
            this.characterStaminaPoints = characterStaminaPoints;
            return this;
        }

        public CharacterBuilder characterEnergy(int characterEnergy) {
            this.characterEnergy = characterEnergy;
            return this;
        }

        public CharacterBuilder characterAttack(int characterAttack) {
            this.characterAttack = characterAttack;
            return this;
        }

        public CharacterBuilder characterMagicAttack(int characterMagicAttack) {
            this.characterMagicAttack = characterMagicAttack;
            return this;
        }

        public CharacterBuilder characterDefense(int characterDefense) {
            this.characterDefense = characterDefense;
            return this;
        }

        public CharacterBuilder characterSpeed(int characterSpeed) {
            this.characterSpeed = characterSpeed;
            return this;
        }

       /* public CharacterBuilder characterRealm(CharacterRealms realm) {
            this.characterRealm = characterRealm;
            return this;
        }

        public CharacterBuilder characterProfession(CharacterProfessions characterProfession) {
            this.characterProfession = characterProfession;
            return this;
        }*/

        public Character buildCharacter() {
            Character character = new Character();
            character.characterId =  this.characterId;
            character.characterName = this.characterName;
           /* characterExperience = this.characterExperience;
            character.characterSex = this.characterSex;
            character.characterRace = this.characterRace;
            character.characterLevel = this.characterLevel;
            character.characterHealthPoints = this.characterHealthPoints;
            character.characterManaPoints = this.characterManaPoints;
            character.characterStaminaPoints = this.characterStaminaPoints;
            character.characterEnergy = this.characterEnergy;
            character.characterRealm = this.characterRealm;*/

            return character;
        }

    }
}
