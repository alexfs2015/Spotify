package defpackage;

import com.spotify.mobile.android.connect.ConnectManager;

/* renamed from: grd reason: default package */
public final class grd implements vua<a> {
    private final wlc<ConnectManager> a;

    private grd(wlc<ConnectManager> wlc) {
        this.a = wlc;
    }

    public static grd a(wlc<ConnectManager> wlc) {
        return new grd(wlc);
    }

    public final /* synthetic */ Object get() {
        return (a) vuf.a(CC.a((ConnectManager) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
