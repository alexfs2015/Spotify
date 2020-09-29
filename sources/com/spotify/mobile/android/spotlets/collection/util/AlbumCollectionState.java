package com.spotify.mobile.android.spotlets.collection.util;

public enum AlbumCollectionState {
    YES,
    PARTIALLY,
    NO;

    public static AlbumCollectionState a(int i, boolean z) {
        if (i > 0) {
            return z ? YES : PARTIALLY;
        }
        return NO;
    }
}
