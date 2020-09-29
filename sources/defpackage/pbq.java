package defpackage;

import android.content.Context;
import com.squareup.picasso.Picasso;

/* renamed from: pbq reason: default package */
public final class pbq implements wig<pbp> {
    private final wzi<Picasso> a;
    private final wzi<Context> b;
    private final wzi<pbk> c;
    private final wzi<jzn> d;
    private final wzi<a> e;

    private pbq(wzi<Picasso> wzi, wzi<Context> wzi2, wzi<pbk> wzi3, wzi<jzn> wzi4, wzi<a> wzi5) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
    }

    public static pbq a(wzi<Picasso> wzi, wzi<Context> wzi2, wzi<pbk> wzi3, wzi<jzn> wzi4, wzi<a> wzi5) {
        pbq pbq = new pbq(wzi, wzi2, wzi3, wzi4, wzi5);
        return pbq;
    }

    public final /* synthetic */ Object get() {
        pbp pbp = new pbp(this.a, this.b, this.c, this.d, this.e);
        return pbp;
    }
}
