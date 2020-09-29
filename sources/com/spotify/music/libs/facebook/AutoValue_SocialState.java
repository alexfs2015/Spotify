package com.spotify.music.libs.facebook;

import java.util.List;

final class AutoValue_SocialState extends SocialState {
    private final String accessToken;
    private final boolean enabled;
    private final List<String> missingPermissions;

    static final class Builder extends com.spotify.music.libs.facebook.SocialState.Builder {
        private String accessToken;
        private Boolean enabled;
        private List<String> missingPermissions;

        Builder() {
        }

        private Builder(SocialState socialState) {
            this.missingPermissions = socialState.missingPermissions();
            this.accessToken = socialState.accessToken();
            this.enabled = Boolean.valueOf(socialState.enabled());
        }

        public final com.spotify.music.libs.facebook.SocialState.Builder missingPermissions(List<String> list) {
            if (list != null) {
                this.missingPermissions = list;
                return this;
            }
            throw new NullPointerException("Null missingPermissions");
        }

        public final com.spotify.music.libs.facebook.SocialState.Builder accessToken(String str) {
            if (str != null) {
                this.accessToken = str;
                return this;
            }
            throw new NullPointerException("Null accessToken");
        }

        public final com.spotify.music.libs.facebook.SocialState.Builder enabled(boolean z) {
            this.enabled = Boolean.valueOf(z);
            return this;
        }

        public final SocialState build() {
            String str = "";
            if (this.missingPermissions == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" missingPermissions");
                str = sb.toString();
            }
            if (this.accessToken == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" accessToken");
                str = sb2.toString();
            }
            if (this.enabled == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" enabled");
                str = sb3.toString();
            }
            if (str.isEmpty()) {
                return new AutoValue_SocialState(this.missingPermissions, this.accessToken, this.enabled.booleanValue());
            }
            StringBuilder sb4 = new StringBuilder("Missing required properties:");
            sb4.append(str);
            throw new IllegalStateException(sb4.toString());
        }
    }

    private AutoValue_SocialState(List<String> list, String str, boolean z) {
        this.missingPermissions = list;
        this.accessToken = str;
        this.enabled = z;
    }

    public final List<String> missingPermissions() {
        return this.missingPermissions;
    }

    public final String accessToken() {
        return this.accessToken;
    }

    public final boolean enabled() {
        return this.enabled;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SocialState{missingPermissions=");
        sb.append(this.missingPermissions);
        sb.append(", accessToken=");
        sb.append(this.accessToken);
        sb.append(", enabled=");
        sb.append(this.enabled);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SocialState) {
            SocialState socialState = (SocialState) obj;
            return this.missingPermissions.equals(socialState.missingPermissions()) && this.accessToken.equals(socialState.accessToken()) && this.enabled == socialState.enabled();
        }
    }

    public final int hashCode() {
        return ((((this.missingPermissions.hashCode() ^ 1000003) * 1000003) ^ this.accessToken.hashCode()) * 1000003) ^ (this.enabled ? 1231 : 1237);
    }

    public final com.spotify.music.libs.facebook.SocialState.Builder toBuilder() {
        return new Builder(this);
    }
}
