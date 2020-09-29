package defpackage;

import com.spotify.mobile.android.spotlets.ads.model.Ad;
import com.spotify.mobile.android.util.ui.Lifecycle.a;
import io.reactivex.Flowable;

/* renamed from: tgz reason: default package */
public final class tgz implements wig<tgy> {
    private final wzi<Flowable<Ad>> a;
    private final wzi<a> b;

    private tgz(wzi<Flowable<Ad>> wzi, wzi<a> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static tgz a(wzi<Flowable<Ad>> wzi, wzi<a> wzi2) {
        return new tgz(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new tgy((Flowable) this.a.get(), (a) this.b.get());
    }
}
