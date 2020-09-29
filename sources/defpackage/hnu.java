package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.queue.QueueManager;

/* renamed from: hnu reason: default package */
public final class hnu implements vua<hok> {
    private final wlc<QueueManager> a;
    private final wlc<txm> b;
    private final wlc<hou> c;

    private hnu(wlc<QueueManager> wlc, wlc<txm> wlc2, wlc<hou> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static hnu a(wlc<QueueManager> wlc, wlc<txm> wlc2, wlc<hou> wlc3) {
        return new hnu(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return (hok) vuf.a(new hoj((QueueManager) this.a.get(), (txm) this.b.get(), (hou) this.c.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
