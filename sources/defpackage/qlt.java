package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;
import io.reactivex.Scheduler;

/* renamed from: qlt reason: default package */
public final class qlt implements vua<qls> {
    private final wlc<qlu> a;
    private final wlc<qhu> b;
    private final wlc<Scheduler> c;
    private final wlc<qlo> d;
    private final wlc<a> e;

    private qlt(wlc<qlu> wlc, wlc<qhu> wlc2, wlc<Scheduler> wlc3, wlc<qlo> wlc4, wlc<a> wlc5) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
    }

    public static qlt a(wlc<qlu> wlc, wlc<qhu> wlc2, wlc<Scheduler> wlc3, wlc<qlo> wlc4, wlc<a> wlc5) {
        qlt qlt = new qlt(wlc, wlc2, wlc3, wlc4, wlc5);
        return qlt;
    }

    public final /* synthetic */ Object get() {
        qls qls = new qls((qlu) this.a.get(), (qhu) this.b.get(), (Scheduler) this.c.get(), (qlo) this.d.get(), (a) this.e.get());
        return qls;
    }
}
