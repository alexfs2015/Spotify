package defpackage;

import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentBundle;

/* renamed from: gzg reason: default package */
public final class gzg {
    private static final hcj a;
    private static final hcj b;

    static {
        String str = "appearDisabled";
        a = HubsImmutableComponentBundle.builder().a(str, true).a();
        b = HubsImmutableComponentBundle.builder().a(str, false).a();
    }

    public static hcj a(boolean z) {
        return z ? a : b;
    }

    public static boolean a(hcm hcm) {
        return hcm.custom().boolValue("appearDisabled", false);
    }
}
