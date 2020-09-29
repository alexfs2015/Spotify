package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.queue.QueueManager;

/* renamed from: puf reason: default package */
public final class puf implements wig<pue> {
    private final wzi<Player> a;
    private final wzi<pud> b;
    private final wzi<QueueManager> c;
    private final wzi<pvg> d;
    private final wzi<xil> e;

    private puf(wzi<Player> wzi, wzi<pud> wzi2, wzi<QueueManager> wzi3, wzi<pvg> wzi4, wzi<xil> wzi5) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
    }

    public static puf a(wzi<Player> wzi, wzi<pud> wzi2, wzi<QueueManager> wzi3, wzi<pvg> wzi4, wzi<xil> wzi5) {
        puf puf = new puf(wzi, wzi2, wzi3, wzi4, wzi5);
        return puf;
    }

    public final /* synthetic */ Object get() {
        pue pue = new pue((Player) this.a.get(), (pud) this.b.get(), (QueueManager) this.c.get(), (pvg) this.d.get(), (xil) this.e.get());
        return pue;
    }
}
