package defpackage;

import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentBundle;

/* renamed from: gww reason: default package */
public final class gww {
    private static final gzq a;
    private static final gzq b;

    public static gzq a(boolean z) {
        return z ? a : b;
    }

    public static boolean a(gzt gzt) {
        return gzt.custom().boolValue("appearDisabled", false);
    }

    static {
        String str = "appearDisabled";
        a = HubsImmutableComponentBundle.builder().a(str, true).a();
        b = HubsImmutableComponentBundle.builder().a(str, false).a();
    }
}
