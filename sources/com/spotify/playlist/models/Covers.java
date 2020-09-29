package com.spotify.playlist.models;

public interface Covers {

    public enum Size {
        NORMAL,
        SMALL,
        LARGE,
        XLARGE
    }

    String getImageUri(Size size);

    String getLargeUri();

    String getSmallUri();

    String getUri();

    String getXlargeUri();
}
