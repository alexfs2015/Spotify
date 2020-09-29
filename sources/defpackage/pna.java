package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.queue.QueueManager;

/* renamed from: pna reason: default package */
public final class pna implements vua<pmz> {
    private final wlc<QueueManager> a;
    private final wlc<pmt> b;
    private final wlc<pnd> c;
    private final wlc<pmx> d;
    private final wlc<hec> e;

    public static pmz a(QueueManager queueManager, pmt pmt, Object obj, Object obj2, hec hec) {
        pmz pmz = new pmz(queueManager, pmt, (pnd) obj, (pmx) obj2, hec);
        return pmz;
    }

    public final /* synthetic */ Object get() {
        pmz pmz = new pmz((QueueManager) this.a.get(), (pmt) this.b.get(), (pnd) this.c.get(), (pmx) this.d.get(), (hec) this.e.get());
        return pmz;
    }
}
