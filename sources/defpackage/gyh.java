package defpackage;

import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentBundle;

/* renamed from: gyh reason: default package */
public final class gyh {
    static {
        HubsImmutableComponentBundle.builder().a("glue.split.landscape", true).a();
    }

    public static boolean a(hcs hcs) {
        return hcs.custom().boolValue("glue.split.landscape", false);
    }
}
