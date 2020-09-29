package com.spotify.music.features.pushnotifications.inapppreference.model;

final class AutoValue_NotificationV2 extends NotificationV2 {
    private final String description;
    private final boolean emailEnabled;
    private final String key;
    private final String name;
    private final boolean pushEnabled;

    AutoValue_NotificationV2(String str, String str2, String str3, boolean z, boolean z2) {
        if (str != null) {
            this.name = str;
            if (str2 != null) {
                this.description = str2;
                if (str3 != null) {
                    this.key = str3;
                    this.emailEnabled = z;
                    this.pushEnabled = z2;
                    return;
                }
                throw new NullPointerException("Null key");
            }
            throw new NullPointerException("Null description");
        }
        throw new NullPointerException("Null name");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof NotificationV2) {
            NotificationV2 notificationV2 = (NotificationV2) obj;
            return this.name.equals(notificationV2.getName()) && this.description.equals(notificationV2.getDescription()) && this.key.equals(notificationV2.getKey()) && this.emailEnabled == notificationV2.isEmailEnabled() && this.pushEnabled == notificationV2.isPushEnabled();
        }
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getKey() {
        return this.key;
    }

    public final String getName() {
        return this.name;
    }

    public final int hashCode() {
        int i = 1231;
        int hashCode = (((((((this.name.hashCode() ^ 1000003) * 1000003) ^ this.description.hashCode()) * 1000003) ^ this.key.hashCode()) * 1000003) ^ (this.emailEnabled ? 1231 : 1237)) * 1000003;
        if (!this.pushEnabled) {
            i = 1237;
        }
        return hashCode ^ i;
    }

    public final boolean isEmailEnabled() {
        return this.emailEnabled;
    }

    public final boolean isPushEnabled() {
        return this.pushEnabled;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NotificationV2{name=");
        sb.append(this.name);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", key=");
        sb.append(this.key);
        sb.append(", emailEnabled=");
        sb.append(this.emailEnabled);
        sb.append(", pushEnabled=");
        sb.append(this.pushEnabled);
        sb.append("}");
        return sb.toString();
    }
}
