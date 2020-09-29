package com.spotify.music.sociallistening.model;

import com.fasterxml.jackson.annotation.JsonProperty;

final class AutoValue_HostSession extends HostSession {
    private final String accessToken;
    private final String joinSessionUri;
    private final Session session;
    private final String sessionId;

    static final class Builder extends com.spotify.music.sociallistening.model.HostSession.Builder {
        private String accessToken;
        private String joinSessionUri;
        private Session session;
        private String sessionId;

        Builder() {
        }

        public final com.spotify.music.sociallistening.model.HostSession.Builder accessToken(String str) {
            if (str != null) {
                this.accessToken = str;
                return this;
            }
            throw new NullPointerException("Null accessToken");
        }

        public final HostSession build() {
            String str = "";
            if (this.sessionId == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" sessionId");
                str = sb.toString();
            }
            if (this.accessToken == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" accessToken");
                str = sb2.toString();
            }
            if (this.joinSessionUri == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" joinSessionUri");
                str = sb3.toString();
            }
            if (this.session == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" session");
                str = sb4.toString();
            }
            if (str.isEmpty()) {
                AutoValue_HostSession autoValue_HostSession = new AutoValue_HostSession(this.sessionId, this.accessToken, this.joinSessionUri, this.session);
                return autoValue_HostSession;
            }
            StringBuilder sb5 = new StringBuilder("Missing required properties:");
            sb5.append(str);
            throw new IllegalStateException(sb5.toString());
        }

        public final com.spotify.music.sociallistening.model.HostSession.Builder joinSessionUri(String str) {
            if (str != null) {
                this.joinSessionUri = str;
                return this;
            }
            throw new NullPointerException("Null joinSessionUri");
        }

        public final com.spotify.music.sociallistening.model.HostSession.Builder session(Session session2) {
            if (session2 != null) {
                this.session = session2;
                return this;
            }
            throw new NullPointerException("Null session");
        }

        public final com.spotify.music.sociallistening.model.HostSession.Builder sessionId(String str) {
            if (str != null) {
                this.sessionId = str;
                return this;
            }
            throw new NullPointerException("Null sessionId");
        }
    }

    private AutoValue_HostSession(String str, String str2, String str3, Session session2) {
        this.sessionId = str;
        this.accessToken = str2;
        this.joinSessionUri = str3;
        this.session = session2;
    }

    @JsonProperty("access_token")
    public final String accessToken() {
        return this.accessToken;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof HostSession) {
            HostSession hostSession = (HostSession) obj;
            return this.sessionId.equals(hostSession.sessionId()) && this.accessToken.equals(hostSession.accessToken()) && this.joinSessionUri.equals(hostSession.joinSessionUri()) && this.session.equals(hostSession.session());
        }
    }

    public final int hashCode() {
        return ((((((this.sessionId.hashCode() ^ 1000003) * 1000003) ^ this.accessToken.hashCode()) * 1000003) ^ this.joinSessionUri.hashCode()) * 1000003) ^ this.session.hashCode();
    }

    @JsonProperty("join_session_uri")
    public final String joinSessionUri() {
        return this.joinSessionUri;
    }

    @JsonProperty("session")
    public final Session session() {
        return this.session;
    }

    @JsonProperty("session_id")
    public final String sessionId() {
        return this.sessionId;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HostSession{sessionId=");
        sb.append(this.sessionId);
        sb.append(", accessToken=");
        sb.append(this.accessToken);
        sb.append(", joinSessionUri=");
        sb.append(this.joinSessionUri);
        sb.append(", session=");
        sb.append(this.session);
        sb.append("}");
        return sb.toString();
    }
}
