package defpackage;

import android.content.Context;
import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.music.features.yourlibrary.container.YourLibraryPrefs;

/* renamed from: rad reason: default package */
public final class rad implements wig<YourLibraryPrefs> {
    private final wzi<qzx> a;
    private final wzi<Context> b;
    private final wzi<jtz> c;
    private final wzi<rwl> d;
    private final wzi<jyg> e;
    private final wzi<raf> f;
    private final wzi<a> g;

    private rad(wzi<qzx> wzi, wzi<Context> wzi2, wzi<jtz> wzi3, wzi<rwl> wzi4, wzi<jyg> wzi5, wzi<raf> wzi6, wzi<a> wzi7) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
        this.f = wzi6;
        this.g = wzi7;
    }

    public static rad a(wzi<qzx> wzi, wzi<Context> wzi2, wzi<jtz> wzi3, wzi<rwl> wzi4, wzi<jyg> wzi5, wzi<raf> wzi6, wzi<a> wzi7) {
        rad rad = new rad(wzi, wzi2, wzi3, wzi4, wzi5, wzi6, wzi7);
        return rad;
    }

    public final /* synthetic */ Object get() {
        YourLibraryPrefs yourLibraryPrefs = new YourLibraryPrefs((qzx) this.a.get(), (Context) this.b.get(), (jtz) this.c.get(), (rwl) this.d.get(), (jyg) this.e.get(), (raf) this.f.get(), (a) this.g.get());
        return yourLibraryPrefs;
    }
}
