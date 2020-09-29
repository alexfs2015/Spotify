package com.spotify.music.features.listeninghistory.model;

import java.util.List;

/* renamed from: com.spotify.music.features.listeninghistory.model.$AutoValue_Session reason: invalid class name */
abstract class C$AutoValue_Session extends Session {
    private final List<Track> session;
    private final String sessionEndTime;
    private final String sessionStartTime;

    /* renamed from: com.spotify.music.features.listeninghistory.model.$AutoValue_Session$a */
    static final class a implements com.spotify.music.features.listeninghistory.model.Session.a {
        private List<Track> a;
        private String b;
        private String c;

        a() {
        }

        private a(Session session) {
            this.a = session.getSession();
            this.b = session.getSessionEndTime();
            this.c = session.getSessionStartTime();
        }

        /* synthetic */ a(Session session, byte b2) {
            this(session);
        }
    }

    C$AutoValue_Session(List<Track> list, String str, String str2) {
        if (list != null) {
            this.session = list;
            if (str != null) {
                this.sessionEndTime = str;
                if (str2 != null) {
                    this.sessionStartTime = str2;
                    return;
                }
                throw new NullPointerException("Null sessionStartTime");
            }
            throw new NullPointerException("Null sessionEndTime");
        }
        throw new NullPointerException("Null session");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Session) {
            Session session2 = (Session) obj;
            return this.session.equals(session2.getSession()) && this.sessionEndTime.equals(session2.getSessionEndTime()) && this.sessionStartTime.equals(session2.getSessionStartTime());
        }
    }

    public List<Track> getSession() {
        return this.session;
    }

    public String getSessionEndTime() {
        return this.sessionEndTime;
    }

    public String getSessionStartTime() {
        return this.sessionStartTime;
    }

    public int hashCode() {
        return ((((this.session.hashCode() ^ 1000003) * 1000003) ^ this.sessionEndTime.hashCode()) * 1000003) ^ this.sessionStartTime.hashCode();
    }

    public com.spotify.music.features.listeninghistory.model.Session.a toBuilder() {
        return new a(this, 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Session{session=");
        sb.append(this.session);
        sb.append(", sessionEndTime=");
        sb.append(this.sessionEndTime);
        sb.append(", sessionStartTime=");
        sb.append(this.sessionStartTime);
        sb.append("}");
        return sb.toString();
    }
}
