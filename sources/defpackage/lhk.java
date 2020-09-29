package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.queue.QueueManager;

/* renamed from: lhk reason: default package */
public final class lhk implements wig<hqm> {
    private final wzi<QueueManager> a;
    private final wzi<ujp> b;
    private final wzi<hqy> c;

    private lhk(wzi<QueueManager> wzi, wzi<ujp> wzi2, wzi<hqy> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static lhk a(wzi<QueueManager> wzi, wzi<ujp> wzi2, wzi<hqy> wzi3) {
        return new lhk(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return (hqm) wil.a(new hql((QueueManager) this.a.get(), (ujp) this.b.get(), (hqy) this.c.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
