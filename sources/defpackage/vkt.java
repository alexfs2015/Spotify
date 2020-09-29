package defpackage;

import com.google.common.collect.ImmutableList;
import com.spotify.playlist.models.Covers;

/* renamed from: vkt reason: default package */
public interface vkt extends vkz<vkt>, vla {
    int getAddTime();

    vku getArtist();

    ImmutableList<vku> getArtists();

    String getCollectionUri();

    String getCopyright();

    Covers getCovers();

    String getName();

    int getNumDiscs();

    int getNumTracks();

    int getNumTracksInCollection();

    vli getOfflineState();

    int getYear();

    boolean isAnyTrackPlayable();

    boolean isSavedToCollection();
}
