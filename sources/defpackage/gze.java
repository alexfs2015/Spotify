package defpackage;

import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentBundle;

/* renamed from: gze reason: default package */
public final class gze {
    static {
        String str = "hubs:glue:muted";
        HubsImmutableComponentBundle.builder().a(str, true).a();
        HubsImmutableComponentBundle.builder().a(str, false).a();
    }

    public static boolean a(hcm hcm) {
        return hcm.custom().boolValue("hubs:glue:muted", false);
    }
}
