package defpackage;

import com.spotify.mobile.android.spotlets.ads.model.AdState;

/* renamed from: hza reason: default package */
public final class hza implements wig<hzv> {
    private final wzi<gmn> a;

    private hza(wzi<gmn> wzi) {
        this.a = wzi;
    }

    public static hza a(wzi<gmn> wzi) {
        return new hza(wzi);
    }

    public final /* synthetic */ Object get() {
        return (hzv) wil.a(new iad(((gmn) this.a.get()).a(AdState.class)), "Cannot return null from a non-@Nullable @Provides method");
    }
}
