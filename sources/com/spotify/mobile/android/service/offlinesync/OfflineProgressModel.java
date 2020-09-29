package com.spotify.mobile.android.service.offlinesync;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonRootName("progress")
public final class OfflineProgressModel implements JacksonModel {
    public static final String OFFLINE_PROGRESS_URI = "sp://offline/v1/progress/total";
    private final float mPercentComplete;
    private final int mQueuedTracks;
    private final int mSyncedTracks;
    private final boolean mSyncing;

    public OfflineProgressModel(@JsonProperty("queued_tracks") int i, @JsonProperty("synced_tracks") int i2, @JsonProperty("syncing") boolean z, @JsonProperty("percent_complete") float f) {
        this.mQueuedTracks = i;
        this.mSyncedTracks = i2;
        this.mSyncing = z;
        this.mPercentComplete = f;
    }

    public static OfflineProgressModel create(int i, int i2, boolean z) {
        return new OfflineProgressModel(i, i2, z, ((float) i2) / Math.max((float) (i2 + i), 1.0f));
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!OfflineProgressModel.class.isAssignableFrom(obj.getClass())) {
            return false;
        }
        OfflineProgressModel offlineProgressModel = (OfflineProgressModel) obj;
        return offlineProgressModel.getQueuedTracks() == getQueuedTracks() && offlineProgressModel.isSyncing() == isSyncing() && offlineProgressModel.getSyncedTracks() == getSyncedTracks();
    }

    @JsonProperty("percent_complete")
    public final float getPercentComplete() {
        return this.mPercentComplete;
    }

    @JsonProperty("queued_tracks")
    public final int getQueuedTracks() {
        return this.mQueuedTracks;
    }

    @JsonProperty("synced_tracks")
    public final int getSyncedTracks() {
        return this.mSyncedTracks;
    }

    public final int getTotalTracks() {
        return getSyncedTracks() + getQueuedTracks();
    }

    public final int hashCode() {
        return (getTotalTracks() * 100) + (getSyncedTracks() * 10) + (isSyncing() ? 1 : 0);
    }

    @JsonProperty("syncing")
    public final boolean isSyncing() {
        return this.mSyncing;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OfflineProgressModel{mQueuedTracks=");
        sb.append(this.mQueuedTracks);
        sb.append(", mSyncedTracks=");
        sb.append(this.mSyncedTracks);
        String str = ",ys igmnnSc";
        sb.append(", mSyncing=");
        sb.append(this.mSyncing);
        String str2 = "rPemmtcCp eomleet=,";
        sb.append(", mPercentComplete=");
        sb.append(this.mPercentComplete);
        sb.append('}');
        return sb.toString();
    }
}
