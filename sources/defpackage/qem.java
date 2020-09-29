package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;
import io.reactivex.Scheduler;

/* renamed from: qem reason: default package */
public final class qem implements wig<qel> {
    private final wzi<Scheduler> a;
    private final wzi<a> b;
    private final wzi<vll> c;
    private final wzi<qep> d;

    private qem(wzi<Scheduler> wzi, wzi<a> wzi2, wzi<vll> wzi3, wzi<qep> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static qem a(wzi<Scheduler> wzi, wzi<a> wzi2, wzi<vll> wzi3, wzi<qep> wzi4) {
        return new qem(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return new qel((Scheduler) this.a.get(), (a) this.b.get(), (vll) this.c.get(), (qep) this.d.get());
    }
}
