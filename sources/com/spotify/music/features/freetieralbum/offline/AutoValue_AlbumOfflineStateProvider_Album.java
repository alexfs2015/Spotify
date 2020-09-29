package com.spotify.music.features.freetieralbum.offline;

import com.spotify.music.features.freetieralbum.offline.AlbumOfflineStateProvider.Album;

final class AutoValue_AlbumOfflineStateProvider_Album extends Album {
    private final String collectionUri;
    private final boolean completeInCollection;
    private final vli inferredOfflineState;
    private final int numTracksInCollection;
    private final vli offlineState;

    AutoValue_AlbumOfflineStateProvider_Album(String str, vli vli, vli vli2, boolean z, int i) {
        if (str != null) {
            this.collectionUri = str;
            if (vli != null) {
                this.offlineState = vli;
                if (vli2 != null) {
                    this.inferredOfflineState = vli2;
                    this.completeInCollection = z;
                    this.numTracksInCollection = i;
                    return;
                }
                throw new NullPointerException("Null inferredOfflineState");
            }
            throw new NullPointerException("Null offlineState");
        }
        throw new NullPointerException("Null collectionUri");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Album) {
            Album album = (Album) obj;
            return this.collectionUri.equals(album.getCollectionUri()) && this.offlineState.equals(album.getOfflineState()) && this.inferredOfflineState.equals(album.getInferredOfflineState()) && this.completeInCollection == album.isCompleteInCollection() && this.numTracksInCollection == album.getNumTracksInCollection();
        }
    }

    public final String getCollectionUri() {
        return this.collectionUri;
    }

    public final vli getInferredOfflineState() {
        return this.inferredOfflineState;
    }

    public final int getNumTracksInCollection() {
        return this.numTracksInCollection;
    }

    public final vli getOfflineState() {
        return this.offlineState;
    }

    public final int hashCode() {
        return ((((((((this.collectionUri.hashCode() ^ 1000003) * 1000003) ^ this.offlineState.hashCode()) * 1000003) ^ this.inferredOfflineState.hashCode()) * 1000003) ^ (this.completeInCollection ? 1231 : 1237)) * 1000003) ^ this.numTracksInCollection;
    }

    public final boolean isCompleteInCollection() {
        return this.completeInCollection;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Album{collectionUri=");
        sb.append(this.collectionUri);
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
}
