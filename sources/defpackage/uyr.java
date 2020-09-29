package defpackage;

import com.spotify.playlist.models.Covers;

/* renamed from: uyr reason: default package */
public interface uyr extends uyw<uyr>, uyx {
    int getAddTime();

    String getCollectionUri();

    Covers getCovers();

    String getName();

    int getNumAlbumsInCollection();

    int getNumTracksInCollection();

    uzf getOfflineState();

    boolean isDismissed();

    boolean isFollowed();

    boolean isVariousArtists();
}
