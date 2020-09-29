package defpackage;

import com.spotify.mobile.android.spotlets.ads.model.Ad;
import io.reactivex.Flowable;

/* renamed from: tgt reason: default package */
public final class tgt implements wig<Flowable<Ad>> {
    private final wzi<tgw> a;

    private tgt(wzi<tgw> wzi) {
        this.a = wzi;
    }

    public static tgt a(wzi<tgw> wzi) {
        return new tgt(wzi);
    }

    public final /* synthetic */ Object get() {
        return (Flowable) wil.a(((tgw) this.a.get()).a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
