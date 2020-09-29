package com.spotify.mobile.android.spotlets.collection.util;

public enum AlbumCollectionState {
    YES,
    PARTIALLY,
    NO;

    public static AlbumCollectionState a(int i, boolean z) {
        return i > 0 ? z ? YES : PARTIALLY : NO;
    }
}
