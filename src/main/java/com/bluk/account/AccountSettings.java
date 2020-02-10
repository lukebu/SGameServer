package com.bluk.account;

public class AccountSettings {

    /*Basic settings */
    private Boolean accountMusic;
    private Boolean soundEffect;
    private Boolean blockInvitationFromFriends;

    /*Notification settings*/
    private Boolean staminaRestoredNotify;

    private AccountSettings() {
    }

    public static AccountSettingBuilder builder() {
        return new AccountSettingBuilder();
    }

    public static final class AccountSettingBuilder {
        private Boolean accountMusic;
        private Boolean soundEffect;
        private Boolean blockInvitationFromFriends;
        private Boolean staminaRestoredNotify;

        public AccountSettingBuilder accountMusic(Boolean accountMusic) {
            this.accountMusic = accountMusic;
            return this;
        }

        public AccountSettingBuilder soundEffect(Boolean soundEffect) {
            this.soundEffect = soundEffect;
            return this;
        }

        public AccountSettingBuilder blockInvitationFromFriends(Boolean blockInvitationFromFriends) {
            this.blockInvitationFromFriends = blockInvitationFromFriends;
            return this;
        }

        public AccountSettingBuilder staminaRestoredNotify(Boolean staminaRestoredNotify) {
            this.staminaRestoredNotify = staminaRestoredNotify;
            return this;
        }

        public AccountSettings build() {
            AccountSettings accountSettings = new AccountSettings();
            accountSettings.accountMusic = this.accountMusic;
            accountSettings.soundEffect = this.soundEffect;
            accountSettings.blockInvitationFromFriends = this.blockInvitationFromFriends;
            accountSettings.staminaRestoredNotify = this.staminaRestoredNotify;

            return accountSettings;
        }
    }
}
