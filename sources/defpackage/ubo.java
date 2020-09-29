package defpackage;

import android.content.Context;
import com.squareup.picasso.Picasso;

/* renamed from: ubo reason: default package */
public final class ubo implements vua<ubn> {
    private final wlc<Context> a;
    private final wlc<jwv> b;
    private final wlc<Picasso> c;
    private final wlc<ubr> d;

    private ubo(wlc<Context> wlc, wlc<jwv> wlc2, wlc<Picasso> wlc3, wlc<ubr> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static ubo a(wlc<Context> wlc, wlc<jwv> wlc2, wlc<Picasso> wlc3, wlc<ubr> wlc4) {
        return new ubo(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return new ubn((Context) this.a.get(), (jwv) this.b.get(), (Picasso) this.c.get(), (ubr) this.d.get());
    }
}
