package defpackage;

import com.squareup.picasso.Picasso;

/* renamed from: rcg reason: default package */
public final class rcg implements wig<rcf> {
    private final wzi<rik> a;
    private final wzi<Picasso> b;
    private final wzi<rim> c;

    private rcg(wzi<rik> wzi, wzi<Picasso> wzi2, wzi<rim> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static rcg a(wzi<rik> wzi, wzi<Picasso> wzi2, wzi<rim> wzi3) {
        return new rcg(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new rcf((rik) this.a.get(), (Picasso) this.b.get(), (rim) this.c.get());
    }
}
