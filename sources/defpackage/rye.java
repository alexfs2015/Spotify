package defpackage;

import com.spotify.mobile.android.connect.ConnectManager;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import io.reactivex.Flowable;
import io.reactivex.Scheduler;

/* renamed from: rye reason: default package */
public final class rye implements wig<ryd> {
    private final wzi<ConnectManager> a;
    private final wzi<Scheduler> b;
    private final wzi<Flowable<PlayerState>> c;
    private final wzi<rze> d;

    private rye(wzi<ConnectManager> wzi, wzi<Scheduler> wzi2, wzi<Flowable<PlayerState>> wzi3, wzi<rze> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static rye a(wzi<ConnectManager> wzi, wzi<Scheduler> wzi2, wzi<Flowable<PlayerState>> wzi3, wzi<rze> wzi4) {
        return new rye(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return new ryd((ConnectManager) this.a.get(), (Scheduler) this.b.get(), (Flowable) this.c.get(), (rze) this.d.get());
    }
}
