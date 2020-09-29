package com.spotify.music.sociallistening.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.music.sociallistening.model.Notification.Reason;

final class AutoValue_Notification extends Notification {
    private final Reason reason;
    private final Session session;

    static final class Builder extends com.spotify.music.sociallistening.model.Notification.Builder {
        private Reason reason;
        private Session session;

        Builder() {
        }

        public final com.spotify.music.sociallistening.model.Notification.Builder reason(Reason reason2) {
            if (reason2 != null) {
                this.reason = reason2;
                return this;
            }
            throw new NullPointerException("Null reason");
        }

        public final com.spotify.music.sociallistening.model.Notification.Builder session(Session session2) {
            if (session2 != null) {
                this.session = session2;
                return this;
            }
            throw new NullPointerException("Null session");
        }

        public final Notification build() {
            String str = "";
            if (this.reason == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" reason");
                str = sb.toString();
            }
            if (this.session == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" session");
                str = sb2.toString();
            }
            if (str.isEmpty()) {
                return new AutoValue_Notification(this.reason, this.session);
            }
            StringBuilder sb3 = new StringBuilder("Missing required properties:");
            sb3.append(str);
            throw new IllegalStateException(sb3.toString());
        }
    }

    private AutoValue_Notification(Reason reason2, Session session2) {
        this.reason = reason2;
        this.session = session2;
    }

    @JsonProperty("reason")
    public final Reason reason() {
        return this.reason;
    }

    @JsonProperty("session")
    public final Session session() {
        return this.session;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Notification{reason=");
        sb.append(this.reason);
        sb.append(", session=");
        sb.append(this.session);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Notification) {
            Notification notification = (Notification) obj;
            return this.reason.equals(notification.reason()) && this.session.equals(notification.session());
        }
    }

    public final int hashCode() {
        return ((this.reason.hashCode() ^ 1000003) * 1000003) ^ this.session.hashCode();
    }
}
