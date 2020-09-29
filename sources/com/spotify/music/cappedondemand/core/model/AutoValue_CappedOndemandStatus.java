package com.spotify.music.cappedondemand.core.model;

final class AutoValue_CappedOndemandStatus extends CappedOndemandStatus {
    private final Long countdownTillRefill;
    private final boolean ondemand;
    private final long timestamp;

    AutoValue_CappedOndemandStatus(boolean z, long j, Long l) {
        this.ondemand = z;
        this.timestamp = j;
        if (l != null) {
            this.countdownTillRefill = l;
            return;
        }
        throw new NullPointerException("Null countdownTillRefill");
    }

    public final Long countdownTillRefill() {
        return this.countdownTillRefill;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CappedOndemandStatus) {
            CappedOndemandStatus cappedOndemandStatus = (CappedOndemandStatus) obj;
            return this.ondemand == cappedOndemandStatus.ondemand() && this.timestamp == cappedOndemandStatus.timestamp() && this.countdownTillRefill.equals(cappedOndemandStatus.countdownTillRefill());
        }
    }

    public final int hashCode() {
        int i = ((this.ondemand ? 1231 : 1237) ^ 1000003) * 1000003;
        long j = this.timestamp;
        return ((i ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.countdownTillRefill.hashCode();
    }

    public final boolean ondemand() {
        return this.ondemand;
    }

    public final long timestamp() {
        return this.timestamp;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CappedOndemandStatus{ondemand=");
        sb.append(this.ondemand);
        sb.append(", timestamp=");
        sb.append(this.timestamp);
        sb.append(", countdownTillRefill=");
        sb.append(this.countdownTillRefill);
        sb.append("}");
        return sb.toString();
    }
}
