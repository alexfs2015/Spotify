package com.spotify.mobile.android.hubframework.defaults;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import com.squareup.picasso.Picasso;

public interface HubsGlueImageDelegate {

    public interface ImageConfig {

        public enum IconSize {
            X_SMALL,
            SMALL,
            MEDIUM,
            LARGE
        }

        public enum ImageSize {
            SMALL,
            MEDIUM,
            LARGE
        }

        IconSize a();

        ImageSize b();
    }

    Drawable a(String str, ImageConfig imageConfig);

    Uri a(String str);

    har a();

    void a(ImageView imageView);

    void a(ImageView imageView, hcp hcp, ImageConfig imageConfig);

    void a(ImageView imageView, String str);

    @Deprecated
    Picasso b();
}
