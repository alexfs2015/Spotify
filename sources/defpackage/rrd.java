package defpackage;

import io.reactivex.disposables.Disposables;

/* renamed from: rrd reason: default package */
public final class rrd implements c {
    private final wlc<rrb> a;
    private rrb b;

    public final String c() {
        return "SocialErrorNotifier";
    }

    public rrd(wlc<rrb> wlc) {
        this.a = wlc;
    }

    public final void ai_() {
        this.b = (rrb) this.a.get();
        this.b.a();
    }

    public final void aj_() {
        rrb rrb = this.b;
        if (rrb != null) {
            rrb.a.a(Disposables.a());
            this.b = null;
        }
    }
}
