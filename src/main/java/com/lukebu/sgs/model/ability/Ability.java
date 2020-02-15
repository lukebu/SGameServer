package com.lukebu.sgs.model.ability;

public class Ability {

    private long abilityExperience;
    private AbilityLevel abilityLevel;
    private AbilityType abilityType;

    private Ability(){};

    public long getAbilityExperience() {
        return abilityExperience;
    }

    public AbilityLevel getAbilityLevel() {
        return abilityLevel;
    }

    public AbilityType getAbilityType() {
        return abilityType;
    }

    public static AbilityBuilder builder() {
        return new AbilityBuilder();
    }


    public static final class AbilityBuilder {
        private long abilityExperience;
        private AbilityLevel abilityLevel;
        private AbilityType abilityType;

        public AbilityBuilder abilityExperience(long abilityExperience) {
            this.abilityExperience = abilityExperience;
            return  this;
        }

        public AbilityBuilder abilityLevel(AbilityLevel abilityLevel) {
            this.abilityLevel = abilityLevel;
            return this;
        }

        public AbilityBuilder abilityType(AbilityType abilityType) {
            this.abilityType = abilityType;
            return this;
        }

        public Ability buildAbility() {
            Ability ability = new Ability();
            ability.abilityExperience = this.abilityExperience;
            ability.abilityLevel = this.abilityLevel;
            ability.abilityType = this.abilityType;

            return ability;
        }




    }







}
