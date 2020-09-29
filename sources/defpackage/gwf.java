package defpackage;

import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentBundle;

/* renamed from: gwf reason: default package */
public final class gwf {
    private static final gzq a;
    private static final gzq b;

    public static gzq a(boolean z) {
        return b;
    }

    public static boolean a(gzt gzt) {
        return gzt.custom().boolValue("hubs:contextmenu", false);
    }

    public static boolean b(gzt gzt) {
        return gzt.custom().boolValue("hubs:contextmenu") != null;
    }

    static {
        String str = "hubs:contextmenu";
        a = HubsImmutableComponentBundle.builder().a(str, true).a();
        b = HubsImmutableComponentBundle.builder().a(str, false).a();
    }
}
