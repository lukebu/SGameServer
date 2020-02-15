package com.lukebu.connection.Ability;
import com.lukebu.ability.Ability;
import com.lukebu.character.Character;
import com.lukebu.connection.Connector;

public class ProcessAbility {

    private Ability ability;
    private Character character;
    private Connector connector = new Connector();
    private String processStatus = "0";

    public String learnAbility(Ability ability, Character character) {
        this.ability = ability;
        this.character = character;
        connector.createConnectionToDb();
        String LEARN_ABILITY_QUERY = "INSERT INTO SGS_CHARACTER_ABILITIES (cra_cha_id, cra_level, cra_experience, cra_ability_type)" +
                " VALUES (" + this.character.getCharacterId() + ",'" + this.ability.getAbilityLevel() + "'," + this.ability.getAbilityExperience()
                + ",'" + this.ability.getAbilityType() + "');";

        connector.insertUpdateStatement(LEARN_ABILITY_QUERY);
        connector.closeConnectionWithCommit();

        return processStatus;
    }

    private String UpdateAbility(Ability ability, Character character) {
        return processStatus;
    }



}
