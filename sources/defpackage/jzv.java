package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerFactory;
import io.reactivex.Scheduler;

/* renamed from: jzv reason: default package */
public final class jzv implements wig<jzu> {
    private final wzi<gix> a;
    private final wzi<Scheduler> b;
    private final wzi<tmu> c;
    private final wzi<PlayerFactory> d;

    private jzv(wzi<gix> wzi, wzi<Scheduler> wzi2, wzi<tmu> wzi3, wzi<PlayerFactory> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static jzv a(wzi<gix> wzi, wzi<Scheduler> wzi2, wzi<tmu> wzi3, wzi<PlayerFactory> wzi4) {
        return new jzv(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return new jzu((gix) this.a.get(), (Scheduler) this.b.get(), (tmu) this.c.get(), (PlayerFactory) this.d.get());
    }
}
