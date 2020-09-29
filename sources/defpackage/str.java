package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import io.reactivex.Flowable;

/* renamed from: str reason: default package */
public final class str implements vua<stq> {
    private final wlc<Flowable<PlayerTrack>> a;
    private final wlc<kro> b;
    private final wlc<ksc> c;
    private final wlc<ksf> d;
    private final wlc<wug> e;

    private str(wlc<Flowable<PlayerTrack>> wlc, wlc<kro> wlc2, wlc<ksc> wlc3, wlc<ksf> wlc4, wlc<wug> wlc5) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
    }

    public static str a(wlc<Flowable<PlayerTrack>> wlc, wlc<kro> wlc2, wlc<ksc> wlc3, wlc<ksf> wlc4, wlc<wug> wlc5) {
        str str = new str(wlc, wlc2, wlc3, wlc4, wlc5);
        return str;
    }

    public final /* synthetic */ Object get() {
        stq stq = new stq((Flowable) this.a.get(), (kro) this.b.get(), (ksc) this.c.get(), (ksf) this.d.get(), (wug) this.e.get());
        return stq;
    }
}
