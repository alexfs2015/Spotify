package com.spotify.mobile.android.hubframework.defaults;

import com.google.common.collect.ImmutableSet;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.hubframework.defaults.components.custom.HubsGlueImageSettings;
import com.spotify.mobile.android.hubframework.defaults.components.custom.HubsGlueImageSettings.Style;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueCard;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueRow;

@Deprecated
public final class HubsGlueEntityDecorator implements gwo {
    private static final ImmutableSet<String> a = ImmutableSet.b(HubsGlueCard.ENTITY.id(), HubsGlueRow.ENTITY.id());

    enum AllowedLabel {
        EXPLICIT,
        PREMIUM;

        static class a {
            /* access modifiers changed from: private */
            public static final gce<AllowedLabel> a = null;

            static {
                a = gce.a(AllowedLabel.class);
            }
        }
    }

    public final hcm decorate(hcm hcm) {
        String str;
        Style style;
        if (a.contains(hcm.componentId().id())) {
            hcr target = hcm.target();
            hcp main = hcm.images().main();
            if (!(target == null || main == null || (main.placeholder() != null && HubsGlueImageSettings.a(main)))) {
                String uri = target.uri();
                SpotifyIconV2 spotifyIconV2 = null;
                if (uri != null) {
                    spotifyIconV2 = hal.b(uri);
                    style = hal.a(uri);
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
                hcm = hcm.toBuilder().a(hcm.images().toBuilder().a(builder.a())).a();
            }
            String str2 = "label";
            AllowedLabel allowedLabel = (AllowedLabel) a.a.a(hcm.custom().string(str2)).d();
            a builder2 = hcm.toBuilder();
            if (allowedLabel != null) {
                str = allowedLabel.name();
            } else {
                String str3 = "";
                str = "";
            }
            hcm = builder2.c(str2, str).a();
        }
        return hcm;
    }
}
