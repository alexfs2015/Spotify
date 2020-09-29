package com.spotify.mobile.android.hubframework.defaults;

import com.google.common.collect.ImmutableSet;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.hubframework.defaults.components.custom.HubsGlueImageSettings;
import com.spotify.mobile.android.hubframework.defaults.components.custom.HubsGlueImageSettings.Style;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueCard;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueRow;

@Deprecated
public final class HubsGlueEntityDecorator implements guo {
    private static final ImmutableSet<String> a = ImmutableSet.b(HubsGlueCard.ENTITY.id(), HubsGlueRow.ENTITY.id());

    enum AllowedLabel {
        EXPLICIT,
        PREMIUM;

        static class a {
            /* access modifiers changed from: private */
            public static final gbg<AllowedLabel> a = null;

            static {
                a = gbg.a(AllowedLabel.class);
            }
        }
    }

    public final gzt decorate(gzt gzt) {
        Style style;
        if (!a.contains(gzt.componentId().id())) {
            return gzt;
        }
        gzy target = gzt.target();
        gzw main = gzt.images().main();
        if (!(target == null || main == null || (main.placeholder() != null && HubsGlueImageSettings.a(main)))) {
            String uri = target.uri();
            SpotifyIconV2 spotifyIconV2 = null;
            if (uri != null) {
                spotifyIconV2 = gxs.b(uri);
                style = gxs.a(uri);
            } else {
                style = null;
            }
            a builder = main.toBuilder();
            if (main.placeholder() == null) {
                builder = builder.a((Enum<?>) spotifyIconV2);
            }
            if (style != null && !HubsGlueImageSettings.a(main)) {
                builder = builder.b(style.mSetting);
            }
            gzt = gzt.toBuilder().a(gzt.images().toBuilder().a(builder.a())).a();
        }
        String str = "label";
        AllowedLabel allowedLabel = (AllowedLabel) a.a.a(gzt.custom().string(str)).d();
        return gzt.toBuilder().c(str, allowedLabel != null ? allowedLabel.name() : "").a();
    }
}
