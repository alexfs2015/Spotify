package defpackage;

import com.spotify.music.newplaying.scroll.NowPlayingWidget.Type;
import com.squareup.picasso.Picasso;

/* renamed from: sup reason: default package */
public final class sup implements vua<suo> {
    private final wlc<svd> a;
    private final wlc<ssa> b;
    private final wlc<Picasso> c;
    private final wlc<Type> d;

    private sup(wlc<svd> wlc, wlc<ssa> wlc2, wlc<Picasso> wlc3, wlc<Type> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static sup a(wlc<svd> wlc, wlc<ssa> wlc2, wlc<Picasso> wlc3, wlc<Type> wlc4) {
        return new sup(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return new suo((svd) this.a.get(), (ssa) this.b.get(), (Picasso) this.c.get(), (Type) this.d.get());
    }
}
