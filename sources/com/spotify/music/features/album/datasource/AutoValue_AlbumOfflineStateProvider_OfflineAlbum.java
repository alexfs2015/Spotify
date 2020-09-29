package com.spotify.music.features.album.datasource;

import com.spotify.music.features.album.datasource.AlbumOfflineStateProvider.OfflineAlbum;

final class AutoValue_AlbumOfflineStateProvider_OfflineAlbum extends OfflineAlbum {
    private final String collectionUri;
    private final boolean completeInCollection;
    private final boolean inferredOffline;
    private final uzf inferredOfflineState;
    private final int numTracksInCollection;
    private final String offline;
    private final uzf offlineState;
    private final int syncProgress;

    AutoValue_AlbumOfflineStateProvider_OfflineAlbum(String str, String str2, boolean z, int i, uzf uzf, uzf uzf2, boolean z2, int i2) {
        if (str != null) {
            this.collectionUri = str;
            if (str2 != null) {
                this.offline = str2;
                this.inferredOffline = z;
                this.syncProgress = i;
                if (uzf != null) {
                    this.offlineState = uzf;
                    if (uzf2 != null) {
                        this.inferredOfflineState = uzf2;
                        this.completeInCollection = z2;
                        this.numTracksInCollection = i2;
                        return;
                    }
                    throw new NullPointerException("Null inferredOfflineState");
                }
                throw new NullPointerException("Null offlineState");
            }
            throw new NullPointerException("Null offline");
        }
        throw new NullPointerException("Null collectionUri");
    }

    public final String getCollectionUri() {
        return this.collectionUri;
    }

    @Deprecated
    public final String getOffline() {
        return this.offline;
    }

    @Deprecated
    public final boolean isInferredOffline() {
        return this.inferredOffline;
    }

    @Deprecated
    public final int getSyncProgress() {
        return this.syncProgress;
    }

    public final uzf getOfflineState() {
        return this.offlineState;
    }

    public final uzf getInferredOfflineState() {
        return this.inferredOfflineState;
    }

    public final boolean isCompleteInCollection() {
        return this.completeInCollection;
    }

    public final int getNumTracksInCollection() {
        return this.numTracksInCollection;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OfflineAlbum{collectionUri=");
        sb.append(this.collectionUri);
        sb.append(", offline=");
        sb.append(this.offline);
        sb.append(", inferredOffline=");
        sb.append(this.inferredOffline);
        sb.append(", syncProgress=");
        sb.append(this.syncProgress);
        sb.append(", offlineState=");
        sb.append(this.offlineState);
        sb.append(", inferredOfflineState=");
        sb.append(this.inferredOfflineState);
        sb.append(", completeInCollection=");
        sb.append(this.completeInCollection);
        sb.append(", numTracksInCollection=");
        sb.append(this.numTracksInCollection);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof OfflineAlbum) {
            OfflineAlbum offlineAlbum = (OfflineAlbum) obj;
            return this.collectionUri.equals(offlineAlbum.getCollectionUri()) && this.offline.equals(offlineAlbum.getOffline()) && this.inferredOffline == offlineAlbum.isInferredOffline() && this.syncProgress == offlineAlbum.getSyncProgress() && this.offlineState.equals(offlineAlbum.getOfflineState()) && this.inferredOfflineState.equals(offlineAlbum.getInferredOfflineState()) && this.completeInCollection == offlineAlbum.isCompleteInCollection() && this.numTracksInCollection == offlineAlbum.getNumTracksInCollection();
        }
    }

    public final int hashCode() {
        int i = 1231;
        int hashCode = (((((((((((this.collectionUri.hashCode() ^ 1000003) * 1000003) ^ this.offline.hashCode()) * 1000003) ^ (this.inferredOffline ? 1231 : 1237)) * 1000003) ^ this.syncProgress) * 1000003) ^ this.offlineState.hashCode()) * 1000003) ^ this.inferredOfflineState.hashCode()) * 1000003;
        if (!this.completeInCollection) {
            i = 1237;
        }
        return ((hashCode ^ i) * 1000003) ^ this.numTracksInCollection;
    }
}
