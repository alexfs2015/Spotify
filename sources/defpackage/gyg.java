package defpackage;

import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentBundle;

/* renamed from: gyg reason: default package */
public final class gyg {
    private static final hcj a;
    private static final hcj b;

    static {
        String str = "hubs:contextmenu";
        a = HubsImmutableComponentBundle.builder().a(str, true).a();
        b = HubsImmutableComponentBundle.builder().a(str, false).a();
    }

    public static hcj a(boolean z) {
        return b;
    }

    public static boolean a(hcm hcm) {
        return hcm.custom().boolValue("hubs:contextmenu", false);
    }

    public static boolean b(hcm hcm) {
        return hcm.custom().boolValue("hubs:contextmenu") != null;
    }
}
