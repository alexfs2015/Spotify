package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;
import io.reactivex.Scheduler;

/* renamed from: uhr reason: default package */
public final class uhr implements wig<uhq> {
    private final wzi<uhs> a;
    private final wzi<a> b;
    private final wzi<Scheduler> c;

    private uhr(wzi<uhs> wzi, wzi<a> wzi2, wzi<Scheduler> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static uhr a(wzi<uhs> wzi, wzi<a> wzi2, wzi<Scheduler> wzi3) {
        return new uhr(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new uhq((uhs) this.a.get(), (a) this.b.get(), (Scheduler) this.c.get());
    }
}
