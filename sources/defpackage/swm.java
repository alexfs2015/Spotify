package defpackage;

import com.spotify.mobile.android.spotlets.ads.model.Ad;
import io.reactivex.Flowable;

/* renamed from: swm reason: default package */
public final class swm implements vua<Flowable<Ad>> {
    private final wlc<swp> a;

    private swm(wlc<swp> wlc) {
        this.a = wlc;
    }

    public static swm a(wlc<swp> wlc) {
        return new swm(wlc);
    }

    public final /* synthetic */ Object get() {
        return (Flowable) vuf.a(((swp) this.a.get()).a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
