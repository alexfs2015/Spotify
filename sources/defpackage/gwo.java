package defpackage;

import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentBundle;

/* renamed from: gwo reason: default package */
public final class gwo {
    private static final gzq a;
    private static final gzq b;

    public static gzq a(boolean z) {
        return a;
    }

    public static boolean a(gzt gzt) {
        return gzt.custom().boolValue("disabled", false);
    }

    static {
        String str = "disabled";
        a = HubsImmutableComponentBundle.builder().a(str, true).a();
        b = HubsImmutableComponentBundle.builder().a(str, false).a();
    }
}
