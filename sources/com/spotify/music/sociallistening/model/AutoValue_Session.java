package com.spotify.music.sociallistening.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

final class AutoValue_Session extends Session {
    private final boolean isSessionOwner;
    private final String joinSessionToken;
    private final String joinSessionUri;
    private final List<Participant> participants;
    private final String sessionId;

    static final class Builder extends com.spotify.music.sociallistening.model.Session.Builder {
        private Boolean isSessionOwner;
        private String joinSessionToken;
        private String joinSessionUri;
        private List<Participant> participants;
        private String sessionId;

        Builder() {
        }

        public final com.spotify.music.sociallistening.model.Session.Builder sessionId(String str) {
            if (str != null) {
                this.sessionId = str;
                return this;
            }
            throw new NullPointerException("Null sessionId");
        }

        public final com.spotify.music.sociallistening.model.Session.Builder joinSessionUri(String str) {
            if (str != null) {
                this.joinSessionUri = str;
                return this;
            }
            throw new NullPointerException("Null joinSessionUri");
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

        public final com.spotify.music.sociallistening.model.Session.Builder participants(List<Participant> list) {
            if (list != null) {
                this.participants = list;
                return this;
            }
            throw new NullPointerException("Null participants");
        }

        public final Session build() {
            String str = "";
            if (this.sessionId == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" sessionId");
                str = sb.toString();
            }
            if (this.joinSessionUri == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" joinSessionUri");
                str = sb2.toString();
            }
            if (this.isSessionOwner == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" isSessionOwner");
                str = sb3.toString();
            }
            if (this.joinSessionToken == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" joinSessionToken");
                str = sb4.toString();
            }
            if (this.participants == null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append(" participants");
                str = sb5.toString();
            }
            if (str.isEmpty()) {
                AutoValue_Session autoValue_Session = new AutoValue_Session(this.sessionId, this.joinSessionUri, this.isSessionOwner.booleanValue(), this.joinSessionToken, this.participants);
                return autoValue_Session;
            }
            StringBuilder sb6 = new StringBuilder("Missing required properties:");
            sb6.append(str);
            throw new IllegalStateException(sb6.toString());
        }
    }

    private AutoValue_Session(String str, String str2, boolean z, String str3, List<Participant> list) {
        this.sessionId = str;
        this.joinSessionUri = str2;
        this.isSessionOwner = z;
        this.joinSessionToken = str3;
        this.participants = list;
    }

    @JsonProperty("session_id")
    public final String sessionId() {
        return this.sessionId;
    }

    @JsonProperty("join_session_uri")
    public final String joinSessionUri() {
        return this.joinSessionUri;
    }

    @JsonProperty("is_session_owner")
    public final boolean isSessionOwner() {
        return this.isSessionOwner;
    }

    @JsonProperty("join_session_token")
    public final String joinSessionToken() {
        return this.joinSessionToken;
    }

    @JsonProperty("participants")
    public final List<Participant> participants() {
        return this.participants;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Session{sessionId=");
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

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Session) {
            Session session = (Session) obj;
            return this.sessionId.equals(session.sessionId()) && this.joinSessionUri.equals(session.joinSessionUri()) && this.isSessionOwner == session.isSessionOwner() && this.joinSessionToken.equals(session.joinSessionToken()) && this.participants.equals(session.participants());
        }
    }

    public final int hashCode() {
        return ((((((((this.sessionId.hashCode() ^ 1000003) * 1000003) ^ this.joinSessionUri.hashCode()) * 1000003) ^ (this.isSessionOwner ? 1231 : 1237)) * 1000003) ^ this.joinSessionToken.hashCode()) * 1000003) ^ this.participants.hashCode();
    }
}
