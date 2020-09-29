package defpackage;

import android.content.Context;
import com.spotify.music.R;

/* renamed from: mpe reason: default package */
public final class mpe implements wig<gwm> {
    private final wzi<gxw> a;
    private final wzi<Context> b;
    private final wzi<a> c;
    private final wzi<jqh> d;
    private final wzi<szp> e;
    private final wzi<has> f;
    private final wzi<mpa> g;

    private mpe(wzi<gxw> wzi, wzi<Context> wzi2, wzi<a> wzi3, wzi<jqh> wzi4, wzi<szp> wzi5, wzi<has> wzi6, wzi<mpa> wzi7) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
        this.f = wzi6;
        this.g = wzi7;
    }

    public static mpe a(wzi<gxw> wzi, wzi<Context> wzi2, wzi<a> wzi3, wzi<jqh> wzi4, wzi<szp> wzi5, wzi<has> wzi6, wzi<mpa> wzi7) {
        mpe mpe = new mpe(wzi, wzi2, wzi3, wzi4, wzi5, wzi6, wzi7);
        return mpe;
    }

    public final /* synthetic */ Object get() {
        return (gwm) wil.a(((gxw) this.a.get()).a((Context) this.b.get(), (a) this.c.get()).a((jqh) this.d.get(), (szp) this.e.get(), (has) this.f.get()).a.a(R.id.daily_mix_hub_header, "daily-mix-hub:header", (mpa) this.g.get()).a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
