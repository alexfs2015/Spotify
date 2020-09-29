package defpackage;

import com.spotify.music.newplaying.scroll.flags.NowPlayingWidgetDebugDataSourceFlag;

/* renamed from: ssq reason: default package */
public final class ssq implements vua<ssn> {
    private final wlc<fpt> a;
    private final wlc<ssl> b;
    private final wlc<ssj> c;

    private ssq(wlc<fpt> wlc, wlc<ssl> wlc2, wlc<ssj> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static ssq a(wlc<fpt> wlc, wlc<ssl> wlc2, wlc<ssj> wlc3) {
        return new ssq(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        Object obj = (ssl) this.b.get();
        Object obj2 = (ssj) this.c.get();
        if (((fpt) this.a.get()).a(ssv.a) != NowPlayingWidgetDebugDataSourceFlag.CONTROL) {
            obj = obj2;
        }
        return (ssn) vuf.a(obj, "Cannot return null from a non-@Nullable @Provides method");
    }
}
