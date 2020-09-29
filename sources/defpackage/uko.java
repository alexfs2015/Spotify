package defpackage;

import android.content.Context;
import com.spotify.music.navigation.NavigationManager;

/* renamed from: uko reason: default package */
public final class uko implements vua<snp> {
    private final wlc<NavigationManager> a;
    private final wlc<Context> b;
    private final wlc<spi> c;
    private final wlc<wud<Long>> d;
    private final wlc<tcn> e;

    private uko(wlc<NavigationManager> wlc, wlc<Context> wlc2, wlc<spi> wlc3, wlc<wud<Long>> wlc4, wlc<tcn> wlc5) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
    }

    public static uko a(wlc<NavigationManager> wlc, wlc<Context> wlc2, wlc<spi> wlc3, wlc<wud<Long>> wlc4, wlc<tcn> wlc5) {
        uko uko = new uko(wlc, wlc2, wlc3, wlc4, wlc5);
        return uko;
    }

    public final /* synthetic */ Object get() {
        sno sno = new sno((NavigationManager) this.a.get(), (Context) this.b.get(), (spi) this.c.get(), (wud) this.d.get(), (tcn) this.e.get());
        return (snp) vuf.a(sno, "Cannot return null from a non-@Nullable @Provides method");
    }
}
