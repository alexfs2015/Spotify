package defpackage;

import com.spotify.music.features.yourlibrary.musicpages.MusicPagesLogger;

/* renamed from: qzy reason: default package */
public final class qzy implements vua<qzx> {
    private final wlc<qsr> a;
    private final wlc<MusicPagesLogger> b;
    private final wlc<jmq> c;
    private final wlc<jmg> d;
    private final wlc<jne> e;
    private final wlc<sih> f;

    private qzy(wlc<qsr> wlc, wlc<MusicPagesLogger> wlc2, wlc<jmq> wlc3, wlc<jmg> wlc4, wlc<jne> wlc5, wlc<sih> wlc6) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
    }

    public static qzy a(wlc<qsr> wlc, wlc<MusicPagesLogger> wlc2, wlc<jmq> wlc3, wlc<jmg> wlc4, wlc<jne> wlc5, wlc<sih> wlc6) {
        qzy qzy = new qzy(wlc, wlc2, wlc3, wlc4, wlc5, wlc6);
        return qzy;
    }

    public final /* synthetic */ Object get() {
        qzx qzx = new qzx((qsr) this.a.get(), (MusicPagesLogger) this.b.get(), (jmq) this.c.get(), (jmg) this.d.get(), (jne) this.e.get(), (sih) this.f.get());
        return qzx;
    }
}
