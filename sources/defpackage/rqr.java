package defpackage;

import com.squareup.picasso.Picasso;

/* renamed from: rqr reason: default package */
public final class rqr implements wig<rqq> {
    private final wzi<rqw> a;
    private final wzi<Picasso> b;

    private rqr(wzi<rqw> wzi, wzi<Picasso> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static rqr a(wzi<rqw> wzi, wzi<Picasso> wzi2) {
        return new rqr(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new rqq((rqw) this.a.get(), (Picasso) this.b.get());
    }
}
