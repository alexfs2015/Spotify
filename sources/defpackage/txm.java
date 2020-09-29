package defpackage;

import com.squareup.picasso.Picasso;

/* renamed from: txm reason: default package */
public final class txm implements wig<txl> {
    private final wzi<Picasso> a;
    private final wzi<txn> b;

    private txm(wzi<Picasso> wzi, wzi<txn> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static txm a(wzi<Picasso> wzi, wzi<txn> wzi2) {
        return new txm(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new txl((Picasso) this.a.get(), (txn) this.b.get());
    }
}
