package defpackage;

import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentBundle;

/* renamed from: gwu reason: default package */
public final class gwu {
    public static boolean a(gzt gzt) {
        return gzt.custom().boolValue("hubs:glue:muted", false);
    }

    static {
        String str = "hubs:glue:muted";
        HubsImmutableComponentBundle.builder().a(str, true).a();
        HubsImmutableComponentBundle.builder().a(str, false).a();
    }
}
