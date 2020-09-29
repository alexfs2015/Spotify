package com.spotify.pushnotifications.model;

final class AutoValue_PushRegistrationData extends PushRegistrationData {
    private final String appId;
    private final String environment;
    private final boolean firebase;
    private final String osVersion;
    private final String platform;
    private final String token;

    AutoValue_PushRegistrationData(String str, String str2, String str3, boolean z, String str4, String str5) {
        if (str != null) {
            this.environment = str;
            if (str2 != null) {
                this.platform = str2;
                if (str3 != null) {
                    this.token = str3;
                    this.firebase = z;
                    if (str4 != null) {
                        this.appId = str4;
                        if (str5 != null) {
                            this.osVersion = str5;
                            return;
                        }
                        throw new NullPointerException("Null osVersion");
                    }
                    throw new NullPointerException("Null appId");
                }
                throw new NullPointerException("Null token");
            }
            throw new NullPointerException("Null platform");
        }
        throw new NullPointerException("Null environment");
    }

    public final String getEnvironment() {
        return this.environment;
    }

    public final String getPlatform() {
        return this.platform;
    }

    public final String getToken() {
        return this.token;
    }

    public final boolean isFirebase() {
        return this.firebase;
    }

    public final String getAppId() {
        return this.appId;
    }

    public final String getOsVersion() {
        return this.osVersion;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PushRegistrationData{environment=");
        sb.append(this.environment);
        sb.append(", platform=");
        sb.append(this.platform);
        sb.append(", token=");
        sb.append(this.token);
        sb.append(", firebase=");
        sb.append(this.firebase);
        sb.append(", appId=");
        sb.append(this.appId);
        sb.append(", osVersion=");
        sb.append(this.osVersion);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PushRegistrationData) {
            PushRegistrationData pushRegistrationData = (PushRegistrationData) obj;
            return this.environment.equals(pushRegistrationData.getEnvironment()) && this.platform.equals(pushRegistrationData.getPlatform()) && this.token.equals(pushRegistrationData.getToken()) && this.firebase == pushRegistrationData.isFirebase() && this.appId.equals(pushRegistrationData.getAppId()) && this.osVersion.equals(pushRegistrationData.getOsVersion());
        }
    }

    public final int hashCode() {
        return ((((((((((this.environment.hashCode() ^ 1000003) * 1000003) ^ this.platform.hashCode()) * 1000003) ^ this.token.hashCode()) * 1000003) ^ (this.firebase ? 1231 : 1237)) * 1000003) ^ this.appId.hashCode()) * 1000003) ^ this.osVersion.hashCode();
    }
}
