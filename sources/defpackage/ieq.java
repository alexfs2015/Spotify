package defpackage;

import android.content.Context;
import com.spotify.mobile.android.spotlets.ads.api.SlotApi;
import com.squareup.picasso.Picasso;
import io.reactivex.Scheduler;

/* renamed from: ieq reason: default package */
public final class ieq implements vua<iep> {
    private final wlc<Context> a;
    private final wlc<hxi> b;
    private final wlc<SlotApi> c;
    private final wlc<Picasso> d;
    private final wlc<idq> e;
    private final wlc<hzf> f;
    private final wlc<Scheduler> g;
    private final wlc<Scheduler> h;

    private ieq(wlc<Context> wlc, wlc<hxi> wlc2, wlc<SlotApi> wlc3, wlc<Picasso> wlc4, wlc<idq> wlc5, wlc<hzf> wlc6, wlc<Scheduler> wlc7, wlc<Scheduler> wlc8) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
        this.g = wlc7;
        this.h = wlc8;
    }

    public static ieq a(wlc<Context> wlc, wlc<hxi> wlc2, wlc<SlotApi> wlc3, wlc<Picasso> wlc4, wlc<idq> wlc5, wlc<hzf> wlc6, wlc<Scheduler> wlc7, wlc<Scheduler> wlc8) {
        ieq ieq = new ieq(wlc, wlc2, wlc3, wlc4, wlc5, wlc6, wlc7, wlc8);
        return ieq;
    }

    public final /* synthetic */ Object get() {
        iep iep = new iep((Context) this.a.get(), (hxi) this.b.get(), (SlotApi) this.c.get(), vtz.b(this.d), (idq) this.e.get(), (hzf) this.f.get(), (Scheduler) this.g.get(), (Scheduler) this.h.get());
        return iep;
    }
}
