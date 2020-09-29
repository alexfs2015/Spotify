package defpackage;

import com.google.common.collect.ImmutableList;
import com.spotify.playlist.models.Covers;

/* renamed from: uyq reason: default package */
public interface uyq extends uyw<uyq>, uyx {
    int getAddTime();

    uyr getArtist();

    ImmutableList<uyr> getArtists();

    String getCollectionUri();

    String getCopyright();

    Covers getCovers();

    String getName();

    int getNumDiscs();

    int getNumTracks();

    int getNumTracksInCollection();

    uzf getOfflineState();

    int getYear();

    boolean isAnyTrackPlayable();

    boolean isSavedToCollection();
}
