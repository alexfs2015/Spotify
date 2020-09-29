package defpackage;

import com.squareup.picasso.Picasso;

/* renamed from: gzm reason: default package */
public final class gzm implements wig<gzl> {
    private final wzi<Picasso> a;

    private gzm(wzi<Picasso> wzi) {
        this.a = wzi;
    }

    public static gzm a(wzi<Picasso> wzi) {
        return new gzm(wzi);
    }

    public final /* synthetic */ Object get() {
        return new gzl((Picasso) this.a.get());
    }
}
