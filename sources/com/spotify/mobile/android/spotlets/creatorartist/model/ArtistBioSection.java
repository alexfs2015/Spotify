package com.spotify.mobile.android.spotlets.creatorartist.model;

public enum ArtistBioSection {
    GALLERY(0),
    MONTHLY_LISTENERS(1),
    BIOGRAPHY(2),
    AUTOBIOGRAPHY(3),
    SOCIAL_LINKS(4);
    
    public final int mSectionId;

    private ArtistBioSection(int i) {
        this.mSectionId = i;
    }
}
