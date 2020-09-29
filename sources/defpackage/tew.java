package defpackage;

import com.spotify.music.newplaying.scroll.NowPlayingWidget.Type;
import com.squareup.picasso.Picasso;

/* renamed from: tew reason: default package */
public final class tew implements wig<tev> {
    private final wzi<tfk> a;
    private final wzi<tch> b;
    private final wzi<Picasso> c;
    private final wzi<Type> d;

    private tew(wzi<tfk> wzi, wzi<tch> wzi2, wzi<Picasso> wzi3, wzi<Type> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static tew a(wzi<tfk> wzi, wzi<tch> wzi2, wzi<Picasso> wzi3, wzi<Type> wzi4) {
        return new tew(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return new tev((tfk) this.a.get(), (tch) this.b.get(), (Picasso) this.c.get(), (Type) this.d.get());
    }
}
