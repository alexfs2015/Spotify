package com.spotify.music.features.payfail;

public abstract class BannerModel {

    public enum Content {
        NONE,
        GENERIC,
        DOWNLOAD,
        PREMIUM_BENEFITS
    }

    protected BannerModel() {
    }

    public static BannerModel a(Content content, int i) {
        return new ogv(content, i);
    }

    public abstract Content a();

    public abstract int b();
}
