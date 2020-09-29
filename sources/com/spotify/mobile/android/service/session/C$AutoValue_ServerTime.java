package com.spotify.mobile.android.service.session;

/* renamed from: com.spotify.mobile.android.service.session.$AutoValue_ServerTime reason: invalid class name */
abstract class C$AutoValue_ServerTime extends ServerTime {
    private final long currentServerTime;
    private final long currentTimeMillis;

    C$AutoValue_ServerTime(long j, long j2) {
        this.currentTimeMillis = j;
        this.currentServerTime = j2;
    }

    /* access modifiers changed from: 0000 */
    public long currentServerTime() {
        return this.currentServerTime;
    }

    /* access modifiers changed from: 0000 */
    public long currentTimeMillis() {
        return this.currentTimeMillis;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ServerTime) {
            ServerTime serverTime = (ServerTime) obj;
            if (this.currentTimeMillis == serverTime.currentTimeMillis() && this.currentServerTime == serverTime.currentServerTime()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j = this.currentTimeMillis;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        long j2 = this.currentServerTime;
        return ((int) (j2 ^ (j2 >>> 32))) ^ i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ServerTime{currentTimeMillis=");
        sb.append(this.currentTimeMillis);
        String str = "ees,rtrv ncSeT=uirme";
        sb.append(", currentServerTime=");
        sb.append(this.currentServerTime);
        sb.append("}");
        return sb.toString();
    }
}
