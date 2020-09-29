package com.spotify.music.features.listeninghistory.model;

import java.util.List;

/* renamed from: com.spotify.music.features.listeninghistory.model.$AutoValue_UserListeningHistoryWrapper reason: invalid class name */
abstract class C$AutoValue_UserListeningHistoryWrapper extends UserListeningHistoryWrapper {
    private final long lastSessionEndTime;
    private final List<Session> sessionList;

    C$AutoValue_UserListeningHistoryWrapper(List<Session> list, long j) {
        if (list != null) {
            this.sessionList = list;
            this.lastSessionEndTime = j;
            return;
        }
        throw new NullPointerException("Null sessionList");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof UserListeningHistoryWrapper) {
            UserListeningHistoryWrapper userListeningHistoryWrapper = (UserListeningHistoryWrapper) obj;
            return this.sessionList.equals(userListeningHistoryWrapper.getSessionList()) && this.lastSessionEndTime == userListeningHistoryWrapper.getLastSessionEndTime();
        }
    }

    public long getLastSessionEndTime() {
        return this.lastSessionEndTime;
    }

    public List<Session> getSessionList() {
        return this.sessionList;
    }

    public int hashCode() {
        int hashCode = (this.sessionList.hashCode() ^ 1000003) * 1000003;
        long j = this.lastSessionEndTime;
        return hashCode ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("UserListeningHistoryWrapper{sessionList=");
        sb.append(this.sessionList);
        sb.append(", lastSessionEndTime=");
        sb.append(this.lastSessionEndTime);
        sb.append("}");
        return sb.toString();
    }
}
