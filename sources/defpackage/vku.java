package defpackage;

import com.spotify.playlist.models.Covers;

/* renamed from: vku reason: default package */
public interface vku extends vkz<vku>, vla {
    int getAddTime();

    String getCollectionUri();

    Covers getCovers();

    String getName();

    int getNumAlbumsInCollection();

    int getNumTracksInCollection();

    vli getOfflineState();

    boolean isDismissed();

    boolean isFollowed();

    boolean isVariousArtists();
}
