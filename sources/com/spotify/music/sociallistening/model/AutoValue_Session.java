package com.spotify.music.sociallistening.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

final class AutoValue_Session extends Session {
    private final boolean isSessionOwner;
    private final String joinSessionToken;
    private final String joinSessionUri;
    private final List<Participant> participants;
    private final String sessionId;
    private final long timestamp;

    static final class Builder extends com.spotify.music.sociallistening.model.Session.Builder {
        private Boolean isSessionOwner;
        private String joinSessionToken;
        private String joinSessionUri;
        private List<Participant> participants;
        private String sessionId;
        private Long timestamp;

        Builder() {
        }

        private Builder(Session session) {
            this.timestamp = Long.valueOf(session.timestamp());
            this.sessionId = session.sessionId();
            this.joinSessionUri = session.joinSessionUri();
            this.isSessionOwner = Boolean.valueOf(session.isSessionOwner());
            this.joinSessionToken = session.joinSessionToken();
            this.participants = session.participants();
        }

        public final Session build() {
            String str = "";
            if (this.timestamp == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" timestamp");
                str = sb.toString();
            }
            if (this.sessionId == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" sessionId");
                str = sb2.toString();
            }
            if (this.joinSessionUri == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" joinSessionUri");
                str = sb3.toString();
            }
            if (this.isSessionOwner == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" isSessionOwner");
                str = sb4.toString();
            }
            if (this.joinSessionToken == null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append(" joinSessionToken");
                str = sb5.toString();
            }
            if (this.participants == null) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append(str);
                sb6.append(" participants");
                str = sb6.toString();
            }
            if (str.isEmpty()) {
                AutoValue_Session autoValue_Session = new AutoValue_Session(this.timestamp.longValue(), this.sessionId, this.joinSessionUri, this.isSessionOwner.booleanValue(), this.joinSessionToken, this.participants);
                return autoValue_Session;
            }
            StringBuilder sb7 = new StringBuilder("Missing required properties:");
            sb7.append(str);
            throw new IllegalStateException(sb7.toString());
        }

        public final com.spotify.music.sociallistening.model.Session.Builder isSessionOwner(boolean z) {
            this.isSessionOwner = Boolean.valueOf(z);
            return this;
        }

        public final com.spotify.music.sociallistening.model.Session.Builder joinSessionToken(String str) {
            if (str != null) {
                this.joinSessionToken = str;
                return this;
            }
            throw new NullPointerException("Null joinSessionToken");
        }

        public final com.spotify.music.sociallistening.model.Session.Builder joinSessionUri(String str) {
            if (str != null) {
                this.joinSessionUri = str;
                return this;
            }
            throw new NullPointerException("Null joinSessionUri");
        }

        public final com.spotify.music.sociallistening.model.Session.Builder participants(List<Participant> list) {
            if (list != null) {
                this.participants = list;
                return this;
            }
            throw new NullPointerException("Null participants");
        }

        public final com.spotify.music.sociallistening.model.Session.Builder sessionId(String str) {
            if (str != null) {
                this.sessionId = str;
                return this;
            }
            throw new NullPointerException("Null sessionId");
        }

        public final com.spotify.music.sociallistening.model.Session.Builder timestamp(long j) {
            this.timestamp = Long.valueOf(j);
            return this;
        }
    }

    private AutoValue_Session(long j, String str, String str2, boolean z, String str3, List<Participant> list) {
        this.timestamp = j;
        this.sessionId = str;
        this.joinSessionUri = str2;
        this.isSessionOwner = z;
        this.joinSessionToken = str3;
        this.participants = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Session) {
            Session session = (Session) obj;
            return this.timestamp == session.timestamp() && this.sessionId.equals(session.sessionId()) && this.joinSessionUri.equals(session.joinSessionUri()) && this.isSessionOwner == session.isSessionOwner() && this.joinSessionToken.equals(session.joinSessionToken()) && this.participants.equals(session.participants());
        }
    }

    public final int hashCode() {
        long j = this.timestamp;
        return this.participants.hashCode() ^ ((((((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.sessionId.hashCode()) * 1000003) ^ this.joinSessionUri.hashCode()) * 1000003) ^ (this.isSessionOwner ? 1231 : 1237)) * 1000003) ^ this.joinSessionToken.hashCode()) * 1000003);
    }

    @JsonProperty("is_session_owner")
    public final boolean isSessionOwner() {
        return this.isSessionOwner;
    }

    @JsonProperty("join_session_token")
    public final String joinSessionToken() {
        return this.joinSessionToken;
    }

    @JsonProperty("join_session_uri")
    public final String joinSessionUri() {
        return this.joinSessionUri;
    }

    @JsonProperty("participants")
    public final List<Participant> participants() {
        return this.participants;
    }

    @JsonProperty("session_id")
    public final String sessionId() {
        return this.sessionId;
    }

    @JsonProperty("timestamp")
    public final long timestamp() {
        return this.timestamp;
    }

    public final com.spotify.music.sociallistening.model.Session.Builder toBuilder() {
        return new Builder(this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Session{timestamp=");
        sb.append(this.timestamp);
        sb.append(", sessionId=");
        sb.append(this.sessionId);
        sb.append(", joinSessionUri=");
        sb.append(this.joinSessionUri);
        sb.append(", isSessionOwner=");
        sb.append(this.isSessionOwner);
        sb.append(", joinSessionToken=");
        sb.append(this.joinSessionToken);
        sb.append(", participants=");
        sb.append(this.participants);
        sb.append("}");
        return sb.toString();
    }
}
