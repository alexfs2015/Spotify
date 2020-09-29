package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;
import io.reactivex.Flowable;

/* renamed from: tmi reason: default package */
public final class tmi implements wig<tmh> {
    private final wzi<Flowable<tmm>> a;
    private final wzi<a> b;

    private tmi(wzi<Flowable<tmm>> wzi, wzi<a> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static tmi a(wzi<Flowable<tmm>> wzi, wzi<a> wzi2) {
        return new tmi(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new tmh((Flowable) this.a.get(), (a) this.b.get());
    }
}
