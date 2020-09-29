package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;
import io.reactivex.Flowable;

/* renamed from: tjc reason: default package */
public final class tjc implements wig<tjb> {
    private final wzi<Flowable<Integer>> a;
    private final wzi<a> b;

    private tjc(wzi<Flowable<Integer>> wzi, wzi<a> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static tjc a(wzi<Flowable<Integer>> wzi, wzi<a> wzi2) {
        return new tjc(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new tjb((Flowable) this.a.get(), (a) this.b.get());
    }
}
