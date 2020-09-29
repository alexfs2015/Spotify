package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;
import io.reactivex.Flowable;

/* renamed from: vcp reason: default package */
public final class vcp implements wig<vco> {
    private final wzi<Flowable<Boolean>> a;
    private final wzi<a> b;

    private vcp(wzi<Flowable<Boolean>> wzi, wzi<a> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static vcp a(wzi<Flowable<Boolean>> wzi, wzi<a> wzi2) {
        return new vcp(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new vco((Flowable) this.a.get(), (a) this.b.get());
    }
}
