package com.spotify.music.features.payfail;

public abstract class BannerModel {

    public enum Content {
        NONE,
        GENERIC,
        DOWNLOAD,
        PREMIUM_BENEFITS
    }

    public abstract Content a();

    public abstract int b();

    protected BannerModel() {
    }

    public static BannerModel a(Content content, int i) {
        return new oad(content, i);
    }
}
