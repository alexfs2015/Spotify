package defpackage;

import com.spotify.mobile.android.spotlets.ads.model.AdState;

/* renamed from: hwo reason: default package */
public final class hwo implements vua<hxj> {
    private final wlc<gkz> a;

    private hwo(wlc<gkz> wlc) {
        this.a = wlc;
    }

    public static hwo a(wlc<gkz> wlc) {
        return new hwo(wlc);
    }

    public final /* synthetic */ Object get() {
        return (hxj) vuf.a(new hxr(((gkz) this.a.get()).a(AdState.class)), "Cannot return null from a non-@Nullable @Provides method");
    }
}
