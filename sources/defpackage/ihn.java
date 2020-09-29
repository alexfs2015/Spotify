package defpackage;

import com.spotify.mobile.android.spotlets.ads.model.Ad;
import io.reactivex.Flowable;

/* renamed from: ihn reason: default package */
public final class ihn implements wig<Flowable<Boolean>> {
    private final wzi<Flowable<Ad>> a;

    private ihn(wzi<Flowable<Ad>> wzi) {
        this.a = wzi;
    }

    public static ihn a(wzi<Flowable<Ad>> wzi) {
        return new ihn(wzi);
    }

    public final /* synthetic */ Object get() {
        return (Flowable) wil.a(CC.a((Flowable) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
