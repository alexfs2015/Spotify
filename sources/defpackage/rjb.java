package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.squareup.picasso.Picasso;
import io.reactivex.Flowable;
import io.reactivex.Scheduler;

/* renamed from: rjb reason: default package */
public final class rjb implements vua<rja> {
    private final wlc<Picasso> a;
    private final wlc<Flowable<PlayerState>> b;
    private final wlc<Scheduler> c;
    private final wlc<a> d;

    private rjb(wlc<Picasso> wlc, wlc<Flowable<PlayerState>> wlc2, wlc<Scheduler> wlc3, wlc<a> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static rjb a(wlc<Picasso> wlc, wlc<Flowable<PlayerState>> wlc2, wlc<Scheduler> wlc3, wlc<a> wlc4) {
        return new rjb(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return new rja((Picasso) this.a.get(), (Flowable) this.b.get(), (Scheduler) this.c.get(), (a) this.d.get());
    }
}
