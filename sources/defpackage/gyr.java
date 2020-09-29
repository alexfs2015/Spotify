package defpackage;

import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentBundle;

/* renamed from: gyr reason: default package */
public final class gyr {
    private static final hcj a;
    private static final hcj b;

    static {
        String str = "disabled";
        a = HubsImmutableComponentBundle.builder().a(str, true).a();
        b = HubsImmutableComponentBundle.builder().a(str, false).a();
    }

    public static hcj a(boolean z) {
        return a;
    }

    public static boolean a(hcm hcm) {
        return hcm.custom().boolValue("disabled", false);
    }
}
