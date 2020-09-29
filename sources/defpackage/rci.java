package defpackage;

import android.content.Context;
import com.squareup.picasso.Picasso;

/* renamed from: rci reason: default package */
public final class rci implements wig<rch> {
    private final wzi<Context> a;
    private final wzi<Picasso> b;
    private final wzi<rim> c;
    private final wzi<ujc> d;
    private final wzi<rio> e;
    private final wzi<rfd> f;

    private rci(wzi<Context> wzi, wzi<Picasso> wzi2, wzi<rim> wzi3, wzi<ujc> wzi4, wzi<rio> wzi5, wzi<rfd> wzi6) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
        this.f = wzi6;
    }

    public static rci a(wzi<Context> wzi, wzi<Picasso> wzi2, wzi<rim> wzi3, wzi<ujc> wzi4, wzi<rio> wzi5, wzi<rfd> wzi6) {
        rci rci = new rci(wzi, wzi2, wzi3, wzi4, wzi5, wzi6);
        return rci;
    }

    public final /* synthetic */ Object get() {
        rch rch = new rch((Context) this.a.get(), (Picasso) this.b.get(), (rim) this.c.get(), (ujc) this.d.get(), (rio) this.e.get(), (rfd) this.f.get());
        return rch;
    }
}
