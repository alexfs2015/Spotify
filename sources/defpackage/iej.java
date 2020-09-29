package defpackage;

import com.squareup.picasso.Picasso;

/* renamed from: iej reason: default package */
public final class iej implements wig<iei> {
    private final wzi<Picasso> a;
    private final wzi<ied> b;

    private iej(wzi<Picasso> wzi, wzi<ied> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static iej a(wzi<Picasso> wzi, wzi<ied> wzi2) {
        return new iej(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new iei(wif.b(this.a), (ied) this.b.get());
    }
}
