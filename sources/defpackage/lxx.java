package defpackage;

import com.squareup.picasso.Picasso;

/* renamed from: lxx reason: default package */
public final class lxx implements wig<lxw> {
    private final wzi<Picasso> a;
    private final wzi<hhc> b;

    private lxx(wzi<Picasso> wzi, wzi<hhc> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static lxx a(wzi<Picasso> wzi, wzi<hhc> wzi2) {
        return new lxx(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new lxw(this.a, this.b);
    }
}
