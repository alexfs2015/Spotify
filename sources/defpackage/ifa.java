package defpackage;

import com.spotify.mobile.android.spotlets.ads.model.Ad;
import io.reactivex.Flowable;

/* renamed from: ifa reason: default package */
public final class ifa implements vua<Flowable<Boolean>> {
    private final wlc<Flowable<Ad>> a;

    private ifa(wlc<Flowable<Ad>> wlc) {
        this.a = wlc;
    }

    public static ifa a(wlc<Flowable<Ad>> wlc) {
        return new ifa(wlc);
    }

    public final /* synthetic */ Object get() {
        return (Flowable) vuf.a(CC.a((Flowable) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
