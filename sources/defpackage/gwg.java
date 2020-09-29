package defpackage;

import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentBundle;

/* renamed from: gwg reason: default package */
public final class gwg {
    public static boolean a(gzz gzz) {
        return gzz.custom().boolValue("glue.split.landscape", false);
    }

    static {
        HubsImmutableComponentBundle.builder().a("glue.split.landscape", true).a();
    }
}
