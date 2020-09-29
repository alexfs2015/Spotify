package com.spotify.mobile.android.hubframework.defaults.components.glue;

import com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate.ImageConfig;
import com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate.ImageConfig.IconSize;
import com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate.ImageConfig.ImageSize;

public enum HubsGlueImageConfig implements ImageConfig {
    THUMBNAIL(IconSize.LARGE, ImageSize.SMALL),
    CARD(IconSize.SMALL, ImageSize.LARGE);
    
    private final IconSize mIconSize;
    private final ImageSize mImageSize;

    private HubsGlueImageConfig(IconSize iconSize, ImageSize imageSize) {
        this.mIconSize = (IconSize) fbp.a(iconSize);
        this.mImageSize = (ImageSize) fbp.a(imageSize);
    }

    public final IconSize a() {
        return this.mIconSize;
    }

    public final ImageSize b() {
        return this.mImageSize;
    }
}
