package com.spotify.music.inappmessaging;

final class AutoValue_MessageRequest extends MessageRequest {
    private static final long serialVersionUID = 1;
    private final String eventId;
    private final String eventName;
    private final String eventVersion;
    private final String feature;

    AutoValue_MessageRequest(String str, String str2, String str3, String str4) {
        if (str != null) {
            this.feature = str;
            if (str2 != null) {
                this.eventName = str2;
                if (str3 != null) {
                    this.eventVersion = str3;
                    this.eventId = null;
                    return;
                }
                throw new NullPointerException("Null eventVersion");
            }
            throw new NullPointerException("Null eventName");
        }
        throw new NullPointerException("Null feature");
    }

    public final String a() {
        return this.feature;
    }

    public final String b() {
        return this.eventName;
    }

    public final String c() {
        return this.eventVersion;
    }

    public final String d() {
        return this.eventId;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof MessageRequest) {
            MessageRequest messageRequest = (MessageRequest) obj;
            if (this.feature.equals(messageRequest.a()) && this.eventName.equals(messageRequest.b()) && this.eventVersion.equals(messageRequest.c())) {
                String str = this.eventId;
                return str != null ? str.equals(messageRequest.d()) : messageRequest.d() == null;
            }
        }
    }

    public final int hashCode() {
        int hashCode = (((((this.feature.hashCode() ^ 1000003) * 1000003) ^ this.eventName.hashCode()) * 1000003) ^ this.eventVersion.hashCode()) * 1000003;
        String str = this.eventId;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessageRequest{feature=");
        sb.append(this.feature);
        sb.append(", eventName=");
        sb.append(this.eventName);
        sb.append(", eventVersion=");
        sb.append(this.eventVersion);
        sb.append(", eventId=");
        sb.append(this.eventId);
        sb.append("}");
        return sb.toString();
    }
}
