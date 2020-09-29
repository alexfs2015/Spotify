package defpackage;

import android.content.Context;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import io.reactivex.Flowable;
import io.reactivex.Scheduler;

/* renamed from: rtd reason: default package */
public final class rtd implements vua<rtc> {
    private final wlc<Context> a;
    private final wlc<hpg> b;
    private final wlc<Scheduler> c;
    private final wlc<Scheduler> d;
    private final wlc<Flowable<PlayerState>> e;
    private final wlc<tjv> f;

    private rtd(wlc<Context> wlc, wlc<hpg> wlc2, wlc<Scheduler> wlc3, wlc<Scheduler> wlc4, wlc<Flowable<PlayerState>> wlc5, wlc<tjv> wlc6) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
    }

    public static rtd a(wlc<Context> wlc, wlc<hpg> wlc2, wlc<Scheduler> wlc3, wlc<Scheduler> wlc4, wlc<Flowable<PlayerState>> wlc5, wlc<tjv> wlc6) {
        rtd rtd = new rtd(wlc, wlc2, wlc3, wlc4, wlc5, wlc6);
        return rtd;
    }

    public final /* synthetic */ Object get() {
        rtc rtc = new rtc((Context) this.a.get(), (hpg) this.b.get(), (Scheduler) this.c.get(), (Scheduler) this.d.get(), (Flowable) this.e.get(), (tjv) this.f.get());
        return rtc;
    }
}
