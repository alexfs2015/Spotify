package com.spotify.music.features.playlistentity.configuration;

public interface LicenseLayoutProvider {

    public enum LicenseLayout {
        ON_DEMAND_WHEN_FREE_JUMPIN,
        ON_DEMAND_WHEN_FREE_NO_RESTRICTIONS,
        ON_DEMAND_WHEN_FREE_TFT,
        SHUFFLE_WHEN_FREE,
        MIXED_ON_DEMAND_WHEN_FREE,
        PREVIEWS_WHEN_FREE,
        ON_DEMAND_WHEN_PREMIUM
    }

    LicenseLayout a();
}
