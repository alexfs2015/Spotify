package defpackage;

import com.spotify.music.nowplaying.core.immersive.ImmersiveMode;
import io.reactivex.Flowable;

/* renamed from: srx reason: default package */
public final class srx {
    private final ste a;
    private final tbv b;
    private final ssw c;
    private final srv d;
    private final sta e;

    public srx(ste ste, ssw ssw, tbv tbv, srv srv, sta sta) {
        this.a = ste;
        this.c = ssw;
        this.b = tbv;
        this.d = srv;
        this.e = sta;
    }

    public final void a(tal tal, stj stj) {
        Flowable b2 = tal.b();
        Flowable e2 = stj.e();
        urr a2 = this.c.a(b2, e2);
        this.a.a(e2).a(tal);
        this.d.a(stj);
        this.e.a(stj.d()).a.run();
        this.b.a((uru<ImmersiveMode>) a2);
    }
}
