package com.spotify.cosmos.session.model;

final class AutoValue_SessionInfo extends SessionInfo {
    private final String accessToken;
    private final String locale;
    private final String storedCredentials;
    private final String username;

    AutoValue_SessionInfo(String str, String str2, String str3, String str4) {
        if (str != null) {
            this.username = str;
            this.storedCredentials = str2;
            this.locale = str3;
            this.accessToken = str4;
            return;
        }
        throw new NullPointerException("Null username");
    }

    public final String accessToken() {
        return this.accessToken;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SessionInfo) {
            SessionInfo sessionInfo = (SessionInfo) obj;
            if (this.username.equals(sessionInfo.username())) {
                String str = this.storedCredentials;
                if (str != null ? str.equals(sessionInfo.storedCredentials()) : sessionInfo.storedCredentials() == null) {
                    String str2 = this.locale;
                    if (str2 != null ? str2.equals(sessionInfo.locale()) : sessionInfo.locale() == null) {
                        String str3 = this.accessToken;
                        return str3 != null ? str3.equals(sessionInfo.accessToken()) : sessionInfo.accessToken() == null;
                    }
                }
            }
        }
    }

    public final int hashCode() {
        int hashCode = (this.username.hashCode() ^ 1000003) * 1000003;
        String str = this.storedCredentials;
        int i = 0;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.locale;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.accessToken;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode3 ^ i;
    }

    public final String locale() {
        return this.locale;
    }

    public final String storedCredentials() {
        return this.storedCredentials;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SessionInfo{username=");
        sb.append(this.username);
        sb.append(", storedCredentials=");
        sb.append(this.storedCredentials);
        sb.append(", locale=");
        sb.append(this.locale);
        sb.append(", accessToken=");
        sb.append(this.accessToken);
        sb.append("}");
        return sb.toString();
    }

    public final String username() {
        return this.username;
    }
}
