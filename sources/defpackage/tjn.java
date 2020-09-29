package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;
import io.reactivex.Flowable;

/* renamed from: tjn reason: default package */
public final class tjn implements wig<tjm> {
    private final wzi<Flowable<tjl>> a;
    private final wzi<a> b;

    private tjn(wzi<Flowable<tjl>> wzi, wzi<a> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static tjn a(wzi<Flowable<tjl>> wzi, wzi<a> wzi2) {
        return new tjn(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new tjm((Flowable) this.a.get(), (a) this.b.get());
    }
}
