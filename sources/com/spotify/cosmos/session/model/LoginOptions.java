package com.spotify.cosmos.session.model;

public abstract class LoginOptions {

    public interface Builder {
        Builder authOnlySetting(Boolean bool);

        Builder bootstrapRequired(Boolean bool);

        LoginOptions build();

        Builder preAuthenticationSetting(PreAuthenticationSetting preAuthenticationSetting);
    }

    public enum PreAuthenticationSetting {
        NEVER("never"),
        PERFORMBUTIGNORE("perform_but_ignore_result"),
        REQUIRESUCCESS("require_success");
        
        private final String mValue;

        private PreAuthenticationSetting(String str) {
            this.mValue = str;
        }

        public final String toString() {
            return this.mValue;
        }
    }

    /* access modifiers changed from: 0000 */
    public abstract Boolean authOnlySetting();

    /* access modifiers changed from: 0000 */
    public abstract Boolean bootstrapRequired();

    /* access modifiers changed from: 0000 */
    public abstract PreAuthenticationSetting preAuthenticationSetting();

    public static Builder builder() {
        return new Builder();
    }
}
