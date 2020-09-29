package defpackage;

import java.util.List;

/* renamed from: vlf reason: default package */
public interface vlf extends vkz<vlf>, vla {
    boolean canAddToCollection();

    boolean canBan();

    int getAddTime();

    vlg getAddedBy();

    vkt getAlbum();

    List<vku> getArtists();

    int getLength();

    String getName();

    vli getOfflineState();

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
