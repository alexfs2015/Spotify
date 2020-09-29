package com.spotify.cosmos.session.model;

import com.spotify.cosmos.session.model.LoginOptions.PreAuthenticationSetting;

final class AutoValue_LoginOptions extends LoginOptions {
    private final Boolean authOnlySetting;
    private final Boolean bootstrapRequired;
    private final PreAuthenticationSetting preAuthenticationSetting;

    static final class Builder implements com.spotify.cosmos.session.model.LoginOptions.Builder {
        private Boolean authOnlySetting;
        private Boolean bootstrapRequired;
        private PreAuthenticationSetting preAuthenticationSetting;

        Builder() {
        }

        public final com.spotify.cosmos.session.model.LoginOptions.Builder preAuthenticationSetting(PreAuthenticationSetting preAuthenticationSetting2) {
            this.preAuthenticationSetting = preAuthenticationSetting2;
            return this;
        }

        public final com.spotify.cosmos.session.model.LoginOptions.Builder authOnlySetting(Boolean bool) {
            this.authOnlySetting = bool;
            return this;
        }

        public final com.spotify.cosmos.session.model.LoginOptions.Builder bootstrapRequired(Boolean bool) {
            this.bootstrapRequired = bool;
            return this;
        }

        public final LoginOptions build() {
            return new AutoValue_LoginOptions(this.preAuthenticationSetting, this.authOnlySetting, this.bootstrapRequired);
        }
    }

    private AutoValue_LoginOptions(PreAuthenticationSetting preAuthenticationSetting2, Boolean bool, Boolean bool2) {
        this.preAuthenticationSetting = preAuthenticationSetting2;
        this.authOnlySetting = bool;
        this.bootstrapRequired = bool2;
    }

    /* access modifiers changed from: 0000 */
    public final PreAuthenticationSetting preAuthenticationSetting() {
        return this.preAuthenticationSetting;
    }

    /* access modifiers changed from: 0000 */
    public final Boolean authOnlySetting() {
        return this.authOnlySetting;
    }

    /* access modifiers changed from: 0000 */
    public final Boolean bootstrapRequired() {
        return this.bootstrapRequired;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LoginOptions{preAuthenticationSetting=");
        sb.append(this.preAuthenticationSetting);
        sb.append(", authOnlySetting=");
        sb.append(this.authOnlySetting);
        sb.append(", bootstrapRequired=");
        sb.append(this.bootstrapRequired);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof LoginOptions) {
            LoginOptions loginOptions = (LoginOptions) obj;
            PreAuthenticationSetting preAuthenticationSetting2 = this.preAuthenticationSetting;
            if (preAuthenticationSetting2 != null ? preAuthenticationSetting2.equals(loginOptions.preAuthenticationSetting()) : loginOptions.preAuthenticationSetting() == null) {
                Boolean bool = this.authOnlySetting;
                if (bool != null ? bool.equals(loginOptions.authOnlySetting()) : loginOptions.authOnlySetting() == null) {
                    Boolean bool2 = this.bootstrapRequired;
                    return bool2 != null ? bool2.equals(loginOptions.bootstrapRequired()) : loginOptions.bootstrapRequired() == null;
                }
            }
        }
    }

    public final int hashCode() {
        PreAuthenticationSetting preAuthenticationSetting2 = this.preAuthenticationSetting;
        int i = 0;
        int hashCode = ((preAuthenticationSetting2 == null ? 0 : preAuthenticationSetting2.hashCode()) ^ 1000003) * 1000003;
        Boolean bool = this.authOnlySetting;
        int hashCode2 = (hashCode ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        Boolean bool2 = this.bootstrapRequired;
        if (bool2 != null) {
            i = bool2.hashCode();
        }
        return hashCode2 ^ i;
    }
}
