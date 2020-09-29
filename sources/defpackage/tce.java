package defpackage;

import com.spotify.music.nowplaying.core.immersive.ImmersiveMode;
import io.reactivex.Flowable;

/* renamed from: tce reason: default package */
public final class tce {
    private final tdl a;
    private final tmc b;
    private final tdd c;
    private final tcc d;
    private final tdh e;

    public tce(tdl tdl, tdd tdd, tmc tmc, tcc tcc, tdh tdh) {
        this.a = tdl;
        this.c = tdd;
        this.b = tmc;
        this.d = tcc;
        this.e = tdh;
    }

    public final void a(tks tks, tdq tdq) {
        Flowable b2 = tks.b();
        Flowable e2 = tdq.e();
        vcw a2 = this.c.a(b2, e2);
        this.a.a(e2).a(tks);
        this.d.a(tdq);
        this.e.a(tdq.d()).a.run();
        this.b.a((vcz<ImmersiveMode>) a2);
    }
}
