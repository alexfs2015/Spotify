package defpackage;

import com.squareup.picasso.Picasso;

/* renamed from: uca reason: default package */
public final class uca implements wig<ubz> {
    private final wzi<Picasso> a;

    private uca(wzi<Picasso> wzi) {
        this.a = wzi;
    }

    public static uca a(wzi<Picasso> wzi) {
        return new uca(wzi);
    }

    public final /* synthetic */ Object get() {
        return new ubz((Picasso) this.a.get());
    }
}
