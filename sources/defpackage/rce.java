package defpackage;

import android.content.Context;
import com.squareup.picasso.Picasso;

/* renamed from: rce reason: default package */
public final class rce implements wig<rcd> {
    private final wzi<rbg> a;
    private final wzi<Context> b;
    private final wzi<Picasso> c;
    private final wzi<rim> d;
    private final wzi<rio> e;

    private rce(wzi<rbg> wzi, wzi<Context> wzi2, wzi<Picasso> wzi3, wzi<rim> wzi4, wzi<rio> wzi5) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
    }

    public static rce a(wzi<rbg> wzi, wzi<Context> wzi2, wzi<Picasso> wzi3, wzi<rim> wzi4, wzi<rio> wzi5) {
        rce rce = new rce(wzi, wzi2, wzi3, wzi4, wzi5);
        return rce;
    }

    public final /* synthetic */ Object get() {
        rcd rcd = new rcd((rbg) this.a.get(), (Context) this.b.get(), (Picasso) this.c.get(), (rim) this.d.get(), (rio) this.e.get());
        return rcd;
    }
}
