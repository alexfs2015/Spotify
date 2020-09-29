package defpackage;

import java.util.List;

/* renamed from: uzc reason: default package */
public interface uzc extends uyw<uzc>, uyx {
    boolean canAddToCollection();

    boolean canBan();

    int getAddTime();

    uzd getAddedBy();

    uyq getAlbum();

    List<uyr> getArtists();

    int getLength();

    String getName();

    uzf getOfflineState();

    boolean hasLyrics();

    boolean inCollection();

    boolean is19plus();

    boolean isAvailableInMetadataCatalogue();

    boolean isBanned();

    boolean isCurrentlyPlayable();

    boolean isExplicit();

    boolean isLocal();

    boolean isPremiumOnly();

    String playableTrackUri();

    String previewId();
}
