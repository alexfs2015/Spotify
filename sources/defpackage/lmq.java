package defpackage;

import com.squareup.picasso.Picasso;

/* renamed from: lmq reason: default package */
public final class lmq implements wig<Picasso> {
    private final wzi<vhj> a;

    private lmq(wzi<vhj> wzi) {
        this.a = wzi;
    }

    public static lmq a(wzi<vhj> wzi) {
        return new lmq(wzi);
    }

    public final /* synthetic */ Object get() {
        return (Picasso) wil.a(((vhj) this.a.get()).a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
