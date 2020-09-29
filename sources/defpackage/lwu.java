package defpackage;

import com.squareup.picasso.Picasso;

/* renamed from: lwu reason: default package */
public final class lwu implements wig<lwt> {
    private final wzi<ujc> a;
    private final wzi<Picasso> b;

    private lwu(wzi<ujc> wzi, wzi<Picasso> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static lwu a(wzi<ujc> wzi, wzi<Picasso> wzi2) {
        return new lwu(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new lwt((ujc) this.a.get(), (Picasso) this.b.get());
    }
}
